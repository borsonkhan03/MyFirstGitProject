package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class MenModel extends ModelBase {

	// in this page we will keep all webelement;
	public MenModel(WebDriver driver) {
		super(driver);

	}

	public WebElement menButton = null;
	public WebElement menViewDetails = null;

	public WebElement menButton() {
		menButton = driver.findElement(By.xpath("//header/div[3]/div[1]/nav[1]/div[1]/ul[1]/li[2]"));
		return menButton;
	}

	public WebElement menViewDetails() {
		menViewDetails = driver.findElement(By.cssSelector(
				"body.animation-s2:nth-child(2) section.pro-content:nth-child(14) section.shop-content.shop-two div.container:nth-child(1) div.row div.col-12.col-lg-9:nth-child(2) div.products-area section.shop-content div.products-area div.row div.col-12.col-lg-4.col-sm-6.griding:nth-child(1) div.product.product11 article:nth-child(1) div.content div:nth-child(5) > a.btn.btn-secondary.btn-lg.btn-block.icon.swipe-to-top.cart"));
		return menViewDetails;
	}

}