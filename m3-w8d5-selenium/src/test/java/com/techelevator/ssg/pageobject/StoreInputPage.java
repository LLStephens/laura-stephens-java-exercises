package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreInputPage {
	private WebDriver webDriver;
	
	public StoreInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void inputQuantity(String quantity){
		WebElement quantityInput = webDriver.findElement(By.name("quantity"));
		quantityInput.sendKeys(quantity);
	}
	
	public CartPage submit(){
		WebElement submitButton = webDriver.findElement(By.className("cartButton"));
		submitButton.submit();
		return new CartPage(webDriver);
	}
	
	public CartPage clickCartLink(){
		WebElement link = webDriver.findElement(By.linkText("Add to cart"));
		link.click();
		return new CartPage(webDriver);
	}
	
}


