package day23;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		String filepath ="\\TestData\\myFile.xlsx";
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+filepath);
		XSSFWorkbook workbook = new XSSFWorkbook();//create workbook
		XSSFSheet sheet = workbook.createSheet("data");//create sheet

		//create row
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue(1243546);
		row1.createCell(2).setCellValue("20/4/2025");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Automtion");
		row2.createCell(1).setCellValue(1243546);
		row2.createCell(2).setCellValue("20/4/2025");
		
		workbook.write(file);
		workbook.close();
		
	}

}
