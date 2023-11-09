package com.orangehrm.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookMultipleRadioButtons {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).sendKeys("xyz");
        driver.findElement(By.name("lastname")).sendKeys("new");
        driver.findElement(By.name("reg_email__")).sendKeys("7896451232");
        driver.findElement(By.name("reg_passwd__")).sendKeys("newwpaswd");
        //dropdown by Select method
        Select day=new Select(driver.findElement(By.name("birthday_day")));
        day.selectByValue("20");
        Select month=new Select(driver.findElement(By.name("birthday_month")));
        month.selectByValue("12");
        Select year=new Select(driver.findElement(By.name("birthday_year")));
        year.selectByValue("1993");
        //RadioButtons
        WebElement gender=driver.findElement(By.className("_5k_3"));
        List<WebElement> genderList=gender.findElements(By.tagName("input"));
        System.out.println(genderList.size());
        List<WebElement> r=driver.findElements(By.name("sex"));
        for(WebElement e:r)
        {
        	if (e.getAttribute("value").equals("1")) 
        	{
				e.click();
			}
        }
        
        
        
		
        
        
        
        
	}

}
