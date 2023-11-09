package com.orangehrm.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcMultipleWindowHandle {

	public static void main(String[] args)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.navigate().to("http://irctc.co.in");
		 
		 driver.findElement(By.id("disha-banner-close")).click();
		 driver.findElement(By.xpath("//*[@id=\"nlpCubeBox200X200\"]/div/div[1]/span[1]/img")).click();
		 driver.findElement(By.xpath("//*[@id=\"askDishaLuncher\"]/img[2]")).click();
		 driver.findElement(By.className("footer_headings")).click();
		 driver.findElement(By.linkText("Ticket Cancellation Rules")).click();
		 Set<String> windowIDs=driver.getWindowHandles();
		 List<String> windowIDsList=new ArrayList(windowIDs);
		 String parentWindowID=windowIDsList.get(0);
		 String childWindowID=windowIDsList.get(1);
		 System.out.println("Parent Window ID:"+parentWindowID);
		 System.out.println("Child Window ID:"+childWindowID);
		 driver.switchTo().window(parentWindowID);
		 System.out.println("Parent Windown Title:"+driver.getTitle());

	}

}
