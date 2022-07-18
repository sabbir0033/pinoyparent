package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.Login;
import pinoyParent.functionalities.Profile;

public class Profile_TestCase extends BaseClass{

	@Test(priority = 1)
	public void profileView() throws InterruptedException {
		Login.login();
		Profile.profileView();
	}
	
	
	@Test(priority = 2)
	public void profileInfo() throws InterruptedException {
		Login.login();
		Profile.profileInfoUpdate();
	}
	
	
	@Test(priority = 3)
	public void profileInfoEdit() throws InterruptedException {
		Login.login();
		Profile.profileInfoEdit();
	}
	
	
	@Test(priority = 4)
	public void emptyChildInfo() throws InterruptedException {
		Login.login();
		Profile.profileInfoUpdateWithEmptyChildInfo();
	}
}
