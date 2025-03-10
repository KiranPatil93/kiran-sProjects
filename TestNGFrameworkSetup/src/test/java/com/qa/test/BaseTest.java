package com.qa.test;

import com.qa.page.ApplicationSubmissionPage;
import com.qa.page.HomePage;
import com.qa.page.LoginPage;
import com.qa.utility.ExcelUtil;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends LoginTest{
    public static String testDataFileLocation= System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
    public static HomePage homePage;
    public static ApplicationSubmissionPage submission;
    protected static ExcelUtil testData;
    @BeforeMethod
    public void init() throws InterruptedException {
        loginTest();
        homePage = new HomePage();
        homePage.OpenApplication();
        submission = new ApplicationSubmissionPage();
    }
}
