package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathsTest {

	public static void main(String[] args) 
	{  
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("Http://quikr.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/button[1]")).click();
	}

}
