package com.datadriven_july;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	public static void main(String[] args) throws IOException {
		
		
		//File --> FIS --> Workbook --> Sheet --> Row --> Cell --> CellType
		
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\OneDrive\\Desktop\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(0);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println("String: " +stringCellValue);
			
		}
		
		else if(cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println("Number: " +numericCellValue);
					
		}		
		int row_size = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Row Size: " +row_size);
				
		for (int i = 0; i < row_size; i++) {
			
			Row row2 = sheetAt.getRow(i);
			
			int cell_cnt = row2.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cell_cnt; j++) {
				
				Cell cell2 = row2.getCell(j);
				String stringCellValue = cell2.getStringCellValue();
				
				System.out.println(stringCellValue);
				
				
			}
			System.out.println();
		}
		
		
		
		System.out.println("SuccessFul");
		
		
		
		
		
		
		
	}
	
	

}
