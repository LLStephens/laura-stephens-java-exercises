package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DistanceCalculatorResultsPage {
	private WebDriver webDriver;
	
	public DistanceCalculatorResultsPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public boolean verifyDistance(String age){
		WebElement outputDistance = webDriver.findElement(By.id("ageOutput"));
		return outputDistance.getText().equals(age);
	}
	
	public boolean verifyYears(String age){
		WebElement outputYears = webDriver.findElement(By.id("yearsOutput"));
		return outputYears.getText().equals(age);
	}
}
