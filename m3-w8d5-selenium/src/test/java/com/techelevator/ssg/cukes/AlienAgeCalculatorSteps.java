package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.AgeCalculatorInputPage;
import com.techelevator.ssg.pageobject.AgeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Component
public class AlienAgeCalculatorSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private AgeCalculatorInputPage ageInput;
	private AgeCalculatorResultsPage ageResult;

	@Autowired
	public AlienAgeCalculatorSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		this.homePage = new HomePage(webDriver);
		this.ageInput = new AgeCalculatorInputPage(webDriver);
		this.ageResult = new AgeCalculatorResultsPage(webDriver);
	}
	
	@Given("^I am on the age calculator input page$")
	public void goToAgeCalculatorInput() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage.clickAgeCalculatorLink();
	}
	
	@Given("^I select the planet (.*)$")
	public void choosePlanet(String planetName) throws Throwable { //comes from given selector
		ageInput.selectPlanet(planetName);
	}
	
	@Given("^I enter a age of (.*) years$")
	public void enterAge(String age) throws Throwable{
		ageInput.inputAge(age);
	}
	
	@When("^I submit the age calculator form$")
	public void submitAgeInput() throws Throwable {
		ageInput.submit();
	}
	
	@Then("^the calculated age is (.*) years$")
	public void verifyAge(String age) throws Throwable {
		Assert.assertTrue(ageResult.verifyAge(age));
	}
}
