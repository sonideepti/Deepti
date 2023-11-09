package com.orangehrm.selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerBrowserTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.navigate().to("http://amazon.in");

	}

}
