package com.orangehrm.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmLoginTest
{

	public static void main(String[] args)
	{
		//Launch
		String expTitle="OrangeHRM";
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Validation
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
			System.out.println("AppLaunch successfully");
		}else
		{
			System.out.println("AppLaunch Failed");
		}
		
		//Login
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    //Login Validation
	    String expValue="Admin";
	    String actValue=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).getText();
	    if(expValue.equals(actValue))
	    {
	    	System.out.println("AppLogin Successful");
	    }else
	    {
	    	System.out.println("AppLogin Failed");
	    }
	    
	    //LogOut
	    
	    //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
	    
	    //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();  
	    
	    driver.findElement(By.className("oxd-main-menu-item")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
        driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[text()='ESS']")).click();
	   
       //total links
	  		List<WebElement> links=driver.findElements(By.tagName("a"));
	  		System.out.println(links.size());
	  		
	  		System.out.println("----------");
	  		
	  		//links Name
	  		/*for(int i=0;i<links.size();i++)
	  		{
	  			System.out.println(links.get(i).getText());
	  		}*/
	  		
	  		//for each loop
	  		for(WebElement elements:links)
	  		{
	  			System.out.println(elements.getText());
	  		}
	    
			/*
			 * ]driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			 * driver.findElement(By.linkText("Add Employee")).click();
			 * driver.findElement(By.name("firstName")).sendKeys("Radhe");
			 * driver.findElement(By.name("lastName")).sendKeys("Krishna");
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"
			 * )).sendKeys("3241"); driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2/div/div/form/div[2]/button[2]")).click
			 * (); driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"
			 * )).sendKeys("pri"); driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"
			 * )).sendKeys("98567"); driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"
			 * )).sendKeys("2025-12-20"); driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"
			 * )).sendKeys("9856455"); driver.findElement(By.xpath(
			 * "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input"
			 * )).sendKeys("321565"); driver.findElement(By.
			 * className("oxd-icon bi-caret-up-fill oxd-select-text--arrow")).sendKeys(
			 * "Afghan");
			 */
					  }
					 
	}

	
	


