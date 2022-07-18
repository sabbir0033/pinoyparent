package pinoyParent.functionalities;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import pinoyParent.reusable.PropertiesOperations;
import pinoyParent.testCases.BaseClass;
import pinoyParent.utilities.Utility;

public class Profile extends BaseClass{
	
	static String phoneNumber = PropertiesOperations.getInputValueByKey("phoneNumber");
	static String dob = PropertiesOperations.getInputValueByKey("dob");
	static String childName = PropertiesOperations.getInputValueByKey("childName");
	static String updatePhoneNumber = PropertiesOperations.getInputValueByKey("updatePhoneNumber");
	static String updateChildName = PropertiesOperations.getInputValueByKey("updateChildName");


	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

	public static void profileView() throws InterruptedException {
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Thread.sleep(5000);
					WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Profile")));
					Thread.sleep(2000);
					if(el2.isDisplayed() == true) {
						Assert.assertTrue(true);
					}
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Profile not found!. -- ");
		}
	}

	public static void profileInfoUpdate() throws InterruptedException {
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")));
		el1.click();

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]")));
		el3.click();

		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Personal Info\nName:\nEmail:\nPhone Number:\nMarital Status:\nPersonal Info\nProfession:\nLocation:\nEducation:\nChildren Info\"]/android.widget.EditText[3]")));
		el4.click();
		Thread.sleep(3000);

		el4.sendKeys(phoneNumber);
		Thread.sleep(1000);
		driver.navigate().back();

		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Date of Birth")));
		el5.click();

		WebElement el6 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Switch to input")));
		el6.click();

		WebElement el7 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.widget.EditText[@index=\"1\"])")));
		Thread.sleep(1000);
		el7.sendKeys(dob);
		Thread.sleep(1000);

		WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
		el8.click();

		WebElement el9 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Gender")));
		el9.click();

		WebElement el10 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Male")));
		el10.click();

		WebElement el11 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Marital Status")));
		el11.click();

		WebElement el12 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Married")));
		el12.click();

		Utility.scroll();
		Thread.sleep(1000);

		WebElement el13 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Industry")));
		el13.click();

		WebElement el14 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Computer and technology")));
		el14.click();

		WebElement el15 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Region")));
		el15.click();

		WebElement el16 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("National Capital Region")));
		el16.click();

		WebElement el17 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Educational Attainment")));
		el17.click();

		WebElement el18 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Masters Degree")));
		el18.click();
		
		Thread.sleep(2000);
		WebElement el19 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Add Children")));
		el19.click();
		Thread.sleep(1000);

		WebElement el20 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText")));
		el20.click();
		Thread.sleep(1000);
		el20.sendKeys(childName);

		WebElement el21 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Age Range")));
		el21.click();

		WebElement el22 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("1 to 2 years")));
		el22.click();

		WebElement el23 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Gender")));
		el23.click();

		WebElement el24 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Male")));
		el24.click();

		WebElement el25 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("ACCEPT")));
		el25.click();
		Thread.sleep(1000);

		Utility.scroll();

		WebElement el26 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Submit")));


		try {
			boolean bst = Utility.isClickable(el26);
			System.out.println(bst);
			try {
				if(bst == true) {
					el26.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Profile not updated!. -- ");
		}

		Thread.sleep(3000);
	}


	public static void profileInfoEdit() throws InterruptedException {

		Thread.sleep(2000);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")));
		el1.click();

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]")));
		el3.click();
		Thread.sleep(4000);
		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Personal Info\nName:\nEmail:\nPhone Number:\nMarital Status:\nPersonal Info\nProfession:\nLocation:\nEducation:\nChildren Info\"]/android.widget.EditText[3]")));
		el4.click();
		Thread.sleep(1000);

		if(el4.getText() != "") {
			el4.sendKeys(Keys.CLEAR);
		}

		Thread.sleep(2000);
		el4.sendKeys(updatePhoneNumber);
		Thread.sleep(1000);
		driver.navigate().back();

		Utility.scroll();
		Thread.sleep(3000);

		WebElement el19 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Name: C2\nGender: Male")));
		el19.click();
		Thread.sleep(1000);

		WebElement el20 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText")));
		el20.click();
		Thread.sleep(4000);

		if(el20.getText() != "") {
			el20.sendKeys(Keys.CLEAR);
		}

		Thread.sleep(2000);
		el20.sendKeys(updateChildName);

		WebElement el25 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("ACCEPT")));
		el25.click();
		Thread.sleep(1000);

		Utility.scroll();

		WebElement el26 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Submit")));


		try {
			boolean bst = Utility.isClickable(el26);
			System.out.println(bst);
			try {
				if(bst == true) {
					el26.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Profile not edited!. -- ");
		}
		Thread.sleep(3000);
	}


	public static void profileInfoUpdateWithEmptyChildInfo() throws InterruptedException {
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")));
		el1.click();

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView[2]")));
		el3.click();

		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Personal Info\nName:\nEmail:\nPhone Number:\nMarital Status:\nPersonal Info\nProfession:\nLocation:\nEducation:\nChildren Info\"]/android.widget.EditText[3]")));
		el4.click();
		Thread.sleep(1000);
		driver.navigate().back();
		//		
		//		el4.sendKeys("01300000000");
		//		Thread.sleep(1000);
		//		driver.navigate().back();
		//		
		//		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Date of Birth")));
		//		el5.click();
		//		
		//		WebElement el6 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Switch to input")));
		//		el6.click();
		//		
		//		WebElement el7 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"SELECT DATE\nWed, Jun 22\"]/android.widget.EditText")));
		//		el7.sendKeys("1/07/1996");
		//		Thread.sleep(1000);
		//		
		//		WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
		//		el8.click();
		//		
		//		WebElement el9 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Gender")));
		//		el9.click();
		//		
		//		WebElement el10 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Male")));
		//		el10.click();
		//		
		//		WebElement el11 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Marital Status")));
		//		el11.click();
		//		
		//		WebElement el12 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Married")));
		//		el12.click();
		Thread.sleep(2000);
		Utility.scroll();
		Thread.sleep(1000);

		//		WebElement el13 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Industry")));
		//		el13.click();
		//		
		//		WebElement el14 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Computer and technology")));
		//		el14.click();
		//		
		//		WebElement el15 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Region")));
		//		el15.click();
		//		
		//		WebElement el16 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("National Capital Region")));
		//		el16.click();
		//		
		//		WebElement el17 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Educational Attainment")));
		//		el17.click();
		//		
		//		WebElement el18 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Masters Degree")));
		//		el18.click();

		WebElement el19 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Add Children")));
		el19.click();
		Thread.sleep(1000);

		//		WebElement el20 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ScrollView/android.widget.EditText")));
		//		el20.click();
		//		Thread.sleep(1000);
		//		el20.sendKeys("C1");
		//		
		//		WebElement el21 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Age Range")));
		//		el21.click();
		//		
		//		WebElement el22 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("1 to 2 years")));
		//		el22.click();
		//		
		//		WebElement el23 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Gender")));
		//		el23.click();
		//		
		//		WebElement el24 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Male")));
		//		el24.click();

		WebElement el25 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("ACCEPT")));


		//		Utility.scroll();
		//		
		//		WebElement el26 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Submit")));
		//
		//		
		//		if(Utility.isClickable(el26) == true) {
		//			el26.click();
		//			Assert.assertTrue(true);
		//		}

		try {
			WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));
			boolean bst = Utility.isClickable(el25);
			System.out.println(bst);
			try {
				if(bst == true) {
					el25.click();
					Thread.sleep(5000);
					driver.navigate().back();
					Utility.childScroll();
					Thread.sleep(3000);
					try {
						if(wait2.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Submit"))).isDisplayed() == true) {
							System.out.println("Not added");
						}
						}catch(Exception e) {
							Assert.assertTrue(false, "Error occured. -- ");
							
							
						}
					
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Child info not updated!. -- ");
		}
	}
}
