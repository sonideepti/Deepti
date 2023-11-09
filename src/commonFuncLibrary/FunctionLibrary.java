package commonFuncLibrary;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.PropertyFileUtil;

public class FunctionLibrary
{
   public static WebDriver startBrowser(WebDriver driver) throws Throwable  
   {
	   if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\chromedriver.exe");
		   driver=new ChromeDriver();
	   }else
		   if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("firefox"))
		   {
			   System.setProperty("webdriver.gecko.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\geckodriver.exe");	
			   driver=new FirefoxDriver();
		   }else
			   if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("ie")) 
			   {
				   System.setProperty("webdriver.ie.driver", "C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ExecutableFiles\\IEDriverServer.exe");
				   driver=new InternetExplorerDriver();
			   }
	   return driver;
   }
   
   //open Application method
   public static void openAplication(WebDriver driver) throws Throwable
   {
	   driver.manage().window().maximize();
	   driver.get(PropertyFileUtil.getValueForKey("URL"));
   }
   
   //click operation method
   public static void clickAction(WebDriver driver,String locatortype, String locatorvalue)
   {
	   if(locatortype.equalsIgnoreCase("id"))
	   {
		   driver.findElement(By.id(locatorvalue)).click();
	   }else
		   if(locatortype.equalsIgnoreCase("name"))
		   {
			   driver.findElement(By.name(locatorvalue)).click();
		   }else
			   if(locatortype.equalsIgnoreCase("xpath")) 
			   {
				   driver.findElement(By.xpath(locatorvalue)).click();  
			   }
	   
   }
   
   //typeAction For Sending data
   public static void typeAction(WebDriver driver,String locatortype, String locatorvalue,String data)
   {
	   if(locatortype.equalsIgnoreCase("id"))
	   {
		   driver.findElement(By.id(locatorvalue)).clear();
		   driver.findElement(By.id(locatorvalue)).sendKeys(data);
	   }else
		   if(locatortype.equalsIgnoreCase("name"))
		   {
			   driver.findElement(By.name(locatorvalue)).clear();
			   driver.findElement(By.name(locatorvalue)).sendKeys(data);
		   }else
			   if(locatortype.equalsIgnoreCase("xpath")) 
			   {
				   driver.findElement(By.xpath(locatorvalue)).clear(); 
				   driver.findElement(By.xpath(locatorvalue)).sendKeys(data);
			   }
	   
   }
   
   //close method
   public static void closeBrowser(WebDriver driver)
   {
	   driver.close();
   }
   
   //wait element
   public static void waitForElement(WebDriver driver,String locatortype, String locatorvalue,String waittime)
   {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(waittime)));
	   if(locatortype.equalsIgnoreCase("id"))
	   {
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
	   }else
		   if(locatortype.equalsIgnoreCase("name"))
		   {
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
		   }else
			   if(locatortype.equalsIgnoreCase("name"))
			   {
				   wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
			   }
   }
   
   //to generate Date
   public static String generateDate()
   {
	   Date date=new Date();
	   SimpleDateFormat sdf=new SimpleDateFormat("YYYY_MM_dd_SS");
	   return sdf.format(date);
   }
}
