package com.fdmgroup.stepdefinition;


import static org.junit.Assert.assertTrue;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef 
{

LoginPage loginPage = new LoginPage();
BrowserUtilities util = new BrowserUtilities();


@Given("User is on login Page")
public void user_is_on_login_page() {
	//util.getDriver().navigate().to(DataFile.sonyPlayStationURL);
	loginPage.driverGet(util.currentUrl());
}

@When("User enters username as {string}")
public void user_enters_username_as(String strUsername) {
    loginPage.enterUsername(strUsername);
}

@When("User enters password as {string}")
public void user_enters_password_as(String strPassword) {
    loginPage.enterPassword(strPassword);
}

@When("User clicks submit button")
public void user_clicks_submit_button() {
    loginPage.clickSignIn();
}

@Then("Username appears on the left side of the website")
public void username_appears_on_the_left_side_of_the_website() {
    	assertTrue(loginPage.displayWarning()); 
    	util.quitDriver();
}



}