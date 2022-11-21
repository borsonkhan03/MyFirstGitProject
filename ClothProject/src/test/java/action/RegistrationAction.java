package action;

import org.openqa.selenium.WebDriver;

import base.ActionBase;
import model.RegistrationModel;

public class RegistrationAction extends ActionBase {

	public RegistrationModel registrationModel;

	public RegistrationAction(WebDriver driver) {
		super(driver);

		registrationModel = new RegistrationModel(driver);
	}

	public void registrationFeature() throws Exception {

		Thread.sleep(3000);
		registrationModel.loginButtonInput().click();
		Thread.sleep(3000);
		registrationModel.firstNameInput().sendKeys("borson");
		Thread.sleep(3000);
		registrationModel.lastNameInput().sendKeys("khan");
		Thread.sleep(3000);
		registrationModel.DOBInput().sendKeys("01/01/1986");
		Thread.sleep(3000);
		registrationModel.emailBoxInput().sendKeys("borsonqa@gmail.com");
		registrationModel.passwordinput().sendKeys("love1986");
		Thread.sleep(3000);
		registrationModel.confirmPasswordInput().sendKeys("love1986");
		registrationModel.genderBoxInput().sendKeys("male");
		Thread.sleep(3000);
		registrationModel.phoneNumberInput().sendKeys("7182620067");
		registrationModel.checkBox().click();
		Thread.sleep(3000);
		registrationModel.createAccountBox().click();
		Thread.sleep(3000);

	}
	// in this page no hardcode;

}
