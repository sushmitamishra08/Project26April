package com.medimentionTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.medimention_pageObject.*;

public class TC_001_Registration extends BaseClass {

	@Test(groups="Regression")
	public void account_Register()
	{
		Front_Page fp= new Front_Page(driver);
		HomePage hp= new HomePage(driver);
		RegisterPage rp= new RegisterPage(driver);
		Faker fake= new Faker();
		
		AccountPage ap= new AccountPage(driver);
//
//		   String password=randomStr()+randomNum();
//		   String UserEmail=randomStr()+"@xyz.com";
//		   String BusName=randomStr();
//		   String UserName=randomStr()+randomNum();
		   
		//faker new for get data form user
		
	   String password=fake.internet().password();
	   String UserEmail=fake.internet().emailAddress();
	   String BusName=fake.name().name();
	   String UserName=fake.name().firstName();//No space in user name condition is given
	   
		
		fp.homebtn();
		
	    hp.registerbtn();
	    rp.selectedGroup();
	    rp.BloodBank();
	    rp.BName(BusName);
	    rp.setUserName(UserName);
	    rp.setEmail(UserEmail);
	    rp.setPassword(password);
	    rp.setConPas(password);
	    rp.setTerms();
	    
	    rp.regButton();
	    
	    System.out.println(BusName+" "+UserName+" "+UserEmail+" "+password);
	    
	    System.out.println(ap.AccHeading());
	    System.out.println(ap.NameText());
	    Assert.assertTrue(ap.AccHeading().contains(BusName));
	    Assert.assertEquals(ap.NameText(),BusName);
	    
	
	
	}
}
