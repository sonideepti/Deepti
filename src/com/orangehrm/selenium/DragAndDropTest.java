package com.orangehrm.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Https://jqueryui.com/droppable");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		 //count total frames
		 System.out.println(frames.size());
		 
		 //3 ways to give control to frame 1).index
		 //driver.switchTo().frame(0);
		 
		 //2).string
		 //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		 
		 //3).WebElement
		 WebElement frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 driver.switchTo().frame(frame1);
	     
		 WebElement drag=driver.findElement(By.id("draggable")); 
		 WebElement drop=driver.findElement(By.id("droppable"));
		 Actions dAd=new Actions(driver); dAd.dragAndDrop(drag, drop).build().perform();
		 
		//Given back the control
		 driver.switchTo().defaultContent();
		 System.out.println(driver.findElement(By.linkText("jQuery UI")).getText());
			 

	}

}
