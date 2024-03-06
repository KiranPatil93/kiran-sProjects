package Utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFile {
    public static void CreateFile(String projectId, String projectName){
        File file = new File("C:\\Users\\KiranPatil\\IdeaProjects\\PMS\\ProjectData\\ProjectNameAndID.xlsx");
    // Create a new Excel workbook and sheet
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Project Data");

    // Create the headers for your Excel sheet (assuming project name and project ID)
    Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Project ID");
        headerRow.createCell(1).setCellValue("Project Name");


    // Sample data (replace with your actual project name and project ID)
  //  String projectName = "Sample Project";
   // String projectId = "12345";

    // Create a new row and populate it with data
    Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue(projectId);
        dataRow.createCell(1).setCellValue(projectName);
    // Write the workbook content to an Excel file
        try{
    FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
    } catch (IOException e) {
        e.printStackTrace();
    }



    }

    public static void storeverificationDetails_SOW(String opportunity,String serviceType,String startDate,String endDate, String SOW,String demand){
        File file = new File("C:\\Users\\KiranPatil\\IdeaProjects\\PMS\\ProjectData\\SOWVerification.xlsx");
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("SFSVerification");
        Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue(opportunity);
        dataRow.createCell(1).setCellValue(serviceType);
        dataRow.createCell(2).setCellValue(startDate);
        dataRow.createCell(3).setCellValue(endDate);
        dataRow.createCell(4).setCellValue(SOW);
        dataRow.createCell(5).setCellValue(demand);
        // Write the workbook content to an Excel file
        try{
            FileOutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

