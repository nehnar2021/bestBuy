package com.fdmgroup.global.utilities;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.devtools.v120.fetch.model.AuthChallengeResponse.Response;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Hooks extends BrowserUtilities {

	
	@Before
	public void setup() {
		driverUtilities = getInstance();
		driver = driverUtilities.getDriver();
		BrowserUtilities.maximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
}
