package com.techelevator.ssg.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumPage {
private WebDriver webDriver;
	
	public ForumPage(WebDriver webDriver){
		this.webDriver = webDriver;
	}
	
	public ForumPostInputPage clickForumPostInputLink(){
		WebElement link = webDriver.findElement(By.linkText("Post a message"));
		link.click();
		return new ForumPostInputPage(webDriver);
	}
	
	public boolean verifyForumPost(String username, String subject, String message){
		List<WebElement> name = webDriver.findElements(By.id("username"));
		WebElement outputUsername = name.get(name.size()-1);
		WebElement outputSubject = webDriver.findElement(By.cssSelector(".post:last-of-type > h4"));
		List<WebElement> outputMessage = webDriver.findElements(By.className("message"));
		WebElement elem = outputMessage.get(outputMessage.size()-1);
		return outputUsername.getText().equals(username) && outputSubject.getText().equals(subject) && elem.getText().equals(message);
	}
	
	
}
