package test;

import org.testng.annotations.Test;

import base.TestBase;

public class MenTestPage extends TestBase {
	@Test
	public void menFeature() throws Exception {
		getMenAction().menFeature();
	}

}// when we use run all 
