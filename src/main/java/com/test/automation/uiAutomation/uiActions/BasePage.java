package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.support.How;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.LoginPage.TC001_VerifyLoginwithValidCredentials;
import com.test.automation.uiAutomation.testBase.TestBase;

public class BasePage extends TestBase
{
	
  public static final Logger log = Logger.getLogger(BasePage.class.getName());
  
  
  @FindBy(how = How.ID, using = "leftBrand")
  public static WebElement leftbrand;
  
  @FindBy(how = How.XPATH, using = "//div[@id='TopLevelMenu']//a[contains(@href,'FinancialsMenu')]")
  public static WebElement financialMenu;
  
  
  @FindBy(how = How.XPATH, using = "//div[@id='FinancialsMenu']//a[contains(@href,'BillingMenu')]")
  public static WebElement billingMenu;
  
  
  public BasePage(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  public boolean veriyLoginFunctionality()
  {
	  try {
		  waitForElement(driver, 100, leftbrand);
		  leftbrand.isDisplayed();
		  log.info("User logged in succesfully and company barnd is displayed ");
		  return true;
	  }catch(Exception e)
	  {
		return false;  
	  }
  }
  
  
  public String clickOnMainMenuItem()
  {
	  String URL;
	  waitForElement(driver, 100, financialMenu);
	  financialMenu.click(); 
	  waitForElement(driver, 100, billingMenu);
	  URL = getURL();
	  log.info("URL = " + URL);
	  return URL;
  }
}