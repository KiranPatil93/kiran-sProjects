package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myfile2.xlsx");
        XSSFWorkbook book = new XSSFWorkbook();
         XSSFSheet sheet =book.createSheet("Data");
         XSSFRow row1   =   sheet.createRow(0);
         row1.createCell(0).setCellValue("Welcome");
         row1.createCell(1).setCellValue(1234);
         row1.createCell(2).setCellValue("Selenium");

         XSSFRow row2 = sheet.createRow(1);
         row2.createCell(0).setCellValue("Java");
         row2.createCell(1).setCellValue(567);
         row2.createCell(2).setCellValue("Automation");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("test");
        row3.createCell(1).setCellValue(5648);
        row3.createCell(2).setCellValue("test1");

        book.write(file);
        book.close();


















    }
}
