package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Https://jqueryui.com/resizable");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 driver.switchTo().frame(0);
		 
		 WebElement rs=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 
		 Actions resize=new Actions(driver);
		 resize.clickAndHold(rs).moveByOffset(10, 30).release(rs).build().perform();

	}

}
