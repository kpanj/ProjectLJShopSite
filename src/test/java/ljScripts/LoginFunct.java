package ljScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.LoginPage;

public class LoginFunct extends BaseClass{
	@Test
	public void loginCall() {
		LoginPage lp = new LoginPage(driver);
		lp.emailTF();
		lp.passwordTF();
		lp.signIn();
	}
	
}
