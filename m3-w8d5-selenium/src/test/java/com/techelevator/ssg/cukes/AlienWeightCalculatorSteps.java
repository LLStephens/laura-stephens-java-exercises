package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.WeightCalculatorInputPage;
import com.techelevator.ssg.pageobject.WeightCalculatorResultsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Component
public class AlienWeightCalculatorSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private WeightCalculatorInputPage weightInput;
	private WeightCalculatorResultsPage weightResult;

	@Autowired
	public AlienWeightCalculatorSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		this.homePage = new HomePage(webDriver);
		this.weightInput = new WeightCalculatorInputPage(webDriver);
		this.weightResult = new WeightCalculatorResultsPage(webDriver);
	}
	
	@Given("^I am on the weight calculator input page$")
	public void goToWeightCalculatorInput() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage.clickWeightCalculatorLink();
	}
	
	@Given("^I choose the planet (.*)$")
	public void choosePlanet(String planetName) throws Throwable { //comes from given selector
		weightInput.selectPlanet(planetName);
	}
	
	@Given("^I enter a weight of (.*) pounds$")
	public void enterWeight(String weight) throws Throwable{
		weightInput.inputWeight(weight);
	}
	
	@When("^I submit the weight calculator form$")
	public void submitWeightInput() throws Throwable {
		weightInput.submit();
	}
	
	@Then("^the calculated weight is (.*) pounds$")
	public void verifyWeight(String weight) throws Throwable {
		Assert.assertTrue(weightResult.verifyWeight(weight));
	}
}
