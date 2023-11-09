package com.orangehrm.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest 

{
	
  @Test(dataProvider = "getData")
   public void parameters(String username,String password,String results)
   {
	  System.out.println("Username : "+username);
	  System.out.println("Password : "+password);
	  System.out.println("Results : "+results);
   }
  
  @DataProvider
  public Object[][] getData()
  {
	  Object[][] data=new Object[2][3];
	  data[0][0]="Selenium";
	  data[0][1]="Vasu";
	  data[0][2]="Pass";
	  data[1][0]="Selenium1";
	  data[1][1]="Vasu1";
	  data[1][2]="Fail";
	  return data;
  }
}
