package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DynamicWrtingExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myfile3.xlsx");
        XSSFWorkbook wrokbook = new XSSFWorkbook();
        XSSFSheet sheet =wrokbook.createSheet("writeData");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows");
        int totalRows =sc.nextInt();
        System.out.println("Enter how many cells");
        int toatlCells = sc.nextInt();
        for(int r=0;r<=totalRows;r++){
            XSSFRow currentRow = sheet.createRow(r);
            for(int c=0;c<toatlCells;c++){
                XSSFCell cell = currentRow.createCell(c);
                System.out.println("Enter Data into cell");
                cell.setCellValue(sc.next());
            }
        }
        wrokbook.write(file);
        wrokbook.close();
    }
}
