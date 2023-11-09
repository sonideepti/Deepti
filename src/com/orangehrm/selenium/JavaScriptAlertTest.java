package com.orangehrm.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://ksrtc.in/oprs-web");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //html popUp
        driver.findElement(By.xpath("//*[@id=\"corover-close-btn\"]")).click();
        
        //javaScript popUp
        driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
        driver.switchTo().alert().accept();
	}

}
