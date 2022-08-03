package com.datadriven_july;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\OneDrive\\Desktop\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);

		Workbook wb=new XSSFWorkbook();
		
		Sheet createSheet = wb.createSheet("July_Student");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Project Batch");
		
		wb.getSheet("July_Student").createRow(1);
		wb.getSheet("July_Student").createRow(2);
		wb.getSheet("July_Student").createRow(3);
		
		wb.getSheet("July_Student").getRow(1).createCell(0).setCellValue("Siva");
		wb.getSheet("July_Student").getRow(2).createCell(1).setCellValue("Sanvika");
		wb.getSheet("July_Student").getRow(3).createCell(2).setCellValue("Anu");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("Inserted Succefully");
		
		
	}

}
