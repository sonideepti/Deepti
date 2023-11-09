package com.orangehrm.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest
{
  @Test
  public void validation()
  {
	 String s1="Vasu";
	 String s2="Vasu";
	 Assert.assertEquals(s1, s2);
  }
}
