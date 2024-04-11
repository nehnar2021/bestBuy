package com.fdmgroup.stepdefinition;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.global.utilities.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainMenuStepDef 
{
	HomePage homePage = new HomePage();
	BrowserUtilities util = new BrowserUtilities();
	

	@Given("User launch the homepage")
	public void user_launch_the_homepage() {
		homePage.driverGet(DataFile.homeuRL);
	}

	@Given("User clicks Shop menu button")
	public void user_clicks_shop_menu_button() {
		homePage.clickShopMenu();
	}

	@Given("User sees Brands option on left navigation")
	public void user_sees_brands_option_on_left_navigation() {
		assertEquals(DataFile.BrandInMainMenu, homePage.displayBrandInMainMenu());
		homePage.clickBrand();
	}

	@Given("User sees PQRS Brands option")
	public void user_sees_pqrs_brands_option() {
		assertEquals(DataFile.PQRSInbrandMenu, homePage.displayPQRSInMainMenu());
	}

	@When("User clicks PQRS Brands option")
	public void user_clicks_pqrs_brands_option() {
		 homePage.clickPQRS();
	}

	@When("User clicks Sony Brand")
	public void user_clicks_sony_brand() throws InterruptedException {
		
		homePage.clickSonyLink();
		 
	}

	@Then("User a new page launches with Sony products")
	public void user_a_new_page_launches_with_sony_products() throws InterruptedException {
		Thread.sleep(10);
	    assertEquals(DataFile.sonyURL,util.currentUrl());
	   
	
	
	}
	
	
}
