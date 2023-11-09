package com.orangehrm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Http://flipkart.com");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("/html/body/div[3]/div/span")).click();

	}

}
