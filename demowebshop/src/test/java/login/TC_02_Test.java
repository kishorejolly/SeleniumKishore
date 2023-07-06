package login;

import org.testng.annotations.Test;

import genericutility.BaseClass;

public class TC_02_Test extends BaseClass {
	@Test
public void RegiteringUser() {
	register.getRegisterLink().click();
	register.getFirstNameTF().sendKeys("kishore");
	register.getLastTFName().sendKeys("r");
	register.getEmailTF().sendKeys("kishorer@gmail.com");
	register.getPasswordTF().sendKeys("12345678");
	register.getConfirmPasswordTF().sendKeys("12345678");
	register.getRegisterButton().click();
}
}
