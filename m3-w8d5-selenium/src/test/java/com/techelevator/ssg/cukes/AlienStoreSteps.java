package com.techelevator.ssg.cukes;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.ssg.pageobject.CartPage;
import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.StoreInputPage;
import com.techelevator.ssg.pageobject.StorePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@Component
public class AlienStoreSteps {
	private WebDriver webDriver;
	private HomePage homePage;
	private StorePage storePage;
	private StoreInputPage storeInput;
	private CartPage cart;

	@Autowired
	public AlienStoreSteps(WebDriver webDriver){
		this.webDriver = webDriver;
		this.homePage = new HomePage(webDriver);
		this.storePage = new StorePage(webDriver);
		this.storeInput = new StoreInputPage(webDriver);
		this.cart = new CartPage(webDriver);
	}
	
	@Given("^I am on the store view page$")
	public void goToStoreView() throws Throwable {
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage.clickStorePage();
	}
	
	@Given("^I select the input page for (.*)$")
	public void goToStoreInput(String product) throws Throwable {
		storePage.clickStoreInputPage(product);
	}
	
	@Given("^I enter a quantity of (.*)$")
	public void enterQuantity(String quantity) throws Throwable{
		storeInput.inputQuantity(quantity);
	}
	
	@When("^I submit the store form$")
	public void submitStoreForm() throws Throwable {
		storeInput.submit();
	}
	
	@Then("^the cart has (.*) items$")
	public void verifyCart(String quantity) throws Throwable {
		Assert.assertTrue(cart.verifyCart(quantity));
	}
}
