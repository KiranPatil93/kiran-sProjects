package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myfile.xlsx");
        XSSFWorkbook wrokbook = new XSSFWorkbook();
        XSSFSheet sheet =wrokbook.createSheet("data");
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("Welcome");
        row1.createCell(1).setCellValue(1234);
        row1.createCell(2).setCellValue("Automation");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Java");
        row2.createCell(1).setCellValue(3456);
        row2.createCell(2).setCellValue("Selenium");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("Test");
        row3.createCell(1).setCellValue(4567);
        row3.createCell(2).setCellValue("xps");
        wrokbook.write(file);
        wrokbook.close();
    }
}
