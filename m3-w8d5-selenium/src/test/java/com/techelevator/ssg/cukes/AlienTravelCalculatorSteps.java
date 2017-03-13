package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.AgeCalculatorInputPage;
import com.techelevator.ssg.pageobject.AgeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.DistanceCalculatorInputPage;
import com.techelevator.ssg.pageobject.DistanceCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Component
public class AlienTravelCalculatorSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private DistanceCalculatorInputPage distanceInput;
	private DistanceCalculatorResultsPage distanceResult;

	@Autowired
	public AlienTravelCalculatorSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		this.homePage = new HomePage(webDriver);
		this.distanceInput = new DistanceCalculatorInputPage(webDriver);
		this.distanceResult = new DistanceCalculatorResultsPage(webDriver);
	}
	
	@Given("^I am on the travel calculator input page$")
	public void goToAgeCalculatorInput() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage.clickDistanceCalculatorLink();
	}
	
	@Given("^I pick the planet (.*)$")
	public void choosePlanet(String planetName) throws Throwable { //comes from given selector
		distanceInput.selectPlanet(planetName);
	}
	
	@Given("^I pick the mode (.*)$")
	public void chooseMod(String mode) throws Throwable { //comes from given selector
		distanceInput.selectMode(mode);
	}
	
	@Given("^I enter an age of (.*) years old$")
	public void enterAge(String age) throws Throwable{
		distanceInput.inputAge(age);
	}
	
	@When("^I submit the travel calculator form$")
	public void submitAgeInput() throws Throwable {
		distanceInput.submit();
	}
	
	@Then("^the calculated age is (.*) years old$")
	public void verifyAge(String age) throws Throwable {
		Assert.assertTrue(distanceResult.verifyDistance(age));
	}
}
