package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class RegistrationModel extends ModelBase {

	public RegistrationModel(WebDriver driver) {
		super(driver);
	}

	public WebElement loginButton = null;
	public WebElement firstName = null;
	public WebElement lastName = null;
	public WebElement dateOFbirth = null;
	public WebElement emailBox = null;
	public WebElement passwordBox = null;
	public WebElement confirmPasswordBox = null;
	public WebElement genderBox = null;
	public WebElement phoneNumberBox = null;
	public WebElement checkBox = null;
	public WebElement creatAccoutButton = null;

	public WebElement loginButtonInput() {
		loginButton = driver.findElement(By.xpath("//*[@id=\"navbar_0_6\"]/div[2]/ul/li[2]/div//following::li[1]"));
		return loginButton;
	}

	public WebElement firstNameInput() {
		firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		return firstName;
	}

	public WebElement lastNameInput() {
		lastName = driver.findElement(By.xpath("// input[@id='lastName']"));
		return lastName;
	}

	public WebElement DOBInput() {
		dateOFbirth = driver.findElement(By.xpath("// input[@id='customers_dob']"));
		return dateOFbirth;
	}

	public WebElement emailBoxInput() {
		emailBox = driver.findElement(By.xpath("// input[@id='inlineFormInputGroup']"));
		return emailBox;
	}

	public WebElement passwordinput() {
		passwordBox = driver.findElement(By.xpath("// input[@id='password']"));
		return passwordBox;
	}

	public WebElement confirmPasswordInput() {
		confirmPasswordBox = driver.findElement(By.xpath("// input[@id='re_password']"));
		return confirmPasswordBox;
	}

	public WebElement genderBoxInput() {
		genderBox = driver.findElement(By.xpath("// select[@id='inlineFormCustomSelect']"));
		return genderBox;
	}

	public WebElement phoneNumberInput() {
		phoneNumberBox = driver.findElement(By.xpath("//input[@id='phone']"));
		return phoneNumberBox;
	}

	public WebElement checkBox() {
		checkBox = driver
				.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[9]/div[1]/input[1]"));
		return checkBox;
	}

	public WebElement createAccountBox() {
		creatAccoutButton = driver.findElement(By.xpath("//button[contains(text(),'Create an Account')]"));
		return creatAccoutButton;
	}

}
