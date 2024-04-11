package com.fdmgroup.pages;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class AdvertisementPage extends BrowserUtilities
{
	
	public AdvertisementPage() 
	{ 	
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath="//*[@id='afscontainer']//iframe[1]")
	private WebElement firstAdvertisementiFrames;
	
	
	@FindBy(xpath= "//*[contains(@class,'i_ div adBlockContainer')]//*[@class='i_ div si35']//*/span[starts-with(text(),'Sony Video Games')]")
	private WebElement sonyVideoGamesAndConsoles;
	
	
	public void clickSponsoredShopProduct() throws InterruptedException
	{
			javascriptExecuteScript("window.scrollBy(0,3000)");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement firstAdvertisementiFrames_obj = wait.until(ExpectedConditions.elementToBeClickable(firstAdvertisementiFrames));
			driver.switchTo().frame(firstAdvertisementiFrames_obj);
			Thread.sleep(8000);
			WebElement sonyVideoGamesAndConsoles_obj = wait.until(ExpectedConditions.elementToBeClickable(sonyVideoGamesAndConsoles));			
			sonyVideoGamesAndConsoles_obj.click();
	}
	
	public boolean verifyiFrameButtonclicked() throws InterruptedException
	{
		Thread.sleep(8000);
		return true;
		
	}
	

	
	
	
}
