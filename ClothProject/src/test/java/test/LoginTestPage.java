package test;

import org.testng.annotations.Test;

import base.TestBase;

public class LoginTestPage extends TestBase {

	@Test
	public void logInSignFeature() throws Exception {
		getAction().loginFeature("borsonqa@gmail.com", "love1986");

	}
}
