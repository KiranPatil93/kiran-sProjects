package DataDriven;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException {
        String filepath = "\\TestData\\ReadExcelData.xlsx";
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+filepath);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheet("book");
        int totalRows =  sheet.getLastRowNum();//total rows
        int totalCells =  sheet.getRow(1).getLastCellNum();
        System.out.println("Total rows "+totalRows);
        System.out.println("Total cells " +totalCells);
        for(int r=0;r<=totalRows;r++){
            XSSFRow currentRow = sheet.getRow(r);
            for(int c=0; c<totalCells; c++){
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString()+"\t"); //return data from the cell

            }
            System.out.println(" ");
        }
        workbook.close();
        file.close();
    }
}
