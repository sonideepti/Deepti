package com.orangehrm.selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("Http://naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// String w1=driver.getWindowHandle();
		//System.out.println(w1);
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div[4]/div[2]/nav/ul/li[3]/a/div")).click();
		
		//String w2=driver.getWindowHandle();
		//System.out.println(w2);
		Set<String> windows=driver.getWindowHandles(); //for not allowing Duplicate Values
		/*
		 * for (String child : windows) { //System.out.println(child); //give control to
		 * each window one by one driver.switchTo().window(child);
		 * //System.out.println(driver.getTitle()); //driver.close();
		 * 
		 * //if we don't want to close particular window if(!driver.getTitle().
		 * equals("Resume Writing Services - CV - Bio data | Naukri Fastforward")) {
		 * driver.close(); } }
		 */
		
		// use of iterator
		ArrayList<String> tabs=new ArrayList(windows);
		//driver.switchTo().window(tabs.get(0));
		//driver.close();
		
		for (int i = 1; i < tabs.size(); i++)
		{
			String temp=driver.switchTo().window(tabs.get(i)).getTitle();
			if(temp.contains("Resume Writing Services"))
			{
				break;
			}
		}
		System.out.println(driver.findElement(By.xpath("//*[@id=\"rw\"]/span")).getText());
				
	}

}
