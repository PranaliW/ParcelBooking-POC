package com.page.objects;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookParcel {

	public static WebElement Location(WebDriver driver) {
		return driver.findElement(
				By.xpath("//li[@id='store-2150-01']//div[@class='store store-information']//div[@class='title']"));
	}

	public static WebElement online_Store(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='delivery-online-store']"));
	}

	public static WebElement order_Number(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='delivery-online-information']"));
	}

	public static WebElement contactDetails_Name(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='delivery-name-createAccount']"));
	}

	public static String getEmail() {
		Random rand = new Random();
		int n = rand.nextInt(60) + 1;
		return "abcxyz" + String.valueOf(n) + "@gmail.com";
	}

	public static WebElement contactDetails_Email(WebDriver driver) {

		return driver.findElement(By.xpath("//input[@id='delivery-email-createAccount']"));

	}

	public static WebElement contactDetails_Mobile(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='delivery-mobile-createAccount']"));
	}

	public static WebElement paymentDetails_Name(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='customerName']"));
	}

	public static WebElement paymentDetails_Card(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='creditCard']"));
	}

	public static WebElement paymentDetails_ExpiryMonth(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//select[@id='expirationMonth']"));
		Select select = new Select(element);
		select.selectByIndex(4);
		return element;
	}

	public static WebElement paymentDetails_ExpiryYear(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//select[@id='expirationYear']"));
		Select select = new Select(element);
		select.selectByIndex(5);
		return element;
	}

	public static WebElement paymentDetails_CVV(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='cvv']"));
	}

	public static WebElement book_Parcel(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='button-pp btn-large btn-block button-primary']"));
	}

}
