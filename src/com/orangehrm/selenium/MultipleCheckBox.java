package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://echoecho.com/htmlforms09.htm");
		 driver.manage().window().maximize();
		 WebElement table=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		 List<WebElement> tableList=table.findElements(By.tagName("input"));
		 System.out.println(tableList.size());
		 for (int i = 0; i < tableList.size(); i++) 
		 {
			//System.out.println(tableList.get(i).getAttribute("checked")+"----"+tableList.get(i).getAttribute("value"));
			// if(tableList.get(i).getAttribute("value").equals("Cheese"))
			// {
			//	 tableList.get(i).click();
			// }
			 tableList.get(i).click();
			 System.out.println("Click on : "+tableList.get(i).getAttribute("value"));
			 
			 for (int j = 0; j < tableList.size(); j++) 
			 {
				 System.out.println(tableList.get(j).getAttribute("checked")+"----"+tableList.get(j).getAttribute("value"));
			 }
			 System.out.println("##########");
		}
		 

	}

}
