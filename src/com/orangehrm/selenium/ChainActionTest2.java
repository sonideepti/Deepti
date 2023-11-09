package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionTest2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Https://ceotelangana.nic.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement pdf=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[2]/a"));

		 WebElement council=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[2]/ul/li[2]/a"));

		 WebElement teacher2023=driver.findElement(By.xpath("//*[@id=\"menu-primary-menu\"]/li[2]/ul/li[2]/ul/li[3]/a"));
		
		 Actions chain2=new Actions(driver);
		 
		 chain2.moveToElement(pdf).moveToElement(council).moveToElement(teacher2023).click().build().perform();
				 

	}

}
