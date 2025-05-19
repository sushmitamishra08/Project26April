package PageObjectWays;
//import PageObjectWays.WithOutPageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testLogIn()
	{
		//WithOutPageFactory wpf= new WithOutPageFactory(driver);
		WithPageFactory wpf= new WithPageFactory(driver);
		wpf.setUserName("Admin");
		wpf.setPassword("admin123");
		//wpf.clickLogin();
		wpf.click_btn();
		boolean dashboard=driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		Assert.assertTrue(dashboard);
	
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
