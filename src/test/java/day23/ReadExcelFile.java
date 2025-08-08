package day23;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcelFile {

	public static void main(String[] args) {
		String filepath = "\\TestData\\ReadExcelData.xlsx";
		try {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("book");
		//total rows
		int totalrows = sheet.getLastRowNum();
		System.out.println("Total rows "+totalrows);
		//total cells
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total cells "+totalrows);
		//print the data
		for(int r=0;r<totalrows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<totalCells;c++) {
				XSSFCell cell = currentRow.getCell(c);
				System.out.println(cell.toString()+"\t");//return the cell data
			}
			System.out.println(" ");
		}
		
		workbook.close();
		file.close();
		
		}catch(Exception e) {
			
		}

	}

}
