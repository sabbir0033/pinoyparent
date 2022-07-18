package pinoyParent.testCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pinoyParent.functionalities.Login;

public class Login_TestCase extends BaseClass {
	

	@Test(priority = 1)
	public void loginTest() throws InterruptedException {
		Login.login();
		
	}


	@Test(priority = 2)
	public void invalidUser() throws InterruptedException {
		Login.loginInvalidUser();
		
	}

	@Test(priority = 3)
	public void invalidPass() throws InterruptedException {
		Login.loginInvalidPass();
		
	}

	@Test(priority = 4)
	public void loginWithEmptyFields() throws InterruptedException {
		Login.emptyFields();
		
	}
	
}
