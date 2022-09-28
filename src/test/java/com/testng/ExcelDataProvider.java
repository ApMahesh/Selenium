package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	
	//@DataProvider()
	public static void main(String[] args)throws Exception {
		File file=new File("./resources/Test.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook Workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=Workbook.getSheet("Sheet1");
        int noofrows = sheet.getPhysicalNumberOfRows();
        int noofcolums=sheet.getRow(0).getLastCellNum();
        
        
        String[][] data=new String[noofrows-1][noofcolums];
        for(int i=1;i<noofrows;i++) {
        	  for(int j=0;j <noofcolums;j++) {
        		  DataFormatter df=new DataFormatter();
        		  System.out.println(data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j)));
        	  }
        	  System.out.println();
        }
        
        
        
        Workbook.close();
        fis.close();
	}

}
