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

public class SignUp extends BaseClass{
	
	static String username = PropertiesOperations.getInputValueByKey("username");
	static String email = PropertiesOperations.getInputValueByKey("email");
	static String password = PropertiesOperations.getInputValueByKey("password");
	static String confirmPass = PropertiesOperations.getInputValueByKey("confirmPass");
	static String invalidUsername = PropertiesOperations.getInputValueByKey("invalidUsername");
	static String invalidEmail = PropertiesOperations.getInputValueByKey("invalidEmail");
	static String invalidPassword = PropertiesOperations.getInputValueByKey("invalidPassword");
	static String invalidConfirmPass = PropertiesOperations.getInputValueByKey("invalidConfirmPass");
	
	
	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

	public static void validSignUp() throws InterruptedException {
		
		WebElement signUpPage = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("SIGNUP")));
		signUpPage.click();
		signUpPage.isSelected();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[1]")));
		el1.click();
		Thread.sleep(1000);
		el1.sendKeys(username);

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[2]")));
		el2.click();
		Thread.sleep(1000);
		el2.sendKeys(email);

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[3]")));
		el3.click();
		Thread.sleep(1000);
		el3.sendKeys(password);

		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[4]")));
		el4.click();
		Thread.sleep(1000);
		el4.sendKeys(confirmPass);

		driver.navigate().back();
		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Sign Up")));
		el5.click();
		//Assert.assertTrue(false);
		Thread.sleep(10000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("The Pinoy Parent")));

			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			System.out.println("Couldn't location the element");
			Assert.assertTrue(false);
		}
		Thread.sleep(5000);
	}
	
	
	public static void signUpWithEmptyFields() throws InterruptedException {
		
		WebElement signUpPage = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("SIGNUP")));
		signUpPage.click();
		signUpPage.isSelected();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[1]")));
		el1.click();
		Thread.sleep(1000);
		el1.sendKeys(invalidUsername);
		
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[2]")));
		el2.click();
		Thread.sleep(1000);
		el2.sendKeys(invalidEmail);

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[3]")));
		el3.click();
		Thread.sleep(1000);
		el3.sendKeys(invalidPassword);

		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\"]/android.widget.EditText[4]")));
		el4.click();
		Thread.sleep(1000);
		el4.sendKeys(invalidConfirmPass);
		
		driver.navigate().back();
		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Sign Up")));
		el5.click();
		
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement username = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\nFullName is required.\nEmail is required.\nPassword is required.\nConfirmPassword is required.\"]/android.widget.EditText[1]")));
			WebElement email = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\nFullName is required.\nEmail is required.\nPassword is required.\nConfirmPassword is required.\"]/android.widget.EditText[2]")));
			WebElement pass = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\nFullName is required.\nEmail is required.\nPassword is required.\nConfirmPassword is required.\"]/android.widget.EditText[3]")));
			WebElement confirmPass = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"SIGNUP\nSign Up\nFullName is required.\nEmail is required.\nPassword is required.\nConfirmPassword is required.\"]/android.widget.EditText[4]")));

			try {
				if(username.isDisplayed() || email.isDisplayed() ||  pass.isDisplayed() || confirmPass.isDisplayed()== true) {
					System.out.println("Required Field is needed");
					Assert.assertTrue(true);
				} 
				
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			System.out.println("Registration without the required field !");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(3000);
		
		Assert.assertTrue(true);
	}
}
