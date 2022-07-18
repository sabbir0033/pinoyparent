package pinoyParent.reusable;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import testbase.DriverFactory;


public class ListenersImplementation implements ITestListener{

	JiraOperations jiraOps = new JiraOperations();
	static ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		//before each test case

		test = report.createTest((result.getTestClass().getName()+" -- ").concat(result.getMethod().getMethodName())).assignAuthor("Sabbir");
		ExtentFactory.getInstance().setExtent(test);
	}

	public void onTestSuccess(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.PASS, "Test Case: "+result.getMethod().getMethodName()+ " is Passed.");
		ExtentFactory.getInstance().removeExtentObject();
	}

	public void onTestFailure(ITestResult result) {
		
		WebDriver driver = null;
		
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ " is Failed.");
		ExtentFactory.getInstance().getExtent().log(Status.FAIL, result.getThrowable());
		
		
		Object testObject = result.getInstance();
		Class classs = result.getTestClass().getRealClass();
		
		
		try {
			driver = (WebDriver) classs.getField("driver").get(testObject);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		
//		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Test Case: "+result.getMethod().getMethodName()+ " is Failed.");
//		ExtentFactory.getInstance().getExtent().log(Status.FAIL, result.getThrowable());
//
		//add screenshot for failed test.
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date = new Date();
		String actualDate = format.format(date);

		String screenshotPath = System.getProperty("user.dir")+
				"/Reports/Screenshots/"+result.getMethod().getMethodName()+"_"+actualDate+".png";
		File dest = new File(screenshotPath);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ExtentFactory.getInstance().getExtent().addScreenCaptureFromPath(screenshotPath, "Test case failure screenshot");
		ExtentFactory.getInstance().removeExtentObject();
		
		
		
		///////JIRA defect creation part
		String automaticJIRAcreation = PropertiesOperations.getPropertyValueByKey("automatic_Issue_Creation_In_JIRA");
		if(automaticJIRAcreation.trim().equalsIgnoreCase("ON")) {
			String issueS = "Automation Test Failed - "+result.getMethod().getMethodName();
			String issueD = result.getThrowable().getMessage();
//			issueD.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			String issueNumber = null;
			try {
				issueNumber = jiraOps.createJiraIssue("PP", issueS, issueD, "10262", "3", "Issue", "Automation Test"); // 5f06e974502ce1001de14949
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				jiraOps.addAttachmentToJiraIssue(issueNumber, screenshotPath);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		

	}

	public void onTestSkipped(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.SKIP, "Test Case: "+result.getMethod().getMethodName()+ " is skipped.");
		ExtentFactory.getInstance().removeExtentObject();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		try {
			report = ExtentReportNG.setupExtentReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		//close extent
		report.flush();
	}	   
}
