package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.SignUp;

public class SignUp_TestCase extends BaseClass {

	@Test(priority = 1)
	public void signUpTest() throws InterruptedException {
		SignUp.validSignUp();
	}
	
	
	@Test(priority = 2)
	public void signUpWithEmpty() throws InterruptedException {
		SignUp.signUpWithEmptyFields();
	}
}
