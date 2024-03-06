package com.appiancorp.example;

import CustomeClasses.ProjectCreation;
import com.aventstack.extentreports.ExtentReports;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.appiancorp.ps.automatedtest.fixture.SitesFixture;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HelloAppian {
  public static WebDriver driver= null;
  protected static String TEST_BROWSER = "CHROME";
  protected static String TEST_SITE_VERSION = "23.2.1";
  protected static String TEST_SITE_URL = "https://yexledev.appiancloud.com/suite/sites/project-management-portal";
  protected static String TEST_SITE_LOCALE = "en_US";
  protected static String TEST_USERNAME = "kiran.patil@yexle.com"; //Make sure this username has an entry in users.properties
  protected static Integer TEST_TIMEOUT = 60;

  private static final Logger LOG = LogManager.getLogger(HelloAppian.class);
  public static SitesFixture fixture;
  public static ProjectCreation custome;
  private static ExtentReports extentReports;
  @BeforeSuite
  public void extentReport(){
    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
    extentReports = new ExtentReports();
    extentReports.attachReporter(htmlReporter);
  }
@BeforeMethod
  public void Login() {
    LOG.debug("Setting up Tempo Fixture");

    fixture = new SitesFixture();

    fixture.setTakeErrorScreenshotsTo(true);
    fixture.setupWithBrowser(TEST_BROWSER);
    fixture.setAppianUrlTo(TEST_SITE_URL);
    fixture.setTimeoutSecondsTo(TEST_TIMEOUT);
    fixture.setAppianVersionTo(TEST_SITE_VERSION);
    fixture.setAppianLocaleTo(TEST_SITE_LOCALE);
    fixture.loginWithUsername(TEST_USERNAME);
    driver = fixture.getSettings().getDriver();
    custome = new ProjectCreation();
  }





  @AfterMethod
  public void tearDown(){
    fixture.tearDown();
  }

}
