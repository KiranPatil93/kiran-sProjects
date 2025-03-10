package com.qa.test;

import com.qa.utility.ExcelUtil;

import java.io.IOException;

public class TestDataSetup_R1 extends BaseTest{
    static ExcelUtil O = new ExcelUtil(testDataFileLocation,"UC_07");
    public static void UC_07(String fileLocation,String sheetName) throws IOException, InterruptedException {
        testData = new ExcelUtil(fileLocation,sheetName);
        String option = testData.getExcelAsMap().get(0).get("course");
        String yearValue = testData.getExcelAsMap().get(0).get("year");
        String sessionValue = testData.getExcelAsMap().get(0).get("session");
        String creditPoints = testData.getExcelAsMap().get(0).get("creditPt");
        String subject = testData.getExcelAsMap().get(0).get("subjectName");
        String reasonvalue = testData.getExcelAsMap().get(0).get("reason");
        String furthDetails = testData.getExcelAsMap().get(0).get("furtherDetails");
        submission.selectCourse(option);
        submission.selectYear(yearValue);
        submission.selectSession(sessionValue);
        submission.enterCreditPoints(creditPoints);
        submission.selectSubject(subject);
        submission.selectReason(reasonvalue);
        submission.enterFurtherDetails(furthDetails);

    }
}
