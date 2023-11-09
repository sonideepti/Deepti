package com.orangehrm.testng;

import org.testng.annotations.Test;

public class MultipleTestNGTest
{
   @Test
   public void add()
   {
	   System.out.println("Add Test");
   }
   
   @Test(dependsOnMethods = "add")
   public void sub()
   {
	   System.out.println("Sub Test");
   }
   
   @Test(dependsOnMethods = "div")
   public void mul()
   {
	   System.out.println("Mul Test");
   }
   
   @Test
   public void div()
   {
	   System.out.println("Div Test");
   }
}
