package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcelFile {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\ReadExcelData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("book");
        int toatlRows = sheet.getLastRowNum(); //return toatl rows
        int totalCells = sheet.getRow(1).getLastCellNum();// total cells

        System.out.println(toatlRows);
        System.out.println(totalCells);
        for (int r = 0; r <= toatlRows; r++) {
            XSSFRow currentrow = sheet.getRow(r);//capture row
            for(int c=0; c<totalCells;c++){
                XSSFCell cell = currentrow.getCell(c); //return
                System.out.println(cell.toString() + "\t");
            }
            System.out.println(" ");
        }
    }
}
