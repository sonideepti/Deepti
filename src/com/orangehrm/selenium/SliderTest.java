package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Https://jqueryui.com/slider");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		 
		 WebElement sl=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		 
		 Actions slider=new Actions(driver);
		 slider.clickAndHold(sl).moveByOffset(80, 0).release(sl).build().perform();
		 
		 //move back to original position
		 slider.clickAndHold(sl).moveByOffset(-80, 0).release(sl).build().perform();

	}

}
