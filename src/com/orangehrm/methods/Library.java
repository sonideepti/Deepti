package com.orangehrm.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.PropertyFileUtil;

public class Library{
	
	WebDriver driver;
	String res;
	public String appLaunch(String url)
	{
	// appLaunch
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
     driver=new ChromeDriver(); 
     driver.get(url);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 //validation
	 if(driver.findElement(By.name("username")).isDisplayed())
	 {
		 res="Pass";
	 }else
	 {
		 res="Fail";
	 }
	 return res;
	}
	
	//appLogin
	public String appLogin(String username,String password)
	{
        driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	    //validation
	    if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).isDisplayed())
	    {
	    	res="Pass";
	    }
	    else
	    {
	    	res="Fail";
	    }
	    return res;
	}
	
	//appLogout
	public String appLogout()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		driver.findElement(By.linkText("Logout")).click();
		//validation
		
		if(driver.findElement(By.name("username")).isDisplayed())
		{
			res="Pass";
		}
		else
		{
			res="Fail";
		}
		return res;
	}
	
	//appClose
	public void appClose()
	{
		driver.close();
	}
	
	//call method in main method
	public static void main(String[]args) throws Throwable {
		//create an object
		Library app=new Library();
		String result=app.appLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(result);
		
		String result1=app.appLogin("Admin", "admin123");
		System.out.println(result1);
		
		app.appLogout();
		
		app.appClose();
		//modularity framework
		//admin login
		app.appLaunch(PropertyFileUtil.getValueForKey("URL"));
		app.appLogin(PropertyFileUtil.getValueForKey("Username"), PropertyFileUtil.getValueForKey("Password"));
		app.appLogout();
		app.appClose();
		
		//employeecreation
		app.appLaunch(PropertyFileUtil.getValueForKey("URL"));
		app.appLogin(PropertyFileUtil.getValueForKey("Username"), PropertyFileUtil.getValueForKey("Password"));
		//employeedetails
		app.appLogout();
		app.appClose();
	}

}
