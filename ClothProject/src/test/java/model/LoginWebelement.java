package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class LoginWebelement extends ModelBase {

	public LoginWebelement(WebDriver driver) {

		super(driver);
	}

	public WebElement logNsign = null;
	public WebElement email = null;
	public WebElement password = null;
	public WebElement loginButton = null;

	public WebElement loginNSignInput() {
		logNsign = driver.findElement(By.xpath("//*[@id=\\\"navbar_0_6\\\"]/div[2]/ul/li[2]/div//following::li[1]"));
		return logNsign;
	}

	public WebElement emailInput() {
		email = driver.findElement(By.xpath("borsonqa@gmail.com"));
		return email;
	}

	public WebElement passwordInput() {
		password = driver.findElement(By.xpath("love1986"));
		return password;
	}

	public WebElement logButton() {
		loginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		return loginButton;
	}

}
