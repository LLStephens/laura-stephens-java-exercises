package com.techelevator.ssg;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.WeightCalculatorInputPage;
import com.techelevator.ssg.pageobject.WeightCalculatorResultsPage;

public class WeightTest {
	private static WebDriver webDriver;
	private HomePage homePage;
	
	@BeforeClass
	public static void createWebDriver(){
		String homeDir = System.getProperty("user.home"); //gets home directory for use that is logged in
		System.setProperty("webdriver.chrome.driver", homeDir+"/dev-tools/chromedriver/chromedriver");
		webDriver = new ChromeDriver();
	}
	
	@Before
	public void goHome(){
		webDriver.get("http://localhost:8080/m3-java-ssg-exercises-pair/");
		homePage = new HomePage(webDriver);
	}
	
	@AfterClass
	public static void closesWebDriver() {
		webDriver.close();
	}
	
	@Test
	public void test_weight_calc_mercury(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Mercury");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("37"));
	}
	@Test
	public void test_weight_calc_venus(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Venus");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("90"));
	}
	
	@Test
	public void test_weight_calc_mars(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Mars");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("38"));
	}
	
	@Test
	public void test_weight_calc_Jupiter(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Jupiter");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("265"));
	}
	
	@Test
	public void test_weight_calc_saturn(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Saturn");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("113"));
	}
	
	@Test
	public void test_weight_calc_uranus(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Uranus");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("109"));
	}
	
	@Test
	public void test_weight_calc_neptune(){
		WeightCalculatorInputPage  weightInput = homePage.clickWeightCalculatorLink();
		weightInput.selectPlanet("Neptune");
		weightInput.inputWeight("100");
		WeightCalculatorResultsPage result = weightInput.submit();
		Assert.assertTrue(result.verifyWeight("143"));
	}
	
	
}
