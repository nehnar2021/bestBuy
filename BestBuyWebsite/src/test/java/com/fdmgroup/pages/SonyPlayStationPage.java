package com.fdmgroup.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class SonyPlayStationPage extends BrowserUtilities
{
	@FindAll(@FindBy(xpath="//*[starts-with(@class,'productOfferDetailsGridArea_')]//form//button[@data-automation='addToCartButton']"))
	private List<WebElement> addToCart;
	
	@FindBy(xpath="//*[@class='toaster']//*[text()='View Cart']")
	private WebElement viewCart;

	@FindBy(xpath = "section[class='toaster']") 
	private WebElement crossBox;
	
	@FindBy(xpath="//*[starts-with(@class,'title_')][text()='Your Cart']")
	private WebElement VerifyTitle;
	
	@FindBy(xpath="//*[starts-with(@class,'signInOutNavContainer_')]")
	private WebElement account;
	
	@FindBy(xpath="//*[contains(@class,'page-title')]/span")
	private WebElement signinTitle;
	
	public SonyPlayStationPage() 
	{ 	
		PageFactory.initElements(driver, this);	
	}
	
	
	public void clickAccount()
	{
		account.click();
	}
	
	public String getTitle()
	{
		return signinTitle.getText();
	}
	
	public void quit() {
		quitDriver();
	}
	
	
}