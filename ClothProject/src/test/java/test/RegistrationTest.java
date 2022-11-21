package test;

import org.testng.annotations.Test;

import base.TestBase;

public class RegistrationTest extends TestBase {

	@Test
	public void newCustomeRegistration() throws Exception {
		getRegistrationAction().registrationFeature();
	}

}
