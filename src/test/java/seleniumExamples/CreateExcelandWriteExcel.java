package seleniumExamples;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelandWriteExcel {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Names");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Ananad");
		sheet.getRow(0).createCell(1).setCellValue("Mahesh");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Suresh");
		sheet.getRow(1).createCell(1).setCellValue("Ramesh");
		
		File file=new File("C:\\Users\\Ap mahesh\\eclipse-workspace\\ExcelFiles\\Test.xlsx");
        FileOutputStream fos=new FileOutputStream(file);
        workbook.write(fos);
        workbook.close();
	}

}
