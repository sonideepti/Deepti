package com.orangehrm.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest
{

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\geckodriver.exe");	
     
	 FirefoxDriver driver=new FirefoxDriver();
     
	 driver.navigate().to("Http://facebook.com");
     
     }
}