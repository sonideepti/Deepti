package com.orangehrm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("remember")).getAttribute("checked");
		 if(driver.findElement(By.id("remember")).isSelected())
		 {
			 driver.findElement(By.id("remember")).click();
			 System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		 }
		 
	}

}
