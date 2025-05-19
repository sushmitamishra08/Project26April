package com.medimentionTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Medimention.utilities.DataProviders;
import com.github.javafaker.Faker;
import com.medimention_pageObject.AccountPage;
import com.medimention_pageObject.Front_Page;
import com.medimention_pageObject.HomePage;
import com.medimention_pageObject.RegisterPage;

public class TC_001_Register_DDT extends BaseClass {
	
	@Test(dataProvider="RegData" ,dataProviderClass= DataProviders.class)
	public void account_Register(String B_Name, String U_name, String U_email, String pass, String conpass)
	{
		Front_Page fp= new Front_Page(driver);
		HomePage hp= new HomePage(driver);
		RegisterPage rp= new RegisterPage(driver);
		//Faker fake= new Faker();
		
		AccountPage ap= new AccountPage(driver);
//		String password=fake.internet().password();
//		   String UserEmail=fake.internet().emailAddress();
//		   String BusName=fake.name().name();
//		   String UserName=fake.name().firstName();//No space in user name condition is given
		try { 
		fp.homebtn();
		
	    hp.registerbtn();
	    rp.selectedGroup();
	    rp.BloodBank();
	    rp.BName(B_Name);
	    rp.setUserName(U_name);
	    rp.setEmail(U_email);
	    rp.setPassword(pass);
	    rp.setConPas(conpass);
	    rp.setTerms();
	    
	    rp.regButton();
	    
	    System.out.println(B_Name+" "+U_name+" "+U_email+" "+pass);
	    
	    System.out.println(ap.AccHeading());
	    System.out.println(ap.NameText());
	    Assert.assertTrue(ap.AccHeading().contains(B_Name));
	    Assert.assertEquals(ap.NameText(),B_Name);
	    
	    ap.logoutDrop();
	    ap.logout();
	    hp.MediHeading();
	    }catch(Exception e)
		{
	    	driver.navigate().refresh();
		}
	    
	    
	
	
	}

}
