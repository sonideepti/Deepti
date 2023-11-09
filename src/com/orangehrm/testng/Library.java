package com.orangehrm.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Library
{
   WebDriver driver;
   WebDriverWait wait;
   @BeforeSuite
   public void appLaunch()
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
   }
   
   @AfterSuite
   public void appClose()
   {
	   driver.close();
   }
   
   @BeforeTest
   public void appLogin()
   {
	   wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")));
	   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	   
   }
   
   @AfterTest
   public void appLogout()
   {
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Paul Collings']")));
	   driver.findElement(By.xpath("//p[text()='Paul Collings']")).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   
   }
   
   
}
