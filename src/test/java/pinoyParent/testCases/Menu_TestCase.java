package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.Login;
import pinoyParent.functionalities.Menu;


public class Menu_TestCase extends BaseClass {

	@Test(priority = 1)
	public void shortCourseMenu() throws InterruptedException{
		Login.login();
		Menu.shortCourse();
	}
	
	
	@Test(priority = 2)
	public void articleBlogsMenu() throws InterruptedException{
		Login.login();
		Menu.articleBlogs();
	}
	
	
	@Test(priority = 3)
	public void videoContentMenu() throws InterruptedException{
		Login.login();
		Menu.videoContent();
	}
	
	
	@Test(priority = 4)
	public void communityMenu() throws InterruptedException{
		Login.login();
		Menu.community();
	}
	
	
	@Test(priority = 5)
	public void storeMenu() throws InterruptedException{
		Login.login();
		Menu.store();
	}
	
	
	@Test(priority = 6)
	public void subscriptionMenu() throws InterruptedException{
		Login.login();
		Menu.subscription();
	}
	
	
	@Test(priority = 7)
	public void rewardMenu() throws InterruptedException{
		Login.login();
		Menu.rewards();
	}
	
	
	@Test(priority = 8)
	public void helpLineMenu() throws InterruptedException{
		Login.login();
		Menu.helpLine();
	}
	
	
	@Test(priority = 9)
	public void aboutUsMenu() throws InterruptedException{
		Login.login();
		Menu.aboutUs();
	}
	
	
	@Test(priority = 10)
	public void settingsMenu() throws InterruptedException{
		Login.login();
		Menu.settings();
	}
	
	
	@Test(priority = 11)
	public void termsConditionMenu() throws InterruptedException{
		Login.login();
		Menu.termsConditions();
	}
	
	
	@Test(priority = 12)
	public void privacyPolicyMenu() throws InterruptedException{
		Login.login();
		Menu.termsConditions();
	}
	
	
	@Test(priority = 13)
	public void logoutMenu() throws InterruptedException{
		Login.login();
		Menu.logout();
	}
}
