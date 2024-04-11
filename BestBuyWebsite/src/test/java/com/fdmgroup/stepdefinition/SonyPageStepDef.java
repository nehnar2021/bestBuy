package com.fdmgroup.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.SonyProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SonyPageStepDef 
{
	SonyProductPage sonyProductPage = new SonyProductPage();
	
	
	@Given("Current page is Sony product page")
	public void current_page_is_sony_product_page() {
		sonyProductPage.driverGet(DataFile.sonyURL);
		
		
	}

	@When("User clicks on dots")
	public void user_clicks_on_dots() throws InterruptedException {
		sonyProductPage.clicktDots();
	    
	}

	@Then("Corresponding images are displayed")
	public void corresponding_images_are_displayed() {
		assertEquals(sonyProductPage.verifySlideCount(),3);
	}

	
	@When("User clicks on InStock Toggle Bar")
	public void user_clicks_on_in_stock_toggle_bar() throws InterruptedException {
	  sonyProductPage.clickInStockToggle();
	
	}

	@Then("InStock Toggle Bar toggles")
	public void in_stock_toggle_bar_toggles() {
	   System.out.println(sonyProductPage.VerifyInStockEnabled());
		assertTrue(sonyProductPage.VerifyInStockEnabled());
	  	}

	
	@When("User clicks on BestBuy Toggle Bar")
	public void user_clicks_on_best_buy_toggle_bar() {
	   sonyProductPage.clickBestBuyToggle();
	}

	@Then("BestBuy Toggle Bar toggles")
	public void best_buy_toggle_bar_toggles() {
		System.out.println(sonyProductPage.VerifyBestBuyEnabled());
		assertTrue(sonyProductPage.VerifyBestBuyEnabled());
	}

	@When("User selects priceLowToHigh")
	public void user_selects_price_low_to_high() 
	{ 
	    sonyProductPage.SelectFromSortDropdown();
	}

	@Then("Products sort with price Low to high")
	public void products_sort_with_price_low_to_high() {
		assertTrue(sonyProductPage.VerifySortDropdown());
	 }
	
	

	@When("User checks Online Only checkbox")
	public void user_checks_online_only_checkbox() {
   sonyProductPage.checkOnlineOnly();
	}


	@When("User clicks on Playstation Image Box")
	public void user_clicks_on_playstation_image_box() throws InterruptedException {
		 sonyProductPage.clickSonyPlayStation();
	}
	
	@Then("User is directed towards Playstation page")
	public void user_is_directed_towards_playstation_page() throws InterruptedException {
		assertTrue(sonyProductPage.verifyPlayStationClicked());
	}
	
}