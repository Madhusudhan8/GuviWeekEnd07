package com.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException 
	{
		//Creating the excel Workbook
		HSSFWorkbook wb = new HSSFWorkbook();
		OutputStream out= new FileOutputStream("C:\\Users\\Madhusudhan.Venu\\eclipse-workspace\\newProject01\\TestProject02\\JavaCreatedSheet.xls");
		System.out.println("Excel file created successfully");
		//Creating the excel sheet
		HSSFSheet sheet=(HSSFSheet) wb.createSheet("Sheet1");
		//Setting the values to the sheet
		System.out.println("Setting values to cells");
		HSSFRow rowhead=sheet.createRow(0);
		rowhead.createCell(0).setCellValue("John Doe");
		rowhead.createCell(1).setCellValue(30);
		rowhead.createCell(2).setCellValue("john@test.com");
		
		HSSFRow rowheadOne=sheet.createRow(1);
		rowheadOne.createCell(0).setCellValue("Jane Doe");
		rowheadOne.createCell(1).setCellValue(28);
		rowheadOne.createCell(2).setCellValue("john@test.com");
		
		HSSFRow rowheadTwo=sheet.createRow(2);
		rowheadTwo.createCell(0).setCellValue("Bob Smith");
		rowheadTwo.createCell(1).setCellValue(35);
		rowheadTwo.createCell(2).setCellValue("jacky@example.com");
		
		HSSFRow rowheadThree=sheet.createRow(3);
		rowheadThree.createCell(0).setCellValue("John Doe");
		rowheadThree.createCell(1).setCellValue(30);
		rowheadThree.createCell(2).setCellValue("john@test.com");
		//Writing the values to the sheet
		
		HSSFRow rowheadFour=sheet.createRow(4);
		rowheadFour.createCell(0).setCellValue("Rama");
		rowheadFour.createCell(1).setCellValue(32);
		rowheadFour.createCell(2).setCellValue("rama@test.com");
		wb.write(out);
		//Reading the excel data
		System.out.println("Reading the values from cell");
		HSSFSheet sheetOne = wb.getSheetAt(0);
		HSSFRow rowRead01= sheetOne.getRow(0);
		System.out.println(rowRead01.getCell(0).getStringCellValue());
		System.out.println(rowRead01.getCell(1).getNumericCellValue());
		System.out.println(rowRead01.getCell(2).getStringCellValue());
		
		HSSFRow rowRead02= sheetOne.getRow(1);
		System.out.println(rowRead02.getCell(0).getStringCellValue());
		System.out.println(rowRead02.getCell(1).getNumericCellValue());
		System.out.println(rowRead02.getCell(2).getStringCellValue());
		
		HSSFRow rowRead03= sheetOne.getRow(2);
		System.out.println(rowRead03.getCell(0).getStringCellValue());
		System.out.println(rowRead03.getCell(1).getNumericCellValue());
		System.out.println(rowRead03.getCell(2).getStringCellValue());
		
		HSSFRow rowRead04= sheetOne.getRow(3);
		System.out.println(rowRead04.getCell(0).getStringCellValue());
		System.out.println(rowRead04.getCell(1).getNumericCellValue());
		System.out.println(rowRead04.getCell(2).getStringCellValue());
		
		HSSFRow rowRead05= sheetOne.getRow(4);
		System.out.println(rowRead05.getCell(0).getStringCellValue());
		System.out.println(rowRead05.getCell(1).getNumericCellValue());
		System.out.println(rowRead05.getCell(2).getStringCellValue());
		
		out.close();
		
		
		
		
	}
	

}
