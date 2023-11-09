package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox2 {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://echoecho.com/htmlforms10.htm");
		 driver.manage().window().maximize();
		 
		 WebElement table2=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		 List<WebElement> table2List=table2.findElements(By.tagName("input"));
		 System.out.println(table2List.size());
		 
		 for (int i = 0; i < table2List.size(); i++)
		 {
			//System.out.println(table2List.get(i).getAttribute("Checked")+"-------"+table2List.get(i).getAttribute("value"));
			//table2List.get(i).click();
			/*
			 * if(table2List.get(i).getAttribute("value").equals("Milk")) {
			 * table2List.get(i).click(); }
			 */
			 table2List.get(i).click();
			 System.out.println("Click on : "+table2List.get(i).getAttribute("value"));
			 
			 for (int j = 0; j < table2List.size(); j++) 
			 {
				 System.out.println(table2List.get(j).getAttribute("checked")+"----"+table2List.get(j).getAttribute("value"));
			 }
			 System.out.println("##########");
		}


	}

}
