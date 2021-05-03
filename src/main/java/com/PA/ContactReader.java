package com.PA;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ContactReader {
	String excelFilePath = ".\\file\\Contacts List.xlsx";
    FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
     
    XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
	XSSFSheet sheet=workbook.getSheetAt(0);
     
    Iterator iterator=sheet.iterator();
	
	while(iterator.hasNext())
	{
		XSSFRow row=(XSSFRow) iterator.next();
		
		Iterator cellIterator=row.cellIterator();
		
		while(cellIterator.hasNext())
		{
			XSSFCell cell=(XSSFCell) cellIterator.next();
			
			switch(cell.getCellType())
			{
			case STRING: System.out.print(cell.getStringCellValue()); break;
			case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
			}
			System.out.print(" |  ");
		}
		System.out.println();
}
