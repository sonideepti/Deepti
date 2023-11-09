package com.orangehrm.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest1
{
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod Executed");
  }
  @Test
  public void test1()
  {
	  System.out.println("test1 executed");
  }
  @Test
  public void test2()
  {
	  System.out.println("test2 executed");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod Executed");
  }
  
}
