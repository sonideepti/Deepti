package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDropdownTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
        WebElement drop=driver.findElement(By.id("day"));
        List<WebElement> dropList=drop.findElements(By.tagName("option"));
        System.out.println(dropList.size());
	}

}
