package com.techelevator.ssg;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.techelevator.ssg.pageobject.DistanceCalculatorInputPage;
import com.techelevator.ssg.pageobject.DistanceCalculatorResultsPage;
import com.techelevator.ssg.pageobject.HomePage;

public class TimeTest {
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
	public void test_distance_calc_mercury_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Mercury");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("2,167"));
		Assert.assertTrue(result.verifyDistance("2,179"));
	}
	
	@Test
	public void test_distance_calc_mercury_car(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Mercury");
		distanceInput.selectMode("Car");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("65"));
		Assert.assertTrue(result.verifyDistance("77"));
	}
	@Test
	public void test_distance_calc_mercury_bullet_train(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Mercury");
		distanceInput.selectMode("Bullet Train");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("32"));
		Assert.assertTrue(result.verifyDistance("44"));
	}
	@Test
	public void test_distance_calc_mercury_boeing(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Mercury");
		distanceInput.selectMode("Boeing 747");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("11"));
		Assert.assertTrue(result.verifyDistance("23"));
	}
	@Test
	public void test_distance_calc_mercury_concord(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Mercury");
		distanceInput.selectMode("Concorde");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("4"));
		Assert.assertTrue(result.verifyDistance("16"));
	}
	
	@Test
	public void test_distance_calc_venus_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Venus");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("978"));
		Assert.assertTrue(result.verifyDistance("990"));
	}
	
	@Test
	public void test_distance_calc_mars_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Mars");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("1,852"));
		Assert.assertTrue(result.verifyDistance("1,864"));
	}
	
	@Test
	public void test_distance_calc_jupiter_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Jupiter");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("14,865"));
		Assert.assertTrue(result.verifyDistance("14,877"));
	}
	
	@Test
	public void test_distance_calc_saturn_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Saturn");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("30,146"));
		Assert.assertTrue(result.verifyDistance("30,158"));
	}
	
	@Test
	public void test_distance_calc_neptune_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Neptune");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("102,890"));
		Assert.assertTrue(result.verifyDistance("102,902"));
	}
	
	@Test
	public void test_distance_calc_uranus_walking(){
		DistanceCalculatorInputPage  distanceInput = homePage.clickDistanceCalculatorLink();
		distanceInput.selectPlanet("Uranus");
		distanceInput.selectMode("Walking");
		distanceInput.inputAge("12");
		DistanceCalculatorResultsPage result = distanceInput.submit();
		Assert.assertTrue(result.verifyYears("64,408"));
		Assert.assertTrue(result.verifyDistance("64,420"));
	}
}
