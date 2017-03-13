package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DistanceCalculatorInputPage {
	private WebDriver webDriver;
	
	public DistanceCalculatorInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void selectPlanet(String planetName){
		WebElement selectElement = webDriver.findElement(By.id("planet")); //planet is select tag in jsp
		Select select = new Select(selectElement);
		select.selectByVisibleText(planetName);
	}
	
	public void selectMode(String mode){
		WebElement selectElement = webDriver.findElement(By.id("mode")); 
		Select select = new Select(selectElement);
		select.selectByVisibleText(mode);
	}
	
	public void inputAge(String age){
		WebElement distanceInput = webDriver.findElement(By.name("age"));
		distanceInput.sendKeys(age);
	}
	
	public DistanceCalculatorResultsPage submit(){
		WebElement submitButton = webDriver.findElement(By.className("formSubmitButton"));
		submitButton.submit();
		return new DistanceCalculatorResultsPage(webDriver);
	}
}
