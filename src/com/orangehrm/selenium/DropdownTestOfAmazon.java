package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.config.ConcatenatingConfig;

public class DropdownTestOfAmazon {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
			
			WebDriver  driver=new ChromeDriver();
			
			driver.get("Http://amazon.in");
			
			driver.manage().window().maximize();
			WebElement drop=driver.findElement(By.id("searchDropdownBox"));
			List<WebElement> dropList=drop.findElements(By.tagName("option"));
			System.out.println(dropList.size());
			
			for(WebElement element:dropList)
			{
				//System.out.println(element.getText());
				/*element.click();
				//Validation
				if(element.isSelected())
				{
					System.out.println(element.getText().concat(" : is selected"));
				}
				else
				{
					System.out.println(element.getText().concat(" : is not selected"));
				}*/
				
				if(element.getText().equals("Furniture"))
				{
					element.click();
					break;
				}
			}
				//driver.findElement(By.id("searchDropdownBox")).sendKeys("Furniture");
				}

}
