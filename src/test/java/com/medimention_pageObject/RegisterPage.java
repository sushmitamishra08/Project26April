package com.medimention_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	@FindBy(xpath="//button[@data-id='UserRole']")
	@CacheLookup
	WebElement dropdown;
	
	
	@FindBy(xpath="//span[text()='Blood Bank']")
	@CacheLookup
	WebElement bb;
	
	@FindBy(xpath="//input[@id='DetailName']")
	@CacheLookup
	WebElement BussName;
	
	
	@FindBy(xpath="//input[@id='UserUsername']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@id='UserEmail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@id='UserPassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@id='UserPassword1']")
	@CacheLookup
	WebElement confompas;
	
	
	@FindBy(xpath="//input[@name='terms']")
	@CacheLookup
	WebElement terms;
	
	@FindBy(xpath="//span[text()='Register']")
	@CacheLookup
	WebElement regbtn;
	
	
	
	
	
	public void selectedGroup()
	{
		dropdown.click();
	}

	public void BloodBank()
	{
		bb.click();
	}
		
		public void BName(String name)
		{
			BussName.sendKeys(name);
		}
		public void setUserName(String user)
		{
			username.sendKeys(user);
		}
		public void setEmail(String useremail)
		{
			email.sendKeys(useremail);
		}
		
		
		
		public void setPassword(String pass)
		{
			password.sendKeys(pass);
		}
		
		public void setConPas(String confompass)
		{
			confompas.sendKeys(confompass);
		}
		
		
		public void setTerms()
		{
			terms.click();
		}
		
		public void regButton()
		{
			regbtn.click();
		}
		
	
}
