package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Https://ceotelangana.nic.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement ca=driver.findElement(By.xpath("//*[@id=\'menu-primary-menu\']/li[5]/a"));
		 WebElement la=driver.findElement(By.xpath("//*[@id=\'menu-primary-menu\']/li[5]/ul/li[2]/a"));
		 WebElement ge=driver.findElement(By.xpath("//*[@id=\'menu-primary-menu\']/li[5]/ul/li[2]/ul/li[1]/a"));
		 WebElement la04=driver.findElement(By.xpath("//*[@id=\'menu-primary-menu\']/li[5]/ul/li[2]/ul/li[1]/ul/li[3]/a"));
		 Actions chain=new Actions(driver);
		 
		 chain.moveToElement(ca).moveToElement(la).moveToElement(ge).pause(2000).moveToElement(la04).click().build().perform();
		 

	}

}
