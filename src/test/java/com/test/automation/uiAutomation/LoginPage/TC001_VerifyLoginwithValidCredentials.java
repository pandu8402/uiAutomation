package com.test.automation.uiAutomation.LoginPage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.Config;
import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.BasePage;
import com.test.automation.uiAutomation.uiActions.LoginPage;


public class TC001_VerifyLoginwithValidCredentials extends TestBase{
	
	LoginPage loginpage;
	BasePage basepage;
	
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginwithValidCredentials.class.getName());
		
	@Test (priority = 1)
	public void verifyLoginwithInvalidCredentials() {
		try {
			log.info("================Starting verifyLoginwithValidCredentials test=============== ");
			try {
				loadPropertiesFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Config config = new Config(OR);
			loginpage = new LoginPage(driver);
			loginpage.loginToApplication(config.getUserName(), config.getPassword());		
			log.info("================Ending verifyLoginwithValidCredentials test=============== ");
			basepage = new BasePage(driver);
			Assert.assertTrue(basepage.veriyLoginFunctionality());
			log.info("login is successfull");
		}catch(Exception e)
		{
			log.info("Login is not successfull");
		}	
	}
	
	@Test (priority = 2)
	public void verifyFinancialsMenu() {
		String pageURL = null;
		try {
			log.info("================Starting verifyFinancialsMenu test=============== ");
			basepage = new BasePage(driver);
			pageURL = basepage.clickOnMainMenuItem();
			log.info("Financials menu found");
			log.info("================Ending verifyFinancialsMenu test=============== ");
		}catch(Exception e)
		{
			log.info("Financials menu not found");
		}	
		Assert.assertTrue(pageURL.contains("Billing"));
	}
	
	/*@AfterClass
	public void endTest() 
	{
		
	}*/

}