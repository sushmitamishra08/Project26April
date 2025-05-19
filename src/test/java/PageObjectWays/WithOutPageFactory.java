package PageObjectWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithOutPageFactory {

	WebDriver driver;
	WithOutPageFactory(WebDriver driver)
	{
	this.driver= driver;	
	}
	
	//locatores
	By userName=By.xpath("//input[@placeholder='Username']");
	By password=By.xpath("//input[@placeholder='Password']");
	By login=By.xpath("//button[@type='submit']");
	
	//Action Methods
	
	public void setUserName(String user)
	{
		
		driver.findElement(userName).sendKeys(user);
		
	}
	 public void setPassword(String pass)
	 {
		 driver.findElement(password).sendKeys(pass);
	 }
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	 
	 
}
