package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WeightCalculatorInputPage {
	private WebDriver webDriver;
	
	public WeightCalculatorInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void selectPlanet(String planetName){
		WebElement selectElement = webDriver.findElement(By.id("planet")); //planet is select tag in jsp
		Select select = new Select(selectElement);
		select.selectByVisibleText(planetName);
	}
	
	public void inputWeight(String weight){
		WebElement weightInput = webDriver.findElement(By.name("earthWeight"));
		weightInput.sendKeys(weight);
	}
	
	public WeightCalculatorResultsPage submit(){
		WebElement submitButton = webDriver.findElement(By.className("formSubmitButton"));
		submitButton.submit();
		return new WeightCalculatorResultsPage(webDriver);
	}
}
