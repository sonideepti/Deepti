package com.orangehrm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiDropdownTest {

	public static void main(String[] args)
	{
		//Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://shadi.com");
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//*[@id=\"contentWrapper\"]/div[2]/div/div/div/div[1]/a")).click();
                driver.findElement(By.id("first_name")).sendKeys("Prisha");
                driver.findElement(By.id("last_name")).sendKeys("Soni");
                driver.findElement(By.id("lbl_rblGender_0")).click();
                driver.findElement(By.id("lbl_rblGender_0_for")).click();
                //driver.findElement(By.id("dob_m")).sendKeys("Dec");
               // driver.findElement(By.id("dob_d")).sendKeys("20");
               // driver.findElement(By.id("dob_y")).sendKeys("1993");
                Select n=new Select(driver.findElement(By.id("dob_m")));
                n.selectByIndex(5);
                Select n1=new Select(driver.findElement(By.id("dob_d")));
                n1.selectByIndex(3);
                Select n2=new Select(driver.findElement(By.id("dob_y")));
                n.selectByIndex(5);
                driver.findElement(By.id("ddlReligion")).sendKeys("Hindu");
                driver.findElement(By.id("ddlEducation")).sendKeys("Bachelors");
                driver.findElement(By.id("ddlCountry")).sendKeys("India");
                
                
                
                
	}
}
