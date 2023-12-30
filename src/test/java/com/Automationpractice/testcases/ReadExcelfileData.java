package com.Automationpractice.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelfileData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String excelfile = ".\\TestData\\ebaysignup.xlsx";
		FileInputStream inputstream = new FileInputStream(excelfile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(1).getLastCellNum();
			
			
		//	For loop 1st method
		/*	for(int r=0;r<=rows;r++)
			{
				
				XSSFRow row= sheet.getRow(r);
				
			 for(int c=0;c<cols;c++)
			 {
				 
				 XSSFCell cell = row.getCell(c);
				 
				 switch(cell.getCellType())
				 {
				 case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				 case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				 case STRING: System.out.println(cell.getStringCellValue());   break;
				 }
			
				 System.out.print("| ");
				 
			 }
			 System.out.println(" ");
			} */
			
		 java.util.Iterator<Row> iterator = sheet.iterator();
		 
		 while(iterator.hasNext())
		 {
			 XSSFRow row = (XSSFRow) iterator.next();
			   java.util.Iterator<Cell> cellIterator = row.cellIterator();
			 
			   while(cellIterator.hasNext())
			   {
				 XSSFCell cell = (XSSFCell) cellIterator.next();
				  
				 switch(cell.getCellType())
				 {
				 case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				 case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				 case STRING: System.out.println(cell.getStringCellValue());   break;
				 }
				 System.out.print( " | ");
			   }
			   System.out.println("");
		 }
		 
		 
		 
			
	}

}
