package com.orangehrm.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {

	public static void main(String[] args) throws Throwable
	{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.navigate().to("http://google.co.in");
				driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		        
		        WebElement gmail=driver.findElement(By.linkText("Gmail"));
		        Actions right=new Actions(driver);
		        right.contextClick(gmail).build().perform();
		        
		        Robot rbt=new Robot();  //robot object
		        rbt.keyPress(KeyEvent.VK_DOWN);
		        rbt.keyRelease(KeyEvent.VK_DOWN);
		        rbt.keyPress(KeyEvent.VK_DOWN);
		        rbt.keyRelease(KeyEvent.VK_DOWN);
		        rbt.keyPress(KeyEvent.VK_DOWN);
		        rbt.keyRelease(KeyEvent.VK_DOWN);
		        rbt.keyPress(KeyEvent.VK_DOWN);
		        rbt.keyRelease(KeyEvent.VK_DOWN);
		        rbt.keyPress(KeyEvent.VK_DOWN);
		        rbt.keyRelease(KeyEvent.VK_DOWN);
		        rbt.keyPress(KeyEvent.VK_DOWN);
		        rbt.keyRelease(KeyEvent.VK_DOWN);
		        rbt.keyPress(KeyEvent.VK_ENTER)	;
		        rbt.keyRelease(KeyEvent.VK_ENTER);
		        
		        
	}

}
