package login;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public class TC_01_Test extends BaseClass{
	@Test
public void tc() {
	login.getLoginLink().click();
	login.getEmailTF().sendKeys("mamatha.kr@testyantra.com");
	login.getPasswordTF().sendKeys("123456789");
	login.getLoginButton().click();
}
}
