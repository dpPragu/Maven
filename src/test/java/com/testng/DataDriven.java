package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {
     public static void write_data() throws IOException {
    	 File f = new File ("C:\\Users\\praga\\eclipse-workspace\\Maven\\Excel\\DataDriven.xlsx");
    	 FileInputStream fis = new FileInputStream(f);
    	 Workbook w = new XSSFWorkbook(fis);
    	 Sheet createSheet =w.createSheet("DailReport");
    	 Row createRow = createSheet.createRow(0);
    	 Cell createCell = createRow.createCell(0);
    	 createCell.setCellValue("Morning");
    	 w.getSheet("DailReport").getRow(0).createCell(1).setCellValue("Wakeup");
    	 w.getSheet("DailReport").getRow(0).createCell(2).setCellValue("Take Breakfast");
    	 w.getSheet("DailReport").createRow(1).createCell(0).setCellValue("Afternoon");
    	 w.getSheet("DailReport").getRow(1).createCell(1).setCellValue("Attend the Class");
    	 w.getSheet("DailReport").getRow(1).createCell(2).setCellValue("Launch");
    	 w.getSheet("DailReport").createRow(2).createCell(0).setCellValue("Night");
    	 w.getSheet("DailReport").getRow(2).createCell(1).setCellValue("Upload Video");
    	 w.getSheet("DailReport").getRow(2).createCell(2).setCellValue("Eat & Sleep");
    	 FileOutputStream fos = new FileOutputStream(f);
    	 w.write(fos);
    	 w.close();
    	 
    	 
    	 
    	 
     }
	
	
	public static void main(String[] args) throws IOException {
		write_data();
	}

}
