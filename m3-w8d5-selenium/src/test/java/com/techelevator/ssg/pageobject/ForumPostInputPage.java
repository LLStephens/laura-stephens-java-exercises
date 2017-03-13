package com.techelevator.ssg.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ForumPostInputPage {
	private WebDriver webDriver;
	
	public ForumPostInputPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public void inputUsername(String username){
		WebElement usernameInput = webDriver.findElement(By.name("username"));
		usernameInput.sendKeys(username);
	}
	
	public void inputSubject(String subject){
		WebElement subjectInput = webDriver.findElement(By.name("subject"));
		subjectInput.sendKeys(subject);
	}
	
	public void inputMessage(String message){
		WebElement messageInput = webDriver.findElement(By.name("message"));
		messageInput.sendKeys(message);
	}
	
	public ForumPage submit(){
		WebElement submitButton = webDriver.findElement(By.className("formSubmitButton"));
		submitButton.submit();
		return new ForumPage(webDriver);
	}
}
