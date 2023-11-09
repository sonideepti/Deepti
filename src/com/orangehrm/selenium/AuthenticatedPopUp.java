package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 //foe authenticated popup: syntax:(http://username:password@Url)
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 driver.manage().window().maximize();

		 

	}

}
