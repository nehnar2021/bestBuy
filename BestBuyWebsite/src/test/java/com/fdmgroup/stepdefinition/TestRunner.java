package com.fdmgroup.stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.SonyProductPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
					glue= {"com.fdmgroup"},
					publish=true,
					plugin= {"pretty","html:target/cucumber.html",
										"json:target/cucumber.json",
										"junit:target/cucumber.xml"}
					)
public class TestRunner {
	

}
