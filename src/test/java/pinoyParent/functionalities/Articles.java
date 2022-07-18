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
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pinoyParent.testCases.BaseClass;
import pinoyParent.utilities.Utility;

public class Articles extends BaseClass{

	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(180));

	public static void ourArtcles() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.widget.ImageView[@index=\"3\"])")));
		el1.click();

		Assert.assertTrue(true);
		Thread.sleep(2000);
	}


	public static void reactOnArticles() throws InterruptedException {
		ourArtcles();
		Thread.sleep(2000);
		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Articles 1\nArticles\n● My Articles 1\n● Kid\nPellentesque tincidunt tristique neque, eget venenatis enim gravida quis. Fusce at egestas libero. Cras convallis egestas ullamcorper. Suspendisse sed ultricies nisl, pharetra rutrum mauris. Vestibulum at massa dui. Morbi et purus velit. Etiam tristique, justo eu condimentum efficitur, purus velit facilisis sem, id fringilla tortor quam quis dolor. Praesent ultricies dignissim ex, at volutpat sapien ullamcorper rhoncus. Curabitur quam velit, ullamcorper ut congue eget, convallis et velit. Donec placerat, magna eu venenatis tempus, dui sapien aliquam libero, sit amet maximus erat massa quis nisi. Integer pharetra auctor arcu, non tincidunt dui fermentum ut. Nullam interdum sapien id mauris dapibus, a pharetra purus rhoncus. Nullam viverra iaculis tristique. Donec quis mauris ipsum. Nunc vehicula magna at erat tristique rutrum.\n0\n0\nPaid")));
		el1.click();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]")));
		

		try {
			boolean bst = Utility.isClickable(el2);
			//System.out.println(bst);
			try {
				if(bst == true) {
					el2.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "React button is not pressed. -- ");
		}

		Thread.sleep(4000);
	}


	public static void saveSingleArticles() throws InterruptedException {
		ourArtcles();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Articles 1\nArticles\n● My Articles 1\n● Kid\nPellentesque tincidunt tristique neque, eget venenatis enim gravida quis. Fusce at egestas libero. Cras convallis egestas ullamcorper. Suspendisse sed ultricies nisl, pharetra rutrum mauris. Vestibulum at massa dui. Morbi et purus velit. Etiam tristique, justo eu condimentum efficitur, purus velit facilisis sem, id fringilla tortor quam quis dolor. Praesent ultricies dignissim ex, at volutpat sapien ullamcorper rhoncus. Curabitur quam velit, ullamcorper ut congue eget, convallis et velit. Donec placerat, magna eu venenatis tempus, dui sapien aliquam libero, sit amet maximus erat massa quis nisi. Integer pharetra auctor arcu, non tincidunt dui fermentum ut. Nullam interdum sapien id mauris dapibus, a pharetra purus rhoncus. Nullam viverra iaculis tristique. Donec quis mauris ipsum. Nunc vehicula magna at erat tristique rutrum.\n0\n0\nPaid")));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]")));


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
			Assert.assertTrue(false, "Save button is not pressed. -- ");
		}

		Thread.sleep(4000);
	}


	public static void shareSingleArticles() throws InterruptedException {
		ourArtcles();
		

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Articles 1\nArticles\n● My Articles 1\n● Kid\nPellentesque tincidunt tristique neque, eget venenatis enim gravida quis. Fusce at egestas libero. Cras convallis egestas ullamcorper. Suspendisse sed ultricies nisl, pharetra rutrum mauris. Vestibulum at massa dui. Morbi et purus velit. Etiam tristique, justo eu condimentum efficitur, purus velit facilisis sem, id fringilla tortor quam quis dolor. Praesent ultricies dignissim ex, at volutpat sapien ullamcorper rhoncus. Curabitur quam velit, ullamcorper ut congue eget, convallis et velit. Donec placerat, magna eu venenatis tempus, dui sapien aliquam libero, sit amet maximus erat massa quis nisi. Integer pharetra auctor arcu, non tincidunt dui fermentum ut. Nullam interdum sapien id mauris dapibus, a pharetra purus rhoncus. Nullam viverra iaculis tristique. Donec quis mauris ipsum. Nunc vehicula magna at erat tristique rutrum.\n0\n0\nPaid")));
		el1.click();
		Thread.sleep(2000);
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
					Thread.sleep(2000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Share button is not pressed. -- ");
		}


		Thread.sleep(3000);
	}


	public static void downloadSingleArticle() throws InterruptedException {
		ourArtcles();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Articles 1\nArticles\n● My Articles 1\n● Kid\nPellentesque tincidunt tristique neque, eget venenatis enim gravida quis. Fusce at egestas libero. Cras convallis egestas ullamcorper. Suspendisse sed ultricies nisl, pharetra rutrum mauris. Vestibulum at massa dui. Morbi et purus velit. Etiam tristique, justo eu condimentum efficitur, purus velit facilisis sem, id fringilla tortor quam quis dolor. Praesent ultricies dignissim ex, at volutpat sapien ullamcorper rhoncus. Curabitur quam velit, ullamcorper ut congue eget, convallis et velit. Donec placerat, magna eu venenatis tempus, dui sapien aliquam libero, sit amet maximus erat massa quis nisi. Integer pharetra auctor arcu, non tincidunt dui fermentum ut. Nullam interdum sapien id mauris dapibus, a pharetra purus rhoncus. Nullam viverra iaculis tristique. Donec quis mauris ipsum. Nunc vehicula magna at erat tristique rutrum.\n0\n0\nPaid")));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[5]")));
		

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
			Assert.assertTrue(false, "Download button is not pressed. -- ");
		}

		Thread.sleep(7000);
	}


	public static void extensiveArticleView() throws InterruptedException {
		ourArtcles();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("My Articles 1\nArticles\n● My Articles 1\n● Kid\nPellentesque tincidunt tristique neque, eget venenatis enim gravida quis. Fusce at egestas libero. Cras convallis egestas ullamcorper. Suspendisse sed ultricies nisl, pharetra rutrum mauris. Vestibulum at massa dui. Morbi et purus velit. Etiam tristique, justo eu condimentum efficitur, purus velit facilisis sem, id fringilla tortor quam quis dolor. Praesent ultricies dignissim ex, at volutpat sapien ullamcorper rhoncus. Curabitur quam velit, ullamcorper ut congue eget, convallis et velit. Donec placerat, magna eu venenatis tempus, dui sapien aliquam libero, sit amet maximus erat massa quis nisi. Integer pharetra auctor arcu, non tincidunt dui fermentum ut. Nullam interdum sapien id mauris dapibus, a pharetra purus rhoncus. Nullam viverra iaculis tristique. Donec quis mauris ipsum. Nunc vehicula magna at erat tristique rutrum.\n0\n0\nTrial")));
		el1.click();

		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Extensive Article")));
		
		

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
			Assert.assertTrue(false, "Button is not pressed. -- ");
		}

		Thread.sleep(4000);
	}


	public static void savedArticles() throws InterruptedException{
		ourArtcles();

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

	public static void downloadedArticles() throws InterruptedException {
		ourArtcles();

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
