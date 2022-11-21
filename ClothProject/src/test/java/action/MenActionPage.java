package action;

import org.openqa.selenium.WebDriver;

import base.ActionBase;
import model.MenModel;

public class MenActionPage extends ActionBase {

	private MenModel menModel;

	public MenActionPage(WebDriver driver) {
		super(driver);
		menModel = new MenModel(driver);
	}
	public void menFeature() throws Exception {
		Thread.sleep(3000);
		menModel.menButton().click();
		menModel.menViewDetails().click();
	}
	

}
