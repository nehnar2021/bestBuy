package com.fdmgroup.global.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities extends DriverUtilities {

	private WebDriverWait explicitWait;
	public static DriverUtilities driverUtilities;
	public static WebDriver driver;


	// Javascript Executor
	public void javascriptExecuteScript(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
	}


	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void driverGet(String url) {
		driver.get(url);
	}


	public String currentUrl() {
		return driver.getCurrentUrl();
	}	
	
	public void quitDriver()
	{
		driver.quit();
	}


}
