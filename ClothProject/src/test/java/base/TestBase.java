package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import action.LoginActionPage;
import action.MenActionPage;
import action.RegistrationAction;

public class TestBase {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();

		driver.get("https://deshecart.com/");

		driver.manage().window().maximize();

	}

	@AfterMethod
	public void driverQuit() {

	//	driver.quit();
	}
	
	public LoginActionPage getAction() {
		return new LoginActionPage(driver);
	}
	public RegistrationAction getRegistrationAction() {
		return new RegistrationAction(driver);
	}
	public MenActionPage getMenAction() {
		return new MenActionPage(driver);
	}

}
