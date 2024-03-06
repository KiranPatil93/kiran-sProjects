package com.appiancorp.ps.cucumber.fixtures;

import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static Utility.TestUtil.clickUsingJavaScriptExecutor;
import static com.appiancorp.ps.cucumber.fixtures.ApprovalflowLocators.*;
import static com.appiancorp.ps.cucumber.fixtures.Locators.*;


public class UpdateProjectStep extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= null;

    @When("I custom click on update Project action")
    public void iCustomClickOnUpdateProjectAction() {
        driver = ctf.getSettings().getDriver();
        WebElement updateProjectBtn = driver.findElement(By.xpath(updateprojBtn));

        // taskmenu.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Click the element using JavaScript Executor
        js.executeScript("arguments[0].click();", updateProjectBtn);
    }


    @And("I custom change projectManager Name {string}")
    public void iCustomChangeProjectManagerName(String managerName) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement removePMLink = driver.findElement(By.xpath(removePM));
        removePMLink.click();
        Thread.sleep(2000);
        //txtPM
        WebElement enterPMName = driver.findElement(By.xpath(txtPM));
        enterPMName.sendKeys(managerName);
        Thread.sleep(5000);
        WebElement suggetion = driver.findElement(By.cssSelector(suggetionPMname));
        Actions act = new Actions(driver);
        act.moveToElement(suggetion).click().build().perform();
    }



    @When("I custom click on projectID link")
    public void i_custom_click_on_project_id_link() {
        driver = ctf.getSettings().getDriver();
        WebElement projectId = driver.findElement(By.xpath(linkProjectID));
        projectId.click();
    }

    @And("I custom click on UpdateProject button")
    public void iCustomClickOnUpdateProjectButton() throws InterruptedException {
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
                WebElement updateProjectBtn = driver.findElement(By.xpath(btnUpdateProject));
                if(updateProjectBtn.isDisplayed()){
                    updateProjectBtn.click();
                }else{
                    Assert.fail("Update Project button is not displayed");
                }

            }

        }

    }



    @And("I select project Functionality {string}")
    public void iSelectProjectFunctionality(String functionality) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement projectFunctionality = driver.findElement(By.xpath(dropProjectFunctionality));
        projectFunctionality.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(functionality);
    }

    @And("I custom select project technology {string}")
    public void iCustomSelectProjectTechnology(String technology) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement projectTechnology = driver.findElement(By.xpath("(//span[contains(text(),'Technology')]//following::div[2])[2]"));
        projectTechnology.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(technology);
        Thread.sleep(1000);
        projectTechnology.click();
    }

    @And("I custom verify updates in Field Audit {string}")
    public void iCustomVerifyUpdatesInFieldAudit(String Newvalue) {
        driver = ctf.getSettings().getDriver();
        List<WebElement> fieldValues = driver.findElements(By.xpath("//p[@class='ParagraphText---richtext_paragraph ParagraphText---default_direction ParagraphText---align_start elements---global_p']"));
  for(WebElement fieldValue:fieldValues){
      String txtfield = fieldValue.getText();
      if(txtfield.contains(Newvalue)){
          System.out.println("update project changes updated in field Audit");
          break;
      }

  }

    }

    @And("I custom select project Functionality {string}")
    public void iCustomSelectProjectFunctionality(String functionality) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(updatefunction)).click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(functionality);
        Thread.sleep(1000);
        driver.findElement(By.xpath(updatefunction)).click();
    }

    @And("I custom change demand status")
    public void iCustomChangeDemandStatus() {
        driver = ctf.getSettings().getDriver();
        List<WebElement> demandCheckBxes = driver.findElements(By.xpath("//table[@class='PagingGridLayout---table PagingGridLayout---scrollable PagingGridLayout---striped']/tbody/tr/td[1]//input"));
        for(WebElement checkbox:demandCheckBxes){
            if(checkbox.isEnabled()){
                JavascriptExecutor executor = (JavascriptExecutor)driver;
                executor.executeScript("arguments[0].click();", checkbox);
                break;
            }
        }
    }
}
