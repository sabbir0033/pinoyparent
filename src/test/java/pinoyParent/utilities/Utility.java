package pinoyParent.utilities;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import pinoyParent.testCases.BaseClass;

public class Utility extends BaseClass{

	public static void scroll() {

		TouchAction abc = new TouchAction(driver);
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.5);

		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.05);

		abc.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

	}
	
	
	public static void childScroll() {

		TouchAction abc = new TouchAction(driver);
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.2);

		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.05);

		abc.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

	}


	public static void menuScroll() {

		TouchAction abc = new TouchAction(driver);
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.1);
		int start_y = (int) (dimension.height * 0.5);

		int end_x = (int) (dimension.width * 0.1);
		int end_y = (int) (dimension.height * 0.005);

		abc.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

	}
	
	
	public static void horizontalScroll() {

		TouchAction abc = new TouchAction(driver);
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.5);

		int end_x = (int) (dimension.width * 0.005);
		int end_y = (int) (dimension.height * 0.5);

		abc.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

	}


	public static boolean isClickable(WebElement elem) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(elem));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
