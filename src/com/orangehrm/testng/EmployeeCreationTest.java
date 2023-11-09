package com.orangehrm.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EmployeeCreationTest extends Library

{ WebDriver driver;
  WebDriverWait wait;
 @Test
 public void empCreation()
 {
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")));
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add Employee")));
	  driver.findElement(By.linkText("Add Employee")).click();
	  driver.findElement(By.name("firstName")).sendKeys("Radhe");
	  driver.findElement(By.name("lastName")).sendKeys("Krishna");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("3241");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2/div/div/form/div[2]/button[2]")).click();
 }
}
