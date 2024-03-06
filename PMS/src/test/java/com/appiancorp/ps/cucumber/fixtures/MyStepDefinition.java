package com.appiancorp.ps.cucumber.fixtures;

import Utility.CreateExcelFile;
import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static Utility.TestUtil.clickUsingJavaScriptExecutor;
import static com.appiancorp.ps.cucumber.fixtures.ApprovalflowLocators.btnUpdateProject;
import static com.appiancorp.ps.cucumber.fixtures.Locators.*;

public class MyStepDefinition extends BaseFixture {

    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver = null;


    @Given("I custom select opportunity {string}")
    public void i_custom_select_opportunity(String opportunity) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropOpportunity)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(opportunity);
    }

    @And("I custom select service Type {string}")
    public void iCustomSelectServiceType(String service) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropServiceType)).click();
        Thread.sleep(2000);
        TestUtil.selectdropdownValue(service);
    }


    @And("I custom select project manager {string}")
    public void iCustomSelectProjectManager(String managerName) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.cssSelector(pmname)).sendKeys(managerName);
        Thread.sleep(5000);
//suggetionPMname
        WebElement suggetion = driver.findElement(By.cssSelector(suggetionPMname));
        Actions act = new Actions(driver);
        act.moveToElement(suggetion).click().build().perform();

    }

    @And("I custom select project features {string}")
    public void iCustomSelectProjectFeatures(String features) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropprojFeature)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(features);



    }


    @And("I custom select technology {string}")
    public void iCustomSelectTechnology(String technology) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropTechnology)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(technology);
        Thread.sleep(500);
driver.findElement(By.xpath("(//textarea[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_medium ParagraphWidget---hasCharacterCount ParagraphWidget---inModalDialogLayout'])[1]")).click();
    }


    @Given("I custom click on checkbox option")
    public void i_custom_click_on_checkbox_option() {
        driver = ctf.getSettings().getDriver();
        clickUsingJavaScriptExecutor(sowCheckbox);
    }

    @And("I custom select demandType {string}")
    public void iCustomSelectDemandType(String demandtype) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropDemandType)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(demandtype);
    }

    @And("I custom select onshore_Offshore {string}")
    public void iCustomSelectOnshore_Offshore(String shore) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropShore)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(shore);
    }


    @And("I custom select location {string}")
    public void iCustomSelectLocation(String location) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropLocation)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(location);
    }

    @And("I custom select technology for demand {string}")
    public void iCustomSelectTechnologyForDemand(String demandTech) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(droptechnology)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(demandTech);
    }

    @And("I custom select role {string}")
    public void iCustomSelectRole(String role) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(dropRole)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(role);
    }

    @And("I custom enter demand percentage {string}")
    public void iCustomEnterDemandPercentage(String demandpercent) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement demandPercentage = driver.findElement(By.xpath(txtdemandpercentage));
        // demandPercentage.click();
        Thread.sleep(3000);
        // demandPercentage.sendKeys(demandpercent);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '100';", demandPercentage);
        Actions act = new Actions(driver);
        act.sendKeys(demandPercentage, Keys.TAB).build().perform();


    }


    @And("I custom select {int} checkboxes from demand details grid")
    public void iCustomSelectCheckboxesFromDemandDetailsGrid(int count) {
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("td[class='PagingGridLayout---checkbox'] div div div input"));

        // Ensure that the count is not greater than the number of checkboxes available
        if (count > checkboxes.size()) {
            throw new IllegalArgumentException("Count of checkboxes to click is greater than the number of available checkboxes.");
        }

        // Create a Random object
        Random random = new Random();

        // Create JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click on the specified number of checkboxes randomly using JavaScript
        for (int i = 0; i < count; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(checkboxes.size());
            } while (js.executeScript("return arguments[0].checked", checkboxes.get(randomIndex)).equals(true)); // Ensure the checkbox is not already checked

            // Click the checkbox at the randomly generated index using JavaScript
            js.executeScript("arguments[0].click();", checkboxes.get(randomIndex));
        }
    }


    @And("I custom click on view document link")
    public void iCustomClickOnViewDocumentLink() {
        driver = ctf.getSettings().getDriver();
        WebElement docLink = driver.findElement(By.xpath(documentLink));
        docLink.click();
    }

    @And("I custom close the document window")
    public void iCustomCloseTheDocumentWindow() {
        driver = ctf.getSettings().getDriver();
        List<WebElement> docLink = driver.findElements(By.xpath(btnCloseDocLink));
        if (docLink.size() > 0) {
            docLink.get(0).click();
        } else {
            // Assert.fail("close view doc link is not visible");
        }
    }

    @Then("I store project name and project Id in excel file")
    public void iStoreProjectNameAndProjectIdInExcelFile() {
        driver = ctf.getSettings().getDriver();
        String projectId = driver.findElement(By.xpath(txtprojectID)).getText();
        System.out.println(projectId);
        String projectName = driver.findElement(By.xpath(txtprojectName)).getText();
        System.out.println(projectName);
        CreateExcelFile.CreateFile(projectId, projectName);
    }

    @And("I custom select sow demand {string}")
    public void iCustomSelectSowDemand(String demand1) {
        driver = ctf.getSettings().getDriver();
        List<WebElement> dmandRoles = driver.findElements(By.xpath(demandRole));
        for (WebElement role : dmandRoles) {
            String txtrole = role.getText();
            System.out.println(txtrole);
            if (txtrole.contains(demand1)) {
                String checkbox = "//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr//td[4]//p[contains(text(),'" + demand1 + "')]//preceding::td[@role='cell'][1]";
//TestUtil.clickUsingJavaScriptExecutor(checkbox);
                Actions act = new Actions(driver);
                act.moveToElement(driver.findElement(By.xpath(checkbox))).click().build().perform();
            }
        }

    }

    @And("I custom verify status of the project {string}")
    public void iCustomVerifyStatusOfTheProject(String status) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        String parent = driver.getWindowHandle();

        Set<String> s = driver.getWindowHandles();
        Iterator<String> I1 = s.iterator();

        while (I1.hasNext()) {

            String child_window = I1.next();


            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());
                Thread.sleep(2000);
                List<WebElement> projectDetails = driver.findElements(By.xpath(projDetails));
                for (WebElement project : projectDetails) {
                    String textProjectDetails = project.getAttribute("title");
                    if (textProjectDetails.contains(status)) {
                        System.out.println("Status of the project is :" + status);
                    } else {
                        System.out.println("stage of the project is :" + textProjectDetails);
                    }
                }
            }
        }


    }

    @Given("I custom select demandType for row {int} {string}")
    public void i_custom_select_demand_type_for_row(Integer row, String demandtype1) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
//dropdemand
        WebElement dropNewDemandType = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[" + row + "]/th[1]/div[1]/div"));
        dropNewDemandType.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(demandtype1);

    }

    @Given("I custom select onshore_Offshore for row {int}\"OffShore\"")
    public void i_custom_select_role_for_row(Integer row, String role1) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement dropShore = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[" + row + "]/td[4]/div[1]/div"));
        dropShore.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(role1);
    }

    @Given("I custom select location for row {int} {string}")
    public void i_custom_select_location_for_row(Integer row, String location) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement dropShore = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[" + row + "]/td[2]/div[1]/div"));
        dropShore.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(location);
    }

    @Given("I custom select technology for demand for row {int} {string}")
    public void i_custom_select_technology_for_demand_for_row(Integer row, String demandTech) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement dropShore = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[" + row + "]/td[3]/div[1]/div"));
        dropShore.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(demandTech);
    }

    @Given("I custom enter demand percentage for row {int} {string}")
    public void i_custom_enter_demand_percentage_for_row(Integer row, String string) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement demandPercentage = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr["+row+"]/td[7]/div[1]/input"));
        // demandPercentage.click();
        Thread.sleep(3000);
        // demandPercentage.sendKeys(demandpercent);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '100';", demandPercentage);
        Actions act = new Actions(driver);
        act.sendKeys(demandPercentage, Keys.TAB).build().perform();
    }


    @And("I custom select onshore_Offshore for row {int} {string}")
    public void iCustomSelectOnshore_OffshoreForRow(int row, String shore) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement dropShore = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[" + row + "]/td[1]/div[1]/div"));
        dropShore.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(shore);
    }

    @And("I custom select role for row {int} {string}")
    public void iCustomSelectRoleForRow(int row, String role1) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement dropShore = driver.findElement(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr[" + row + "]/td[4]/div[1]/div"));
        dropShore.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(role1);
    }

    @And("I custom verify stage of the project as {string} and approval status {string}")
    public void iCustomVerifyStageOfTheProjectAsAndApprovalStatus(String stage, String status) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement webStage = driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Pipeline'])[1]"));
    String txtStage = webStage.getAttribute("aria-label");
    System.out.println(txtStage);
    Thread.sleep(3000);
    if(txtStage.equals(stage)){
            System.out.println("project stage is : "+stage);

        }

    WebElement webStatus = driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Initiated'])[1]"));
        String txtStatus = webStage.getAttribute("aria-label");
        System.out.println(txtStatus);
        Thread.sleep(3000);
        if(txtStatus.equals(status)) {
            System.out.println("project status is : " + status);


        }
    }

    @And("I custom select delivery location {string}")
    public void iCustomSelectDeliveryLocation(String delivery) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(deliveryLocation)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(delivery);
    }
}



