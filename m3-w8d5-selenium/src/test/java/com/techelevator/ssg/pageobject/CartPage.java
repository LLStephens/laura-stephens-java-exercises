package com.techelevator.ssg.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	private WebDriver webDriver;
	
	public CartPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public boolean verifyCart(String quantity){
		WebElement outputStore = webDriver.findElement(By.id("quantity"));
		return outputStore.getText().equals(quantity);
	}
}
