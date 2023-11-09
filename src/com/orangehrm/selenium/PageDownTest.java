package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://google.com/advanced_search");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.findElement(By.id("xX4UFf")).sendKeys("seven continent");
        //to print it
        System.out.println(driver.findElement(By.id("xX4UFf")).getAttribute("value"));
        
        //select the text
        driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
        
        //copy the text
        driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
        
        //paste the text
        driver.findElement(By.id("mSoczb")).sendKeys(Keys.CONTROL+"v");
        
        //action Class
        Actions page=new Actions(driver);
        
        //page down operation
        page.sendKeys(Keys.PAGE_DOWN).build().perform();
        
        //click operation
        driver.findElement(By.xpath("//*[@id=\"s1zaZb\"]/div[5]/div[8]/div[2]/input[2]")).click();

	}

}
