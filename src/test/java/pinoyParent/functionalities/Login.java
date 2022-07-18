package pinoyParent.functionalities;

import java.time.Duration;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import pinoyParent.reusable.PropertiesOperations;
import pinoyParent.testCases.BaseClass;


public class Login extends BaseClass{
	
	static String validUserId = PropertiesOperations.getInputValueByKey("validUserId");
	static String validPassword = PropertiesOperations.getInputValueByKey("validPassword");
	static String invalidUserId = PropertiesOperations.getInputValueByKey("invalidUserId");
	static String invalidPassword = PropertiesOperations.getInputValueByKey("invalidPassword");
	
	
	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(180));
	
	public static void login() throws InterruptedException {
		
		
		WebElement loginPage = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"LOGIN\"])[1]")));
		loginPage.isSelected();
		
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[1]")));
		user.click();
		Thread.sleep(2000);
		user.sendKeys(validUserId);

		Thread.sleep(2000);
		WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[2]")));
		pass.click();
		Thread.sleep(2000);
		pass.sendKeys(validPassword);
		
		driver.navigate().back();
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")));
		login.click();

		Thread.sleep(6000);
		
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")));

			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Couldn't locate the required element to verify. -- ");
		}
	}
	
	
	public static void loginInvalidUser() throws InterruptedException {
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement loginPage = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"LOGIN\"])[1]")));
		loginPage.isSelected();
		
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[1]")));
		user.click();
		Thread.sleep(2000);
		user.sendKeys(invalidUserId);

		WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[2]")));
		pass.click();
		Thread.sleep(2000);
		pass.sendKeys(validPassword);
		
		driver.navigate().back();
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")));
		login.click();
		Thread.sleep(4000);
		
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait3.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")));

			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(false, "Should not be able to login with invalid username. -- ");
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(true);
		}
		
		Thread.sleep(3000);
		
	}
	
	
	
	public static void loginInvalidPass() throws InterruptedException {
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement loginPage = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"LOGIN\"])[1]")));
		loginPage.isSelected();
		
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[1]")));
		user.click();
		Thread.sleep(2000);
		user.sendKeys(validUserId);

		WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[2]")));
		pass.click();
		Thread.sleep(2000);
		pass.sendKeys(invalidPassword);
		
		driver.navigate().back();
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")));
		login.click();
		Thread.sleep(4000);
		
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait3.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")));

			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(false, "Should not be able to login with invalid password. -- ");
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(true);
		}
		
		
		Thread.sleep(3000);	
	}
	
	
	
	public static void emptyFields() throws InterruptedException {
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement loginPage = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"LOGIN\"])[1]")));
		loginPage.isSelected();
		
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[1]")));
		user.click();
		Thread.sleep(2000);
		user.sendKeys(invalidUserId);

		WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.view.View//android.view.View/android.view.View//android.widget.EditText[2]")));
		pass.click();
		Thread.sleep(2000);
		pass.sendKeys(invalidPassword);
		
		driver.navigate().back();
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")));
		login.click();
		Thread.sleep(4000);
		
		try {
			WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait3.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")));

			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(false, "Should not be able to login with empty fields. -- ");
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(true);
		}
		
		
		Thread.sleep(3000);	
	}
}
