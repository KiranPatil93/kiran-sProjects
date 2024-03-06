package com.appiancorp.ps.cucumber.fixtures;

import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.appiancorp.ps.cucumber.fixtures.Locators.*;

public class EmployeeAllocationStep extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= null;
    @And("I custom select project Name {string}")
    public void iCustomSelectProjectName(String projectName) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.cssSelector(dropSelectProject)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(projectName);
    }

    @And("I custom click on employee checkbox")
    public void iCustomClickOnEmployeeCheckbox() {
        driver = ctf.getSettings().getDriver();
        TestUtil.clickUsingJavaScriptExecutor(employeeCheckbox);
    }
}
