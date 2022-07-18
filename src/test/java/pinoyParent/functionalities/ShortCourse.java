package pinoyParent.functionalities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pinoyParent.testCases.BaseClass;
import pinoyParent.utilities.Utility;

public class ShortCourse extends BaseClass{
	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(180));

	public static void courceDetails() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Top Features\nShort Course\nVideo\nArticle\nCommunity\nStore\nSupport\nSubscription\nRewards\nSubscription Packages\nTrending\"]/android.widget.ImageView[1]")));
		el1.click();
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Para sa aking anak, pasensya na kung minsan ‘di kita natutulungan sa modular at online learning mo\nInfant Bullying\nTeenager\n0.0\n(0)\nFree")));

		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Course not found!. -- ");
		}

		Thread.sleep(2000);
	}



	public static void reactOnSingleCoursePage() throws InterruptedException{
		courceDetails();

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")));

		try {
			boolean bst = Utility.isClickable(el3);
			//System.out.println(bst);
			try {
				if(bst == true) {
					el3.click();
					Thread.sleep(7000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "React button is not pressed. -- ");
		}
	}


	public static void saveSingleCoursePage() throws InterruptedException {
		courceDetails();
		Thread.sleep(2000);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Thread.sleep(7000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Save button is not pressed. -- ");
		}
	}


	public static void shareSingleCoursePage() throws InterruptedException {
		courceDetails();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Thread.sleep(2000);
					WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/chooser_copy_button")));
					el2.click();
					Thread.sleep(3000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Share button is not pressed. -- ");
		}
	}


	public static void downloadSingleCoursePage() throws InterruptedException {
		courceDetails();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Thread.sleep(15000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Download button is not pressed. -- ");
		}
	}


	public static void enrollSingleCoursePage() throws InterruptedException {
		courceDetails();
		Thread.sleep(2000);
		Utility.scroll();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Enroll\"]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Thread.sleep(4000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Enrolled Button is not pressed. -- ");
		}
	}


	public static void playSingleCourseVideo() throws InterruptedException {
		courceDetails();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")));
		el1.click();
		Thread.sleep(4000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View")));

		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Assert.assertTrue(true);
					Thread.sleep(2000);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to play the video. -- ");
		}
	}


	public static void savedCourses() throws InterruptedException {
		courceDetails();

		//		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")));
		//		el2.click();

		driver.navigate().back();

		Thread.sleep(2000);

		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Saved\"]")));

		try {
			boolean bst = Utility.isClickable(el5);
			System.out.println(bst);
			try {
				if(bst == true) {
					el5.click();
					Thread.sleep(7000);
					List<MobileElement> savedItems = driver.findElements(By.xpath("//android.widget.ImageView"));

					if(savedItems.size() > 3) {
						System.out.println(savedItems.size() + "Elements found !");
						Assert.assertTrue(true);

					}else {
						Assert.assertTrue(false, "No Content found !");
					}
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Button is not pressed. -- ");
		}

	}



	public static void downloadedCourses() throws InterruptedException {
		downloadSingleCoursePage();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Downloaded\"]")));

		try {
			boolean bst = Utility.isClickable(el5);
			System.out.println(bst);
			try {
				if(bst == true) {
					el5.click();
					Thread.sleep(4000);
					List<MobileElement> downloadItems = driver.findElements(By.xpath("//android.widget.ImageView"));

					if(downloadItems.size() > 3) {
						System.out.println(downloadItems.size() + "Elements found !");
						Assert.assertTrue(true);

					}else {
						Assert.assertTrue(false, "No Content found !");
					}
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Button is not pressed. -- ");
		}
	}

}
