package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //Alert window with OK button
        /* driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
         driver.switchTo().alert().accept(); */
		 
		 ///Alert window with OK & CANCEL button
		/* driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		 //driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();*/
		 
		 //Alert window with input box, capture text from the alert
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		 Thread.sleep(3000);
		 Alert alertwindow=driver.switchTo().alert();
		 System.out.println("the message displayed on alert:"+alertwindow.getText());
		 alertwindow.sendKeys("Welcome");
		 alertwindow.accept();
		 
	}

}
