package com.appiancorp.ps.cucumber.fixtures;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.appiancorp.ps.cucumber.fixtures.Locators.*;

public class VerifySOWsteps extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= null;


    @And("I custom verify start Date {string}")
    public void iCustomVerifyStartDate(String sDate) {
        driver = ctf.getSettings().getDriver();
        WebElement startDate = driver.findElement(By.xpath(verify_StartDate));
        if(startDate.isEnabled()){
            System.out.println("User able to add start Date Manually");
            startDate.sendKeys(sDate);
        }else{
            System.out.println("Start Date from SFS side");
        }
    }

    @And("I custom verify End Date {string}")
    public void iCustomVerifyEndDate(String eDate) {
        driver = ctf.getSettings().getDriver();
        WebElement endDate = driver.findElement(By.xpath(verify_EndDate));
        if(endDate.isEnabled()){
            System.out.println("User able to add End Date Manually");
            endDate.sendKeys(eDate);
        }else{
            System.out.println("End Date from SFS side");
        }
    }
    @And("I custom verify SOW")
    public void iCustomVerifySOW() {
WebElement verifySOW = driver.findElement(By.xpath(sow));
System.out.println(verifySOW.isEnabled());
if(verifySOW.isEnabled()){
    System.out.println("SOW data is not present");


}else{
    System.out.println("SOW is present ");
}
    }

    @And("I custom verify demand creation")
    public void iCustomVerifyDemandCreation() {
        WebElement verifySFSDemands = driver.findElement(By.xpath(sfsdemands));
        String demandLink = verifySFSDemands.getText();
        if(demandLink.equals("Add New Demand")){
            System.out.println("No Demands from SFS side");

        }else{
            System.out.println("Demands from SFS side");
        }
    }

    @Then("I custom verify cost model value {string} is present")
    public void iCustomVerifyCostModelValueIsPresent(String costModel) {
        driver = ctf.getSettings().getDriver();
        WebElement txtcostModel = driver.findElement(By.xpath("//div[contains(text(),'"+costModel+"')]"));
if(txtcostModel.isDisplayed()){
    System.out.println("Cost Model value is :"+txtcostModel);
}
    }
}
