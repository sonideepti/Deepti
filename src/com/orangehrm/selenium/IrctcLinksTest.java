package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLinksTest {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
			
			WebDriver  driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("http://irctc.co.in");
			
			//total links
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			
			System.out.println("----------");
			
			//links Name
			/*for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
			}*/
			
			//for each loop
			for(WebElement elements:links)
			{
				System.out.println(elements.getText());
			}

	}

}
