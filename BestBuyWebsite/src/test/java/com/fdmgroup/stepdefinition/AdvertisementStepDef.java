package com.fdmgroup.stepdefinition;


import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.pages.AdvertisementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvertisementStepDef 
{

AdvertisementPage advertisementPage = new AdvertisementPage();
BrowserUtilities util = new BrowserUtilities();

@Given("User is on a selected Play Station Page")
public void user_is_on_a_selected_play_station_page() {
	
	System.out.println(util.currentUrl());
	advertisementPage.driverGet(util.currentUrl());	
}

@When("User clicks on a game from sponsorsed shop related product")
public void user_clicks_on_a_game_from_sponsorsed_shop_related_product() throws InterruptedException {
	advertisementPage.clickSponsoredShopProduct();
	
}

@Then("A different website launches with the game details")
public void a_different_website_launches_with_the_game_details() throws InterruptedException {
	assertTrue(advertisementPage.verifyiFrameButtonclicked());
	
}
}
