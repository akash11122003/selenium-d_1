package com.example.excel;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
public static Object[][] readExcel() throws IOException
{
	String location="F:\\Sem 4\\SELENIUM\\Day 10\\Book1.xlsx";
	FileInputStream fis=new FileInputStream(location);
	//creating a workbook object
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	//locating the sheets
	XSSFSheet sheet=workbook.getSheetAt(0);
	//getting the total rows
	int total=sheet.getPhysicalNumberOfRows();
	System.out.println("Total number of rows: "+total);
	int column=sheet.getRow(0).getLastCellNum();
	System.out.println("Total columns: "+column);
	//creating the object 2d array
	Object[][]data=new Object[total-1][column];
	//getting rows using xssf11
	for(int i=1;i<total;i++)
	{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<2;j++) {
			
			XSSFCell cell=row.getCell(j);
			//Storing the value  in object array
			data[i-1][j]=cell.getNumericCellValue();
			cell=row.getCell(j);
			System.out.println(cell.getNumericCellValue());
		}
	}
	fis.close();
	workbook.close();
	return data;
	
//	XSSFRow row=sheet.getRow(1);
}
}
