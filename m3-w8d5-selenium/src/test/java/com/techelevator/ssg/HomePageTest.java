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
import com.techelevator.ssg.pageobject.CartPage;
import com.techelevator.ssg.pageobject.DistanceCalculatorInputPage;
import com.techelevator.ssg.pageobject.DistanceCalculatorResultsPage;
import com.techelevator.ssg.pageobject.ForumPage;
import com.techelevator.ssg.pageobject.ForumPostInputPage;
import com.techelevator.ssg.pageobject.ForumPostResultsPage;
import com.techelevator.ssg.pageobject.HomePage;
import com.techelevator.ssg.pageobject.StoreInputPage;
import com.techelevator.ssg.pageobject.StorePage;
import com.techelevator.ssg.pageobject.WeightCalculatorInputPage;
import com.techelevator.ssg.pageobject.WeightCalculatorResultsPage;

public class HomePageTest {
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
	public void test_forum_post(){
		ForumPage  forum = homePage.clickForumPostLink();
		ForumPostInputPage forumInput = forum.clickForumPostInputLink();
		forumInput.inputUsername("Al");
		forumInput.inputSubject("cats");
		forumInput.inputMessage("Test");
		forum = forumInput.submit();
		
		Assert.assertTrue(forum.verifyForumPost("Al", "cats", "Test"));
	}
	
	@Test public void test_store() {
		StorePage store = homePage.clickStorePage();
		StoreInputPage storeInput = store.clickStoreInputPage("Coffee Mug");
		storeInput.inputQuantity("5");
		CartPage cart = storeInput.submit();
		Assert.assertTrue(cart.verifyCart("5"));

	}
	
}
