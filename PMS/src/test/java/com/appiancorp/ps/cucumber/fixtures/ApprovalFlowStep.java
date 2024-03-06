package com.appiancorp.ps.cucumber.fixtures;

import Utility.ExcelReader;
import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.appiancorp.ps.cucumber.fixtures.ApprovalflowLocators.*;

public class ApprovalFlowStep extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= null;


    @When("I custom click on menu Tasks")
    public void iCustomClickOnMenuTasks() {
        driver = ctf.getSettings().getDriver();
WebElement taskmenu = driver.findElement(By.cssSelector(menuTasks));

       // taskmenu.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click the element using JavaScript Executor
        js.executeScript("arguments[0].click();", taskmenu);

    }


    @And("I search for projectId using {string} and {int}")
    public void iSearchForProjectIdUsingAnd(String sheetName, Integer  rowNumber) throws IOException, InvalidFormatException, InterruptedException {
        ExcelReader reader = new ExcelReader();
        List<Map<String,String>> testData =
                reader.getData("C:\\Users\\KiranPatil\\IdeaProjects\\PMS\\ProjectData\\ProjectNameAndID.xlsx", sheetName);
        String projectID = testData.get(rowNumber).get("Project ID");
       // WebElement Search = driver.findElement(By.xpath(searchfield));
        if (projectID != null && !projectID.isEmpty()) {
            WebElement Search = driver.findElement(By.xpath(searchfield));
            Search.sendKeys(projectID);
            Thread.sleep(1000);
            Search.sendKeys(Keys.ENTER);
        } else {
            // Handle the case when projectID is null or empty
            // You can throw an exception or log an error message
        }
    }



    @When("I custom click on title link")
    public void i_custom_click_on_title_link() {
        driver = ctf.getSettings().getDriver();
        WebElement title = driver.findElement(By.xpath(titleLink));
        title.click();
    }


    @Then("I verify Project Status {string}")
    public void i_verify_project_status(String color) {
        driver = ctf.getSettings().getDriver();
        WebElement statusElement = driver.findElement(By.xpath("//tbody/tr[1]/td[13]/div[1]/p[1]"));
        String statusColor = statusElement.getCssValue("color");
        if (statusColor.contains(color)) {
            System.out.println("Status color is " + color);
        } else {
            System.out.println("Status is not approved.");
        }
    }

    @And("I custom click on projectId link")
    public void iCustomClickOnProjectIdLink() {
        driver = ctf.getSettings().getDriver();
        WebElement projectIDlink = driver.findElement(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped PagingGridLayout---distribute']/tbody/tr[1]/td[2]//a"));
        projectIDlink.click();
    }

    @And("I custom click on menu home")
    public void iCustomClickOnMenuHome() {
        driver = ctf.getSettings().getDriver();
        WebElement taskmenu = driver.findElement(By.cssSelector(homepage));

        // taskmenu.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click the element using JavaScript Executor
        js.executeScript("arguments[0].click();", taskmenu);
    }

    @And("And I custom verify stage of the project as {string} and approval status {string}")
    public void andICustomVerifyStageOfTheProjectAsAndApprovalStatus(String stage, String status) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement webStage = driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Pipeline'])[1]"));
        String txtStage = webStage.getAttribute("aria-label");
        System.out.println(txtStage);
        Thread.sleep(3000);
        if(txtStage.equals(stage)){
            System.out.println("project stage is : "+stage);

        }else{
            Assert.fail("Stage is not a   " + stage);
        }
        WebElement webStatus = driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Need More Info'])[1]"));
        String txtStatus = webStage.getAttribute("aria-label");
        System.out.println(txtStatus);
        Thread.sleep(3000);
        if(txtStatus.equals(status)){
            System.out.println("project status is : "+status);

        }else{
            Assert.fail("status is not a   " + status);
        }

    }

    @And("I custom verify stage {string} and status {string} of the project")
    public void iCustomVerifyStageAndStatusOfTheProject(String stage, String status) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement webStage = driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='"+stage+"'])[1]"));
        String txtStage = webStage.getAttribute("aria-label");
        System.out.println(txtStage);
        Thread.sleep(3000);
        if(txtStage.equals(stage)){
            System.out.println("project stage is : "+stage);

        }else{
            Assert.fail("Stage is not a   " + stage);
        }
        WebElement webStatus = driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='"+status+"'])[1]"));
        String txtStatus = webStage.getAttribute("aria-label");
        System.out.println(txtStatus);
        Thread.sleep(3000);
        if(txtStatus.equals(status)){
            System.out.println("project status is : "+status);

        }else{
            Assert.fail("status is not a   " + status);
        }


    }
}

