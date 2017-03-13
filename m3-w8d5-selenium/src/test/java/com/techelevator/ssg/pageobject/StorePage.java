package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StorePage {
private WebDriver webDriver;
	
	public StorePage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public StoreInputPage clickStoreInputPage(String product){
		WebElement link = webDriver.findElement(By.linkText(product));
		link.click();
		return new StoreInputPage(webDriver);
	}

}
