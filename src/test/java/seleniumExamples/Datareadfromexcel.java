package seleniumExamples;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Datareadfromexcel {
	public static void main(String[] args) throws Exception {
		
        File file=new File("C:\\Users\\Ap mahesh\\eclipse-workspace\\ExcelFiles\\Test.xlsx");
        System.out.println(file.exists());
        FileInputStream fis=new FileInputStream(file);
         XSSFWorkbook workbook=new XSSFWorkbook(fis);
         XSSFSheet sheet=workbook.getSheet("data");
         //String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
         //System.out.println(cellvalue);
         
         int rowcount = sheet.getPhysicalNumberOfRows();
         
         for(int i=0; i<rowcount; i++)
         {
        	 XSSFRow row = sheet.getRow(i);
        	 int cellcount = row.getPhysicalNumberOfCells();
        			 for(int j=0;j<cellcount;j++)
        			 {
        				 XSSFCell cell= row.getCell(j);
        				 String cellvalue = getcellvalue(cell);
        				 System.out.print("|| "+cellvalue);
        			 }
        			 System.out.println();
         }
       
	}
	
	public static String getcellvalue(XSSFCell cell) {
		switch (cell.getCellType())  {
		case NUMERIC:
		    return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
	        return String.valueOf(cell.getBooleanCellValue());
		case STRING:
	          return cell.getStringCellValue();
		default :
			 return cell.getStringCellValue();
		}
	}

}
