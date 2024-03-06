package com.appiancorp.ps.cucumber.fixtures;

import Utility.ExcelReader;
import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.appiancorp.ps.cucumber.fixtures.ApprovalflowLocators.*;
import static com.appiancorp.ps.cucumber.fixtures.Locators.agreeChbox;

public class CancelProjectStep extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver = null;

    @And("I search for projectName using {string} and {}")
    public void iSearchForProjectNameUsingAnd(String sheetName, int rowNumber) throws IOException, InterruptedException, InvalidFormatException {
        driver = ctf.getSettings().getDriver();
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData =
                reader.getData("C:\\Users\\KiranPatil\\IdeaProjects\\PMS\\ProjectData\\ProjectNameAndID.xlsx", sheetName);
        String projectName = testData.get(rowNumber).get("Project Name");
        // WebElement Search = driver.findElement(By.xpath(searchfield));
        if (projectName != null && !projectName.isEmpty()) {
            WebElement Search = driver.findElement(By.xpath(searchfield));
            Search.sendKeys(projectName);
            Thread.sleep(1000);
            Search.sendKeys(Keys.ENTER);
        } else {
            // Handle the case when projectID is null or empty
            // You can throw an exception or log an error message
        }

    }

    @And("I custom click on Action button")
    public void iCustomClickOnActionButton() {
        driver = ctf.getSettings().getDriver();
        WebElement action = driver.findElement(By.xpath(actionBtn));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Click the element using JavaScript Executor
        js.executeScript("arguments[0].click();", action);
    }

    @And("I custom click on cancel project button")
    public void iCustomClickOnCancelProjectButton() {
        driver = ctf.getSettings().getDriver();
        WebElement cancelProject = driver.findElement(By.xpath(cancelprojectBtn));
        Actions act = new Actions(driver);
        act.moveToElement(cancelProject).click().build().perform();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        // Click the element using JavaScript Executor
        // js.executeScript("arguments[0].click();", cancelprojectBtn);
    }


    @And("I custom verify project status {string}")
    public void iCustomVerifyProjectStatus(String status) {
        driver = ctf.getSettings().getDriver();
        WebElement statusElement = driver.findElement(By.xpath(statusOfProject));
        String statusColor = statusElement.getCssValue("color");
        if (statusColor.contains("red")) {
            System.out.println("Status box color is red.");
        } else {
            System.out.println("Status box color is not red.");
        }
    }

    @And("I custom click on agree checkbox")
    public void iCustomClickOnAgreeCheckbox() throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement element = driver.findElement(By.xpath(agreeChbox));
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
        TestUtil.clickUsingJavaScriptExecutor(agreeChbox);
    }

    @And("I custom scroll down")
    public void iCustomScrollDown() {
        driver = ctf.getSettings().getDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
