package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DynamicDataExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myfile1.xlsx");
        XSSFWorkbook wrokbook = new XSSFWorkbook();
        XSSFSheet sheet =wrokbook.createSheet("data");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows?");
        int totalRows = sc.nextInt();
        System.out.println("Enter how many columns?");
        int totalCells = sc.nextInt();
for(int r=0;r<totalRows;r++){
    XSSFRow currentrow = sheet.createRow(r);
    for(int c=0;c<totalCells;c++){
    XSSFCell cell = currentrow.createCell(c);
        System.out.println("Enter cell data");
    cell.setCellValue(sc.next());
    }
}
        wrokbook.write(file);
        wrokbook.close();
    }
}
