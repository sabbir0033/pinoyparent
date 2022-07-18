package pinoyParent.functionalities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import pinoyParent.testCases.BaseClass;
import pinoyParent.utilities.Utility;

public class Video extends BaseClass{

	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(180));

	public static void ourVideos() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Top Features\nShort Course\nVideo\nArticle\nCommunity\nStore\nSupport\nSubscription\nRewards\nSubscription Packages\nTrending\"]/android.widget.ImageView[2]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Thread.sleep(2000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Video not found!. -- ");
		}

	}


	public static void reactOnVideo() throws InterruptedException {
		ourVideos();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("College students should have complete freedom to choose their own courses.\n● Videos\n● Babhsiting\n● Parent\nEmotional and psychosocial protection, Physical protection, Teaching and learning, Parents and  community, School leadership and management, plus Access, and Policy & Systems. Each section is conceived as a stand-alone set of resources from which practitioners can draw on according to Inclusive Education Programming needs. Users may not need to  read the entire toolkit, but only pick and use the components identified to fill the gaps in their specific contexts\n0\n0\nTrial")));
		el1.click();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")));

		try {
			boolean bst = Utility.isClickable(el2);
			//System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
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


	public static void saveSingleVideo() throws InterruptedException {
		ourVideos();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("College students should have complete freedom to choose their own courses.\n● Videos\n● Babhsiting\n● Parent\nEmotional and psychosocial protection, Physical protection, Teaching and learning, Parents and  community, School leadership and management, plus Access, and Policy & Systems. Each section is conceived as a stand-alone set of resources from which practitioners can draw on according to Inclusive Education Programming needs. Users may not need to  read the entire toolkit, but only pick and use the components identified to fill the gaps in their specific contexts\n0\n0\nTrial")));
		el1.click();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")));
		Thread.sleep(4000);
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
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


	public static void shareSingleVideo() throws InterruptedException {
		ourVideos();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("College students should have complete freedom to choose their own courses.\n● Videos\n● Babhsiting\n● Parent\nEmotional and psychosocial protection, Physical protection, Teaching and learning, Parents and  community, School leadership and management, plus Access, and Policy & Systems. Each section is conceived as a stand-alone set of resources from which practitioners can draw on according to Inclusive Education Programming needs. Users may not need to  read the entire toolkit, but only pick and use the components identified to fill the gaps in their specific contexts\n0\n0\nTrial")));
		el1.click();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]")));
		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Thread.sleep(2000);
					WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/chooser_copy_button")));
					el3.click();
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


	public static void downloadSingleVideo() throws InterruptedException {
		ourVideos();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("College students should have complete freedom to choose their own courses.\n● Videos\n● Babhsiting\n● Parent\nEmotional and psychosocial protection, Physical protection, Teaching and learning, Parents and  community, School leadership and management, plus Access, and Policy & Systems. Each section is conceived as a stand-alone set of resources from which practitioners can draw on according to Inclusive Education Programming needs. Users may not need to  read the entire toolkit, but only pick and use the components identified to fill the gaps in their specific contexts\n0\n0\nTrial")));
		el1.click();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]")));

		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
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


	public static void enrollSingleVideo() throws InterruptedException {
		ourVideos();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("College students should have complete freedom to choose their own courses.\n● Videos\n● Babhsiting\n● Parent\nEmotional and psychosocial protection, Physical protection, Teaching and learning, Parents and  community, School leadership and management, plus Access, and Policy & Systems. Each section is conceived as a stand-alone set of resources from which practitioners can draw on according to Inclusive Education Programming needs. Users may not need to  read the entire toolkit, but only pick and use the components identified to fill the gaps in their specific contexts\n0\n0\nTrial")));
		el1.click();

		Thread.sleep(2000);
		Utility.scroll();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Button[@content-desc=\"Enroll\"]")));

		try {
			boolean bst = Utility.isClickable(el2);
			System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
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


	public static void playSingleVideo() throws InterruptedException {
		ourVideos();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("College students should have complete freedom to choose their own courses.\n● Videos\n● Babhsiting\n● Parent\nEmotional and psychosocial protection, Physical protection, Teaching and learning, Parents and  community, School leadership and management, plus Access, and Policy & Systems. Each section is conceived as a stand-alone set of resources from which practitioners can draw on according to Inclusive Education Programming needs. Users may not need to  read the entire toolkit, but only pick and use the components identified to fill the gaps in their specific contexts\n0\n0\nTrial")));
		el1.click();

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView")));
		el3.click();
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


	public static void webinarList() throws InterruptedException {
		ourVideos();

		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Webinar\"]")));

		try {
			boolean bst = Utility.isClickable(el5);
			System.out.println(bst);
			try {
				if(bst == true) {
					el5.click();
					Assert.assertTrue(true);
					Thread.sleep(5000);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "No content found. -- ");
		}
	}


	public static void savedVideo() throws InterruptedException{
		ourVideos();

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

	public static void downloadedVideo() throws InterruptedException {
		ourVideos();
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


	public static void playWebinar() throws InterruptedException {
		webinarList();
		Thread.sleep(2000);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Webinar Webinar Webinar\n● LIVE\nDate: 2022-06-14 Time: 10:30 AM\nDuration: 60\nhttp://localhost:53731/Public/Index/18\nWebinar")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Assert.assertTrue(true);
					Thread.sleep(5000);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to play webinar. -- ");
		}
	}
}
