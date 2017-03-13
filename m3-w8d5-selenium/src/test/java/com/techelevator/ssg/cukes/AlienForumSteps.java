package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.AgeCalculatorInputPage;
import com.techelevator.ssg.pageobject.AgeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.ForumPostInputPage;
import com.techelevator.ssg.pageobject.ForumPostResultsPage;
import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.ForumPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Component
public class AlienForumSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private ForumPage forumPage;
	private ForumPostInputPage forumInput;
	private ForumPostResultsPage forumResult;

	@Autowired
	public AlienForumSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		this.homePage = new HomePage(webDriver);
		this.forumPage = new ForumPage(webDriver);
		this.forumInput = new ForumPostInputPage(webDriver);
		this.forumResult = new ForumPostResultsPage(webDriver);
	}
	
	@Given("^I am on the forum view page$")
	public void goToForumView() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage.clickForumPostLink();
	}
	
	@Given("^I select the forum post page$")
	public void goToForumInput() throws Throwable {
		forumPage.clickForumPostInputLink();
	}
	
	@Given("^I enter a username of (.*)$")
	public void enterUsername(String username) throws Throwable{
		forumInput.inputUsername(username);
	}
	
	@Given("^I enter a subject of (.*)$")
	public void enterSubject(String subject) throws Throwable{
		forumInput.inputSubject(subject);
	}
	
	@Given("^I enter a message of (.*)$")
	public void enterMessage(String message) throws Throwable{
		forumInput.inputMessage(message);
	}
	
	@When("^I submit the forum form$")
	public void submitForum() throws Throwable {
		forumInput.submit();
	}
	
	@Then("^the post is (.*) (.*) (.*)$")
	public void verifyAge(String username, String subject, String message) throws Throwable {
		Assert.assertTrue(forumPage.verifyForumPost(username, subject, message));
	}
}
