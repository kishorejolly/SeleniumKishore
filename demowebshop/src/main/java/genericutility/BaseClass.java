package genericutility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.RegisterPage;

public class BaseClass {
	public static WebDriver driver;
	PropertyUtility ppt = new PropertyUtility();
	public static RegisterPage register;
	public static LoginPage login;
	@BeforeClass
	public  void launchingBrowser() throws IOException {
		if (ppt.readingDataFromPPT("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(ppt.readingDataFromPPT("url"));

		register = new RegisterPage(driver);
		login = new LoginPage(driver);
	}

	@AfterClass
	public  void tearDownTheBrowser() {
		driver.quit();
	}

}


