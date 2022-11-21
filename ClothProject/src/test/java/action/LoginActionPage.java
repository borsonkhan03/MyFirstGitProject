package action;

import org.openqa.selenium.WebDriver;

import base.ActionBase;
import model.LoginWebelement;

public class LoginActionPage extends ActionBase {

	public LoginWebelement loginModel;

	public LoginActionPage(WebDriver driver) {
		super(driver);
		loginModel = new LoginWebelement(driver);
	}

	public void loginFeature(String id, String pass) throws Exception {
		loginModel.logNsign.click();
		loginModel.email.sendKeys(id);
		loginModel.password.sendKeys(pass);
		loginModel.loginButton.click();

	}
}
