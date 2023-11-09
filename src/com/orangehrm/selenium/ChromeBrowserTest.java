package com.orangehrm.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.java.Sum;

public class ChromeBrowserTest 
{

	public static void main(String[] args)  
	{
		Sum v=new Sum();
        v.add();
		//System.out.println(v.i);
		//write a program to launch chrome browser and navigate flipkart
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		
		ChromeDriver  driver=new ChromeDriver();
		
		driver.get("Http://flipkart.com");
	}

}
