package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinksTest {

	public static void main(String[] args)
	{
	  //Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Navigate to Amazon.com
		driver.navigate().to("Http://amazon.in");
		driver.manage().window().maximize();
		//Validation
		String expvalue="Amazon miniTV";
		String actvalue=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
		if(expvalue.equals(actvalue))
		{
			System.out.println("amazon open: successfull");
		}else
		{
			System.out.println("amazon open: Failed");
		}
		System.out.println("------------");
		
		
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
      
      
     
	}
}
