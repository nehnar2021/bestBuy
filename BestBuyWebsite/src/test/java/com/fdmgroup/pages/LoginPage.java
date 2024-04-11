package com.fdmgroup.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.fdmgroup.global.utilities.BrowserUtilities;

public class LoginPage extends BrowserUtilities
{

	public LoginPage() 
	{ 	
		PageFactory.initElements(driver, this);	
	}


	@FindBy(xpath="//*[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//*[contains(@class,'signin-form-button')]//span[text()='Sign In']")
	private WebElement signIn;

	@FindBy(xpath="//*[@data-automation='greeting-message']")
	private WebElement greetingMessage;
	
	@FindBy(xpath="//*[contains(@class,'page-title')]/span")
	private WebElement signinTitle;
	
	@FindBy(xpath="//*[contains(@class,'signin-form-container')]/div['form-warning-message']")
	private WebElement warning;
	
	
	public void enterUsername(String strUsername)
	{
		username.sendKeys(strUsername);
	}
	
	public void enterPassword(String strPassword)
	{
		password.sendKeys(strPassword);
	}
	
	public boolean displayGreeting() {
		return greetingMessage.isDisplayed();
	}
	
	public boolean displayWarning() {
		return warning.isDisplayed();
	}
	
	public void clickSignIn()
	{
		signIn.click();
	}
	
	public String getTitle()
	{
		return signinTitle.getText();
	}
	
}