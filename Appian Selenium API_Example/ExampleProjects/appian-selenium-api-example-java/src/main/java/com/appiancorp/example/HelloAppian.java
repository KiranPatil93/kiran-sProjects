package com.appiancorp.example;

import CustomeClasses.CustomClass;
import com.intuit.karate.junit5.Karate;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.appiancorp.ps.automatedtest.fixture.SitesFixture;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloAppian {
  public static WebDriver driver= null;
  protected static String TEST_BROWSER = "CHROME";
  protected static String TEST_SITE_VERSION = "23.2.1";
  protected static String TEST_SITE_URL = "https://yexledemo.appiancloud.com/suite/sites/automation-cases";
  protected static String TEST_SITE_LOCALE = "en_US";
  protected static String TEST_USERNAME = "kiran123"; //Make sure this username has an entry in users.properties
  protected static Integer TEST_TIMEOUT = 60;

  private static final Logger LOG = LogManager.getLogger(HelloAppian.class);
  public static SitesFixture fixture;
  public static CustomClass custome;
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
    custome = new CustomClass();
  }
  @Test(priority = 1, enabled =false,description = "Click on case button")
  public void clickOnCaseButton(){
    fixture.clickOnButton("New Case");
  }

  @Test(priority = 2,description = "Enter Text")
  public void enterText(){
    fixture.clickOnButton("New Case");
    fixture.populateFieldWith("Text",new String[]{"Kiran"});
  }
  @Test(priority = 3,description = "Enter Date")
  public void enterDate(){
    fixture.clickOnButton("New Case");
    fixture.populateFieldWith("Text",new String[]{"Kiran"});
    fixture. populateFieldWithPartiallyMatchingPickerFieldSuggestion("Date", new String[]{"2/07/2023"});
    custome.fileUpload();
      }
      @Test
  public void enterParagraph(){
    fixture.clickOnButton("New Case");
fixture.populateFieldWith("Paragraph",new String[]{"testing for Selenium Api"});

  }
  @Test
  public void clickOnCheckbox(){
    fixture.clickOnButton("New Case");
    fixture.populateFieldWith("Text",new String[]{"Kiran"});
    fixture.clickOnCheckboxOption("Option 1");
    custome.fileUpload();
  }
  @Test
public void clickOnRadioInCard(){
    fixture.clickOnButton("New Case");
    fixture.populateFieldWith("Text",new String[]{"Kiran"});
  fixture.populateFieldWith("Radio Buttons Card", new String[]{"Option 1"});

}
@Test
public void SelectDropdownValue(){
  fixture.clickOnButton("New Case");
  fixture.populateFieldWith("Text",new String[]{"Kiran"});
    fixture.populateDropdownSearchBoxWith("Dropdown","Option 1");

}




public void mySeleniumSript(){

}



  @AfterMethod
  public void tearDown(){
    fixture.tearDown();
  }

}
