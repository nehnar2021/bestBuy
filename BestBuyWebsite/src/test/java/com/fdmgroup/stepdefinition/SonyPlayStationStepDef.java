package com.fdmgroup.stepdefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.pages.SonyPlayStationPage;
import com.fdmgroup.pages.SonyProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SonyPlayStationStepDef 
{
	
	SonyPlayStationPage sonyPlayStation = new SonyPlayStationPage();
	
	
	@Given("User is on a selected Play Station Product")
	public void user_is_on_a_selected_play_station_product() {
		
		BrowserUtilities util = new BrowserUtilities();
		sonyPlayStation.driverGet(util.currentUrl());
		
	}
	
	@When("User clicks on account link")
	public void user_clicks_on_account_link() throws InterruptedException {
		
		Thread.sleep(3000);
		sonyPlayStation.clickAccount();
    
	}
	
	@Then("Signin page appears")
	public void signin_page_appears() {
		System.out.println(sonyPlayStation.getTitle());
    	assertEquals(sonyPlayStation.getTitle(),DataFile.signIn);
     	
	}

}

