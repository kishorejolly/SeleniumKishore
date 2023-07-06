package login;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public class TC_03_Test extends BaseClass {
	@Test
public void LoginWith() {
	login.getLoginLink().click();
	login.getEmailTF().sendKeys("kishorer@gmail.com");
	login.getPasswordTF().sendKeys("12345678");
	login.getLoginButton().click();
}
}
