package com.medimention_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Front_Page extends BasePage{ 
	
	WebDriver driver;
	 public Front_Page(WebDriver driver)
	 {
		 super(driver);
	 }

	 
	 @FindBy(xpath="//a[text()='Home']")
		@CacheLookup
		WebElement home;
		
		public void homebtn()
		{
			home.click();
		}
}
