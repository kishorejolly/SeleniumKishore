package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}
	@FindBy(id = "FirstName")
	private WebElement firstNameTF;

	@FindBy(id = "LastName")
	private WebElement lastTFName;

	@FindBy(id = "Email")
	private WebElement emailTF;

	@FindBy(id = "Password")
	private WebElement passwordTF;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTF;

	@FindBy(id = "register-button")
	private WebElement registerButton;


	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastTFName() {
		return lastTFName;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmPasswordTF() {
		return confirmPasswordTF;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}



}
