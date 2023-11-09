package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest
{

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("Http://amazon.in");
		
		driver.manage().window().maximize();
		//number of webElements
	      List<WebElement> links=driver.findElements(By.tagName("a"));
	      System.out.println(links.size());
	      System.out.println("------------");
	      
	      //name of all webElements
	      
	      for(int i=0;i<links.size();i++)
	      {
	    	  System.out.println(links.get(i).getText());
	      }
	      System.out.println("------------");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().back();
		//driver.navigate().forward();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Home Appliances");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	}

}
