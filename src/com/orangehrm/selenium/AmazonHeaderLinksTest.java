package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHeaderLinksTest {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
			
			WebDriver  driver=new ChromeDriver();
			
			driver.get("Http://amazon.in");
			
			driver.manage().window().maximize();
			 WebElement header= driver.findElement(By.id("nav-xshop"));
			 List<WebElement> headerLinks=header.findElements(By.tagName("a"));
			 System.out.println(headerLinks.size());
			 
			 for(WebElement element:headerLinks)
			 {
				 System.out.println(element.getText());
			 }

	}

}
