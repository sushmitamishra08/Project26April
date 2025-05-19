package com.medimention_pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


	public class AccountPage extends BasePage {
		WebDriver driver;
		
		public AccountPage(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="//a[@class='navbar-brand']/small")
		@CacheLookup
		WebElement AccHead;
		
		@FindBy(xpath="//input[@id='DetailName']")
		@CacheLookup
		WebElement nameText;
		
		@FindBy(xpath="//li[@class='green']//i[@class='ace-icon fa fa-caret-down']")
		@CacheLookup
	   WebElement Accbuttons;
		
		@FindBy(xpath="//a[normalize-space()='Logout']")
		@CacheLookup
		WebElement logoutbtn; ;
		
		public String AccHeading()
		{
			return AccHead.getText();
		}
		
		public String NameText()
		{
			String attri= nameText.getDomAttribute("value");
			return attri;
		}
		 
		public void logoutDrop()
		{
			Accbuttons.click();
		}
		
		
		public void logout()
		{
			logoutbtn.click();
		}
		
}
