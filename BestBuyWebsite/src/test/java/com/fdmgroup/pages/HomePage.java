package com.fdmgroup.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.fdmgroup.global.utilities.BrowserUtilities;

public class HomePage extends BrowserUtilities
{

	public HomePage() 
	{ 	
		PageFactory.initElements(driver, this);	
	}
	
	
	@FindBy(xpath = "//*[text() ='Shop']")
	private WebElement menuLeftNavigation;
	
	@FindBy(xpath = "//*[starts-with(@class,'style-module_menuLink__')][contains(@title,'Brands')]")
	private WebElement BrandButtonLeftNavigation;
	
	@FindBy(how = How.LINK_TEXT, using = "P Q R S")
	private WebElement PQRSButtonLeftNavigation;
	
	@FindAll(@FindBy(xpath= "//*[starts-with(@data-automation,'menu-p-q-r-s-l3')]/a[@class=\"menuLink_Py2IM\"]"))
	private List<WebElement> PQRSElements;
	
	@FindBy(xpath="//*[starts-with(@data-automation,'menu-p-q-r-s-l3')]/*[text()='Sony']")
	private WebElement SonyLink;
	
	
	//public String displayMainMenu() {return menuLeftNavigation.getText();}
	
	public void clickShopMenu() {menuLeftNavigation.click();}
	
	
	public String displayBrandInMainMenu() {return BrandButtonLeftNavigation.getText();}
	
	public void clickBrand() {BrandButtonLeftNavigation.click();}
		
	
	public String displayPQRSInMainMenu() {return PQRSButtonLeftNavigation.getText();}
	
	public void clickPQRS() {PQRSButtonLeftNavigation.click();}
	
	
	public void clickSonyLink() throws InterruptedException {
		javascriptExecuteScript("window.scrollBy(0,400)");
		Thread.sleep(3);
		SonyLink.click();
	}
	
	


	
	
}
