package com.appiancorp.ps.cucumber.fixtures;

import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.appiancorp.ps.cucumber.fixtures.ApprovalflowLocators.*;

public class UpdateDemandStep extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver = null;

    @And("I custom click on update Demand Action")
    public void iCustomClickOnUpdateDemandAction() {
        driver = ctf.getSettings().getDriver();
        WebElement updateDemandAction = driver.findElement(By.xpath(actionUpdateDemandStatus));
        updateDemandAction.click();
    }

    @And("I custom click on update demand")
    public void iCustomClickOnUpdateDemand() {
        driver = ctf.getSettings().getDriver();
        WebElement updateDemand = driver.findElement(By.xpath(UpdateDemandStatus));
   Actions act = new Actions(driver);
   act.moveToElement(updateDemand).click().build().perform();
    }

    @And("I custome change demand status {string}")
    public void iCustomeChangeDemandStatus(String status) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WebElement updateDemand = driver.findElement(By.xpath(changeStatus));
        updateDemand.click();
        Thread.sleep(1000);
        TestUtil.selectdropdownValue(status);
    }

    @And("I verify Tooltip value {string}")
    public void iVerifyTooltipValue(String status) {
        driver = ctf.getSettings().getDriver();
        WebElement updateDemandTooltip = driver.findElement(By.xpath(tooltipstatus));
        Actions act = new Actions(driver);
        act.moveToElement(updateDemandTooltip).build().perform();
    }

    @And("I custom change demand status {string}")
    public void iCustomChangeDemandStatus(String demandstatus) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        List<WebElement> listdemandstatus = driver.findElements(By.xpath("//table[@class='EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable']/tbody/tr/td[12]//div//span"));
        for(WebElement status:listdemandstatus){
            String txtDemandStatus = status.getText();
            System.out.println(txtDemandStatus);
            if(txtDemandStatus.contains("Pending Initiation")){
                status.click();
                Thread.sleep(1000);
                TestUtil.selectdropdownValue(demandstatus);
                break;
            }
        }
    }
}
