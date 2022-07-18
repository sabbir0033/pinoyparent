package pinoyParent.testCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import pinoyParent.functionalities.Login;
import pinoyParent.functionalities.ShortCourse;
import pinoyParent.functionalities.SignUp;
import resource.Capabilities;

public class BaseClass {
	public static String App = "pinoyparent.apk";
	public static AndroidDriver<MobileElement> driver;


	@BeforeTest
	public void setup() throws MalformedURLException {

		driver = Capabilities.start(App);
	}

	@BeforeMethod
	public void resetApp() throws InterruptedException {
		driver.closeApp();
		driver.launchApp();
	}

	@AfterTest
	public void tearDown() throws Exception {
		if (driver != null) {
			System.out.println("Test Done!!!");
			driver.quit();
		}
	}
}
