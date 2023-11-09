package com.orangehrm.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utilities.ExcelFileUtils;

public class ExcelReadDataTest {

	public static void main(String[] args) throws Throwable 
	{
		/*
		 * FileInputStream fis=new
		 * FileInputStream("C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\Test Input\\Input Sheet.xlsx"
		 * ); XSSFWorkbook wb=new XSSFWorkbook(fis); XSSFSheet
		 * ws=wb.getSheet("Test Data");
		 */
		//call a method
		ExcelFileUtils excel=new ExcelFileUtils();
		Library app=new Library();
		/*
		 * String data1=ws.getRow(0).getCell(0).getStringCellValue();
		 * //System.out.println(data1); String
		 * data2=ws.getRow(0).getCell(1).getStringCellValue();
		 * System.out.println(data1+"------"+data2);
		 */
		
		//to read data mutiple times
		//for row count
		//int rcnt=ws.getLastRowNum();
		for (int i = 0; i <=excel.rowCount("Test Data"); i++)
		{
			String data1=excel.getData("Test Data", i, 0);
			String data2=excel.getData("Test Data", i, 1);
			//System.out.println(data1+"-----"+data2);
			
			app.appLogin(data1,data2 );
			//String data1=ws.getRow(i).getCell(0).getStringCellValue();
			//String data2=ws.getRow(i).getCell(1).getStringCellValue();
			//System.out.println(data1+"------"+data2);
		}
	}

}
