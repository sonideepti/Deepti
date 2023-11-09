package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksTest {

	public static void main(String[] args)
	{
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate Google
		driver.navigate().to("http://google.co.in");
		driver.manage().window().maximize();
		
		//header link test
		WebElement header=driver.findElement(By.id("SIvCob"));
		List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		
		for(WebElement element:headerLinks)
		{
			System.out.println(element.getText());
		}
	}

}
