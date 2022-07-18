package pinoyParent.functionalities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import pinoyParent.reusable.PropertiesOperations;
import pinoyParent.testCases.BaseClass;
import pinoyParent.utilities.Utility;

public class Community extends BaseClass{
	
	static String commnuityTitle = PropertiesOperations.getInputValueByKey("commnuityTitle");
	static String commnuityDescription = PropertiesOperations.getInputValueByKey("commnuityDescription");
	static String communityCommentOnPost = PropertiesOperations.getInputValueByKey("communityCommentOnPost");
	static String communityName = PropertiesOperations.getInputValueByKey("communityName");
	static String suggestCommunityDescription = PropertiesOperations.getInputValueByKey("suggestCommunityDescription");

	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));

	public static void ourCommunity() throws InterruptedException {

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View//android.widget.ImageView[4]")));
		el1.click();

		Thread.sleep(3000);
	}

	public static void createNewPost() throws InterruptedException {
		ourCommunity();

		WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[3]")));

		try {
			boolean bst = Utility.isClickable(el1);
			System.out.println(bst);
			try {
				if(bst == true) {
					el1.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Add button not found!. -- ");
		}

		Thread.sleep(10000);


		WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Community")));

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
			Assert.assertTrue(false, "Select community dropdown button not found!. -- ");
		}


		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Test")));

		try {
			boolean bst = Utility.isClickable(el3);
			System.out.println(bst);
			try {
				if(bst == true) {
					el3.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Community dropdown value not selected!. -- ");
		}


		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Age Group")));

		try {
			boolean bst = Utility.isClickable(el4);
			System.out.println(bst);
			try {
				if(bst == true) {
					el4.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Select Age group dropdown button not found!. -- ");
		}


		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Infant")));

		try {
			boolean bst = Utility.isClickable(el5);
			System.out.println(bst);
			try {
				if(bst == true) {
					el5.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Age group dropdown value not selected!. -- ");
		}



		WebElement el6 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Create New Post\nUser Name\nAdd to your post\"]/android.widget.EditText[1]")));
		el6.click();

		try {
			boolean bst = Utility.isClickable(el6);
			System.out.println(bst);
			try {
				if(bst == true) {
					el6.click();
					Thread.sleep(2000);
					el6.sendKeys(commnuityTitle);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Title edit space not found. -- ");
		}


		WebElement el7 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Create New Post\nUser Name\nAdd to your post\"]/android.widget.EditText[2]")));

		try {
			boolean bst = Utility.isClickable(el7);
			System.out.println(bst);
			try {
				if(bst == true) {
					el7.click();
					Thread.sleep(2000);
					el7.sendKeys(commnuityDescription);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Description edit space not found. -- ");
		}

		WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Post")));

		try {
			boolean bst = Utility.isClickable(el8);
			System.out.println(bst);
			try {
				if(bst == true) {
					el8.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Post button not found!. -- ");
		}

		Thread.sleep(5000);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Home")));

			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unsuccessful post!. -- ");
		}

		Thread.sleep(3000);

	}


	public static void likeUnlikePost() throws InterruptedException {
		ourCommunity();

		WebElement like = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"0\"])[1]")));


		try {
			boolean bst = Utility.isClickable(like);
			System.out.println(bst);
			try {
				if(bst == true) {
					like.click();
					Thread.sleep(2000);
					like.click();
					Thread.sleep(2000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to like unlike the post!. -- ");
		}

	}


	public static void commentOnPost() throws InterruptedException {
		ourCommunity();
		WebElement comment = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@index=\"3\"])[3]")));

		int beforeComment = Integer.parseInt(comment.getAttribute("contentDescription"));
		System.out.println(beforeComment);
		try {
			boolean bst = Utility.isClickable(comment);
			System.out.println(bst);
			try {
				if(bst == true) {
					comment.click();
					Thread.sleep(3000);
					
					WebElement el1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")));
					el1.click();
					Thread.sleep(1000);
					el1.sendKeys(communityCommentOnPost);
					Thread.sleep(3000);
					
					WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[1]//android.view.View//android.widget.Button[2]")));
					el2.click();
					Thread.sleep(5000);
					driver.navigate().back();
					driver.navigate().back();
					Thread.sleep(5000);
					int afterComment = Integer.parseInt(comment.getAttribute("contentDescription"));
					System.out.println(afterComment);
					
					if(afterComment>beforeComment) {
						Assert.assertTrue(true);
					}else {
						Assert.assertTrue(false, "Commment number not updated!. -- ");
					}
					
					
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to comment!. -- ");
		}


		Thread.sleep(3000);
	}


	public static void sharePost() throws InterruptedException {
		ourCommunity();
		WebElement share = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"Share\"])[1]")));

		try {
			boolean bst = Utility.isClickable(share);
			System.out.println(bst);
			try {
				if(bst == true) {
					share.click();
					Thread.sleep(2000);
					WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("android:id/chooser_copy_button")));
					el3.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to share. -- ");
		}

		Thread.sleep(2000);
	}


	public static void reportPost() throws InterruptedException {
		ourCommunity();
		WebElement report = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.widget.ImageView[@content-desc=\"SQA TEST 2\nThis is a test\"])[1]/android.widget.Button")));



		try {
			boolean bst = Utility.isClickable(report);
			System.out.println(bst);
			try {
				if(bst == true) {
					report.click();
					Thread.sleep(2000);
					WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.RadioButton[3]")));
					el4.click();
					Thread.sleep(2000);
					WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Report")));
					el5.click();
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to report. -- ");
		}

		Thread.sleep(3000);

	}


	public static void allCommunityListPage() throws InterruptedException {
		ourCommunity();

		WebElement el2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Subscription")));
		el2.click();
		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"See All\"])[1]")));


		//		List<MobileElement> joinedCommunity = driver.findElements(By.xpath("//android.view.View"));

		//		for (WebElement webElement : joinedCommunity) {
		//            String name = webElement.getText();
		//            System.out.println(name);
		//        }

		//		System.out.println(joinedCommunity.size() + "Elements found !");

		try {
			boolean bst = Utility.isClickable(el3);
			System.out.println(bst);
			try {
				if(bst == true) {
					el3.click();
					Thread.sleep(5000);
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to see all the community list!. -- ");
		}
		Thread.sleep(2000);
	}


	public static void joinInaCommunity() throws InterruptedException {
		ourCommunity();

		WebElement el2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Subscription")));
		el2.click();
		Thread.sleep(2000);

		WebElement el4 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.widget.Button[@content-desc=\"Join\"])[2]")));
		el4.click();
		Thread.sleep(2000);
		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"See All\"])[2]")));




		try {
			boolean bst = Utility.isClickable(el5);
			System.out.println(bst);
			try {
				if(bst == true) {
					el5.click();
					Thread.sleep(5000);
					List<MobileElement> joinedCommunity = driver.findElements(By.xpath("//android.view.View"));

					if(joinedCommunity.size() > 0) {
						Assert.assertTrue(true);
					}else {
						Assert.assertTrue(false, "Joined community list is empty");
					}

				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to see all the community list!. -- ");
		}

	}

	//	public static void suggestedCommunityList() throws InterruptedException {
	//
	//		ourCommunity();
	//
	//		WebElement el2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Subscription")));
	//		el2.click();
	//		Thread.sleep(2000);
	//
	//		Utility.scroll();
	//		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("(//android.view.View[@content-desc=\"See All\"])[3]")));
	//		el5.click();
	//
	//		List<MobileElement> joinedCommunity = driver.findElements(By.xpath("//android.view.View"));
	//
	//		System.out.println(joinedCommunity.size() + " Found");
	//		Assert.assertTrue(true);
	//
	//
	//	}


	public static void suggestNewCommunity() throws InterruptedException {
		ourCommunity();

		WebElement el2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Subscription")));
		el2.click();
		Thread.sleep(2000);

		Utility.scroll();

		WebElement el5 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Suggest New")));
		el5.click();

		WebElement el3 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Community Name\nCommunity Type\nAge Group\nCommunity Description\"]/android.widget.EditText[1]")));
		el3.click();
		Thread.sleep(1000);
		el3.sendKeys(communityName);
		WebElement el4 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Community Type")));
		el4.click();
		WebElement el15 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Public")));
		el15.click();
		WebElement el6 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Select Age Group")));
		el6.click();
		WebElement el7 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("School-Aged Child")));
		el7.click();
		WebElement el8 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.view.View[@content-desc=\"Community Name\nCommunity Type\nAge Group\nCommunity Description\"]/android.widget.EditText[2]")));
		el8.click();
		Thread.sleep(1000);
		el8.sendKeys(suggestCommunityDescription);
		driver.navigate().back();
		WebElement el9 =  wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Submit")));
		el9.click();
		Thread.sleep(5000);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement e22 = wait2.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Community")));
			try {
				if(e22.isDisplayed() == true) {
					Assert.assertTrue(true);
				} 
			}catch(WebDriverException e) {
				System.out.println("An Exceptional Case");
			}
		}catch (Exception e) {
			Assert.assertTrue(false, "Unable to add new suggested community!. -- ");
		}

		Thread.sleep(3000);

	}



}
