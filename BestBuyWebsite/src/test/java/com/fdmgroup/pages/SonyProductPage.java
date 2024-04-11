package com.fdmgroup.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fdmgroup.global.utilities.BrowserUtilities;

public class SonyProductPage extends BrowserUtilities
{
	public SonyProductPage() // constructor
	{	
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll(@FindBy(xpath = "//*[starts-with(@class,'slick-dots')]/*"))
	private List<WebElement> DotImages;
	Actions action = new Actions(driver);

	public void clicktDots() throws InterruptedException {  //firstDot.click();
		javascriptExecuteScript("window.scrollBy(0,550)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement dotElement;
		for(WebElement element : DotImages)
		{ 
			Thread.sleep(3000);
			dotElement =wait.until(ExpectedConditions.elementToBeClickable(element));
			action.moveToElement(dotElement.findElement(By.tagName("button"))).click().build().perform();
			Thread.sleep(3000);
		}		
		}
	
	public int verifySlideCount()
	{
		return DotImages.size();
	}

	
	@FindBy(xpath="//*[starts-with(@class,'toggleAndSort_')]//*[contains(@type,'checkbox')][@id='availability-toggle']") 
	private WebElement InStockToggle;
	
	public void clickInStockToggle() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement InStockToggle_new =wait.until(ExpectedConditions.elementToBeClickable(InStockToggle));
		Actions action =new Actions(driver);
		action.moveToElement(InStockToggle_new).click().build().perform();	
		
	}
	
	public boolean VerifyInStockEnabled()
	{
		return InStockToggle.isEnabled();
	}
	
		
	@FindBy(xpath="//*[starts-with(@class,'toggleAndSort_')]//*[contains(@type,'checkbox')][@id='bestbuy-only-toggle']")
	private WebElement BestBuyToggle;
	
	public void clickBestBuyToggle() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement BestBuyToggle_new =wait.until(ExpectedConditions.elementToBeClickable(BestBuyToggle));
		Actions action =new Actions(driver);
		action.moveToElement(BestBuyToggle_new).click().build().perform();
	}
	
	
	public boolean VerifyBestBuyEnabled()
	{
		return BestBuyToggle.isEnabled();
	}

	@FindBy(xpath="//*[starts-with(@class,'toggleAndSort_')]//*[@role='button']//*[@id='Sort']")
	private WebElement SortDropdown;
	
	
	public void SelectFromSortDropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Select selectOptions = new Select(SortDropdown);
		List<WebElement> listOptions  = selectOptions.getOptions();
		selectOptions.selectByValue("priceLowToHigh");	
	}
	
	public boolean VerifySortDropdown()
	{
		if(currentUrl().contains("priceLowToHigh")==true)
		{
			System.out.println(currentUrl() + " " + SortDropdown.getText());
			return true;
		}
		else 
		{
			System.out.println(currentUrl() + " " + SortDropdown.getText());
			return false;
		}
	}
	
	@FindBy(xpath="//*[starts-with(@class,'facetContainer')]//*[@class='input']/div/input[@id='facetFilter-CurrentOffers_OnlineOnly']")
	private WebElement onlineOnly;
	
	public void checkOnlineOnly()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement onlineOnlynew = wait.until(ExpectedConditions.elementToBeClickable(onlineOnly));
		Actions action =new Actions(driver);
		System.out.println(onlineOnlynew.getText());
		action.moveToElement(onlineOnlynew).click().build().perform();
	}
	
	
	
	@FindBy(xpath="//*[starts-with(@itemprop,'name')][text()='Previously Played - Sports Champions PlayStation 3 With Manual And Case']")
	private WebElement sonyPlayStation;
	
	public void clickSonyPlayStation()
	{
		
		try {
			sonyPlayStation.click();
		}
		catch(Exception ex)
		{
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement sonyPlayStation_new =wait.until(ExpectedConditions.elementToBeClickable(sonyPlayStation));
			sonyPlayStation_new.click();
		}
	}
	
	public boolean verifyPlayStationClicked()
	{
		System.out.println(currentUrl());
		if(currentUrl().contains("previously-played-sports-champions-playstation-3-with-manual-and-case"))
			return true;
		else
			return false;
	}
	
}
	
	
	
	
