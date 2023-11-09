package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args)
	{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver  driver=new ChromeDriver();
		 driver.get("Http://amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement SignIn=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		 WebElement wishlist=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span"));
		 
		 Actions mouse=new Actions(driver);
		// mouse.moveToElement(SignIn).build().perform();
		 //mouse.moveToElement(wishlist).click().build().perform();
		 mouse.moveToElement(SignIn).moveToElement(wishlist).click().build().perform();
		 

	}

}
