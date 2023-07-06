package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		@FindBy(linkText = "Log in")
		private WebElement loginLink;
		
		@FindBy(xpath  = "//input[@value='Log in']")
		private WebElement loginButton;
		
		@FindBy(id = "Email")
		private WebElement emailTF;
		
		@FindBy(name = "Password")
		private WebElement passwordTF;

		public WebElement getLoginLink() {
			return loginLink;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getEmailTF() {
			return emailTF;
		}

		public WebElement getPasswordTF() {
			return passwordTF;
		}
		
	}

