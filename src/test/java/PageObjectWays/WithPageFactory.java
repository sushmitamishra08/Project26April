package PageObjectWays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithPageFactory {

	WebDriver driver;
	
	WithPageFactory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement btn_login;
	
	
	//Actions
	public void setUserName(String user)
	{
		
		username.sendKeys(user);
		
	}
	 public void setPassword(String pass)
	 {
		password.sendKeys(pass);
	 }
	public void click_btn()
	{
		btn_login.click();
	}
	 
	
	
	
	
	
	
}
