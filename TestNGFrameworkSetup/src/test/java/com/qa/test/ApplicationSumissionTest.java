package com.qa.test;

import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class ApplicationSumissionTest extends BaseTest{

@Test
    public void submitApplication() throws IOException, InterruptedException, AWTException {
    submission.switchToApplicationSubmissionWindow();
    TestDataSetup_R1.UC_07(testDataFileLocation,"UC_07");
    submission.uploadDocuments();
    submission.clickOnNextBtn();
    submission.clickOnAgree();
    submission.clickOnSubmit();
    }

}
