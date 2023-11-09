package DriverFactory;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import commonFuncLibrary.FunctionLibrary;
import utilities.ExcelFileUtils;

public class DriverScript
{
  WebDriver driver;
  public void startTest() throws Throwable
  {
	  //to read from excel file--import excelfileUtil
	  
	  ExcelFileUtils excel=new ExcelFileUtils();
	  //to read multiple row --use for loop
	  
	  for (int i = 1; i <=excel.rowCount("MasterTestCases"); i++) 
	  {
		  String ModuleStatus="";
		if(excel.getData("MasterTestCases", i, 2).equalsIgnoreCase("Y"))
		{
			//Define the Module Name
		String TCModule=excel.getData("MasterTestCases", i, 1);
		int rowcount=excel.rowCount(TCModule);
		for (int j = 1; j <=rowcount; j++) 
		{
			String Description=excel.getData(TCModule, j, 0);
			String Object_Type=excel.getData(TCModule, j, 1);
			String Locator_Type=excel.getData(TCModule, j, 2);
			String Locator_Value=excel.getData(TCModule, j, 3);
			String Test_Data=excel.getData(TCModule, j, 4);
			try
			{
			if(Object_Type.equalsIgnoreCase("startBrowser"))
			{
				driver=FunctionLibrary.startBrowser(driver);
			}
			if(Object_Type.equalsIgnoreCase("openApplication"))
			{
				FunctionLibrary.openAplication(driver);
			}
			if(Object_Type.equalsIgnoreCase("clickAction"))
			{
				FunctionLibrary.clickAction(driver,Locator_Type,Locator_Value);
			}
			if(Object_Type.equalsIgnoreCase("typeAction"))
			{
				FunctionLibrary.typeAction(driver,Locator_Type,Locator_Value,Test_Data);
			}
			if(Object_Type.equalsIgnoreCase("closeBrowser"))
			{
				FunctionLibrary.closeBrowser(driver);
			}
			if(Object_Type.equalsIgnoreCase("waitForElement"))
			{
				FunctionLibrary.waitForElement(driver,Locator_Type,Locator_Value,Test_Data);
			}
			excel.setData(TCModule, j, 5, "PASS");
			ModuleStatus="true";
			}
			catch (Exception e) 
			{
				excel.setData(TCModule, j, 5, "FAIL");
				ModuleStatus="false";
				
				//to take screenshot of failed code
				TakesScreenshot ts=(TakesScreenshot)driver;
				File srcfile=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcfile, new File("C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\ScreenShots\\"+Description+FunctionLibrary.generateDate()+".png"));
				break;
			}
			}
		if(ModuleStatus.equalsIgnoreCase("true")) 
		{
			excel.setData("MasterTestCases",i, 3,"PASS");
		}else
			if(ModuleStatus.equalsIgnoreCase("false")) 
			{
			excel.setData("MasterTestCases",i, 3,"FAIL");
			}
		}else
		{
			excel.setData("MasterTestCases",i, 3,"NOT EXECUTED");
		}
		
	  }
  }
  

public static void main(String[]args) throws Throwable
  {
	  DriverScript ds=new DriverScript();
	  ds.startTest();
  }
}
