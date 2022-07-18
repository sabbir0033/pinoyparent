package pinoyParent.functionalities;

import java.time.Duration;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pinoyParent.testCases.BaseClass;
import pinoyParent.utilities.Utility;

public class Menu extends BaseClass {
	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(180));
	
	public static void shortCourse() throws InterruptedException {
		
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		//(new TouchAction(driver)).tap(PointOption.point(320, 1311)).perform();
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Short Course")));

		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Short Course button not found!. -- ");
		}
		
	}
	
	
	public static void articleBlogs() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Article / Blogs")));
		el2.click();
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Article / Blogs button not found!. -- ");
		}
	}
	
	
	public static void videoContent() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Video Content")));
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Video Content button not found!. -- ");
		}
	}
	
	
	public static void community() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Community")));
		
		//(new TouchAction(driver)).tap(PointOption.point(276, 1745)).perform();
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Community button not found!. -- ");
		}
	}
	
	
	public static void store() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Store")));
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Store button not found!. -- ");
		}
	}
	
	
	public static void subscription() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Subscription")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Subscription button not found!. -- ");
		}
	}
	
	
	public static void rewards() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Rewards")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Rewards button not found!. -- ");
		}
	}
	
	
	public static void helpLine() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Help Line")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Help Line button not found!. -- ");
		}
	}
	
	
	public static void aboutUs() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("About Us")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "About Us button not found!. -- ");
		}
	}
	
	
	public static void settings() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Settings")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Settings button not found!. -- ");
		}
	}

	
	public static void termsConditions() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Terms & Conditions")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Terms & Conditions button not found!. -- ");
		}
	}
	
	
	public static void privacyPolicy() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Privacy Policy")));
		
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Privacy Policy button not found!. -- ");
		}
	}
	
	
	public static void logout() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Pinoy Parent\"]/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")));
		el1.click();
		Thread.sleep(2000);
		Utility.menuScroll();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Logout")));
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(2000);
					WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("ACCEPT")));
					el3.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Logout button not found!. -- ");
		}

	}
}
