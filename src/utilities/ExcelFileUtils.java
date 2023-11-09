package utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtils
{
   //instead of using XSSFWorkbook & XSSFSheet, directly we can use Interface "Workbook"
	
	Workbook wb;
	
	//load all the excel files 
	//use constructor
	
	public ExcelFileUtils () throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\Test Input\\Input Sheet.xlsx");
		wb=WorkbookFactory.create(fis);
	}
	
	//rowCount
	
	public int rowCount(String sheetname)
	{
		return wb.getSheet(sheetname).getLastRowNum();
	}
	
	//colCount
	
	public void colCount(String sheetname,int row)
	{
		wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	
	//reading data from excel file
	
	public String getData(String sheetname,int row,int column)
	{
		String data="";
		//validate the data available on file
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			int celldata=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			 data = String.valueOf(celldata);
		}
		else
		{
			 data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
	
		return data;
	}
	
	//Writing the data into excel file
	
	public void setData(String sheetname,int row,int column,String status) throws Throwable
	{
		Sheet sh=wb.getSheet(sheetname);
		
		Row rownum=sh.getRow(row);
		
		Cell cell=rownum.createCell(column);
		
		//enter the data in cell-use method :SetCellValue
		cell.setCellValue(status);
		
		//for color the font
		if(status.equalsIgnoreCase("PASS"))
		{
			CellStyle style=wb.createCellStyle();
			Font font= wb.createFont();
		   font.setColor(IndexedColors.GREEN.getIndex());
		   style.setFont(font);
		   rownum.getCell(column).setCellStyle(style);
		}
		else if(status.equalsIgnoreCase("FAIL"))
		{
			CellStyle style=wb.createCellStyle();
			Font font= wb.createFont();
		   font.setColor(IndexedColors.RED.getIndex());
		   style.setFont(font);
		   rownum.getCell(column).setCellStyle(style);
		}
		else if(status.equalsIgnoreCase("NOT EXECUTED"))
		{
			CellStyle style=wb.createCellStyle();
			Font font= wb.createFont();
		   font.setColor(IndexedColors.BLUE.getIndex());
		   style.setFont(font);
		   rownum.getCell(column).setCellStyle(style);
		}
		
		
		//in order to write the data we use--FileOutputStream
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\Test Out\\OutputSheet.xlsx");
		wb.write(fos);
		fos.close();
	}
	//for writing the data
	public static void main(String[]args) throws Throwable
	{
		//call method
		ExcelFileUtils excel=new ExcelFileUtils();
		excel.setData("Test Data", 0, 2, "Result");
		excel.setData("Test Data", 1, 2, "PASS");
	}
}
