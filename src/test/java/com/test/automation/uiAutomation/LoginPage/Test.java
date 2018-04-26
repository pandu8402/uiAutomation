package com.test.automation.uiAutomation.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test 
{
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver_v2-37.exe");
		driver = new ChromeDriver();
		driver.get("https://test.wshcloud.com");
		Thread.sleep(10000);
		//WebDriverWait wait = new WebDriverWait(driver, 100);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("wsc-loginForm"))));
		WebElement ele = driver.findElement(By.id("userName"));
		ele.sendKeys("abckd");
	}
	
}
