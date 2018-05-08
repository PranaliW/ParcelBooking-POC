package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParcelPage {

	public static WebElement shop_Collect(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='button'][contains(text(),'Shop & Collect')]"));
	}

	public static WebElement postCode(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='collectInput']"));
	}

	public static WebElement findParcel(WebDriver driver) {
		return driver.findElement(By.xpath(
				"//form[@action='/shop-and-collect']//div[@class='form-group']//div[@class='row']//div[@class='col-xs-3 pl-0']//button[@type='submit']"));
	}
}