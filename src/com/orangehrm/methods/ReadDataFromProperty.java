package com.orangehrm.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\Environment.properties");
		Properties config=new Properties();
		config.load(fis);
		System.out.println(config.getProperty("Browser"));

	}

}
