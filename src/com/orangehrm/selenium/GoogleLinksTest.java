package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinksTest {

	public static void main(String[] args) 
	{
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate Google
		driver.navigate().to("http://google.co.in");
		driver.manage().window().maximize();
        //Validation of google
		String expvalue="Gmail";
		String actvalue=driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
		if(expvalue.equals(actvalue))
		{
			System.out.println("succesfull");
		}
		else
		{
			System.out.println("Failed");
		}
		
		//Capture multiple links(size) on webpage
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		//Capture all links by their Name
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		/*for(WebElement A:links)
		{
			System.out.println(A.getText());
		}*/
			
		
	}
}
