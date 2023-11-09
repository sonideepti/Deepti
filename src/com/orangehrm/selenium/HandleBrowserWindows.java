package com.orangehrm.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//single window id
			//String windowID=driver.getWindowHandle();
			//System.out.println(windowID);
			driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
			
			Set<String> windowIDs=driver.getWindowHandles();
			/*
			 * //first method-By using iterator Iterator<String> it=windowIDs.iterator();
			 * String parentWindowID=it.next(); String childWindowID=it.next();
			 * System.out.println("Parent Window ID:"+parentWindowID);
			 * System.out.println("Child Window ID:"+childWindowID);
			 */
			
			//Second Method--Using List/ArrayList
			
			List<String> windowIDsList=new ArrayList(windowIDs); //convert Set-----> List
			String parentWindowID=windowIDsList.get(0);
			String childWindowID=windowIDsList.get(1);
			System.out.println("Parent Window ID:"+parentWindowID);
			System.out.println("Child Window ID:"+childWindowID);
			
			//window Switching
			
			driver.switchTo().window(parentWindowID);
			System.out.println("Parent Window Title:"+driver.getTitle());
			
			driver.switchTo().window(childWindowID);
			System.out.println("Child Window Title:"+driver.getTitle());
			
			driver.switchTo().window(parentWindowID);
			System.out.println("Parent Window Title:"+driver.getTitle());
			
			//close window
			for(String winid: windowIDsList)
			{
				String title=driver.switchTo().window(winid).getTitle();
				if(title.equals("OrangeHRM HR Software | OrangeHRM"))
				{
					driver.close();
				}
			}
				
				
			
			

	}

}
