package com.techelevator.ssg;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.AgeCalculatorInputPage;
import com.techelevator.ssg.pageobject.AgeCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;

public class AgeTest {
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
	public void test_age_calc_mercury(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Mercury");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("174.28"));
	}
	
	@Test
	public void test_age_calc_venus(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Venus");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("68.23"));
	}
	
	@Test
	public void test_age_calc_mars(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Mars");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("22.32"));
	}
	
	@Test
	public void test_age_calc_jupiter(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Jupiter");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("3.54"));
	}
	
	@Test
	public void test_age_calc_saturn(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Saturn");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("1.43"));
	}
	
	@Test
	public void test_age_calc_neptune(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Neptune");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("0.25"));
	}
	
	@Test
	public void test_age_calc_uranus(){
		AgeCalculatorInputPage  ageInput = homePage.clickAgeCalculatorLink();
		ageInput.selectPlanet("Uranus");
		ageInput.inputAge("42");
		AgeCalculatorResultsPage result = ageInput.submit();
		Assert.assertTrue(result.verifyAge("0.5"));
	}
}
