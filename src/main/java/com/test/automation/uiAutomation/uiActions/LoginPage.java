package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.testBase.TestBase;

public class LoginPage extends TestBase
{
	   @FindBy(how = How.ID, using = "userName")
	   public static WebElement txtUserName;
	   
	   @FindBy(how = How.ID, using = "password")
	   public static WebElement txtPassword;
	   
	   @FindBy(how = How.ID, using = "login")
	   public static WebElement btnLogin;
	   
	   
	   public LoginPage(WebDriver driver) 
	   {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	    }


	//Login action
	   public void loginToApplication(String sUserName, String sPassword)
	   {	   
		 waitForElement(driver, 60, txtUserName);
		 txtUserName.sendKeys(sUserName);
	     txtPassword.sendKeys(sPassword);
	     btnLogin.click();
	   }    
}
