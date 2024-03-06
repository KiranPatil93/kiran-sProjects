package com.appiancorp.ps.cucumber.fixtures;

import Utility.TestUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static Utility.TestUtil.generateRandomString;
import static com.appiancorp.ps.cucumber.fixtures.Locators.*;

public class CreateDemandStep extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver = null;

    @And("I custom enter opportunity name")
    public void iCustomEnterOpportunityName() {
        driver = ctf.getSettings().getDriver();
        int lengthOfRandomString = 10; // Specify the desired length of the random string
        String randomString = generateRandomString(lengthOfRandomString);
        System.out.println("Generated Random String: " + randomString);

        driver.findElement(By.xpath(opportunity)).sendKeys(randomString);
    }

    @And("I custom select contract channel from dropdown {string}")
    public void iCustomSelectContractChannelFromDropdown(String channel) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(contractingChannel)).click();
        TestUtil.selectdropdownValue(channel);
    }

    @And("I custom select contracting entity address {string}")
    public void iCustomSelectContractingEntityAddress(String entity) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(entityAddress)).click();
        TestUtil.selectdropdownValue(entity);
    }

    @And("I custom select Domain {string}")
    public void iCustomSelectDomain(String domain) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(selectDomain)).click();
        TestUtil.selectdropdownValue(domain);
    }

    @And("I custom select Lead Type from dropdown {string}")
    public void iCustomSelectLeadTypeFromDropdown(String leadType) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(selectLeadType)).click();
        TestUtil.selectdropdownValue(leadType);
    }

    @And("I custom select Confidentiality Coverage from dropdown {string}")
    public void iCustomSelectConfidentialityCoverageFromDropdown(String NDA) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(confidientiallyCoverage)).click();
        TestUtil.selectdropdownValue(NDA);
    }

    @And("I custom enter tentative start Date {string}")
    public void iCustomEnterTentativeStartDate(String startDate) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(demandStartDate)).sendKeys(startDate);
    }

    @And("I custom enter tentative end date {string}")
    public void iCustomEnterTentativeEndDate(String endDate) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(demandEndDate)).sendKeys(endDate);
    }

    @And("I custom select currency from dropdown {string}")
    public void iCustomSelectCurrencyFromDropdown(String currency) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(selectCurrency)).click();
        TestUtil.selectdropdownValue(currency);
    }

    @And("I custom enter contract value {string}")
    public void iCustomEnterContractValue(String contractValue) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(contractValues)).sendKeys(contractValue);
    }

    @And("I custom select onshore\\/offshore from dropdown {string}")
    public void iCustomSelectOnshoreOffshoreFromDropdown(String shore) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(selectShore)).click();
        TestUtil.selectdropdownValue(shore);
    }

    @And("I custom select location from dropdown {string}")
    public void iCustomSelectLocationFromDropdown(String location) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(selectLocation)).click();
        TestUtil.selectdropdownValue(location);
    }

    @And("I custom select demand start Date {string}")
    public void iCustomSelectDemandStartDate(String date) {
        driver.findElement(By.xpath(StartDate)).sendKeys(date);
    }

    @And("I custom select end client {string}")
    public void iCustomSelectEndClient(String client) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(endClient)).click();
        TestUtil.selectdropdownValue(client);
    }

    @And("I custom select onshoreoffshore from dropdown {string}")
    public void iCustomSelectOnshoreoffshoreFromDropdown(String shore) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(selectShore)).click();
        TestUtil.selectdropdownValue(shore);
    }

    @And("I custom enter days")
    public void iCustomEnterDays() {
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 50 and 150
        int randomDays = random.nextInt(101) + 50; // Generates a number between 0 and 100 and adds 50

        // Print the random number generated
        System.out.println("Random days: " + randomDays);
        driver.findElement(By.xpath(enterDays)).sendKeys(Integer.toString(randomDays));

    }

    @And("I custom enter daily Rate")
    public void iCustomEnterDailyRate() {
        // Create a Random object
        Random random = new Random();

        // Generate a random 4-digit number
        int randomRate = random.nextInt(9000) + 1000; // Random number between 1000 and 9999
        System.out.println("Random days: " + randomRate);
        driver.findElement(By.xpath(enterDailyRate)).sendKeys(Integer.toString(randomRate));
    }

    @And("I custom select demand currency {string}")
    public void iCustomSelectDemandCurrency(String demandCurr) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(demandCurrency)).click();
        TestUtil.selectdropdownValue(demandCurr);
    }


    @And("I custom click on add demand link")
    public void iCustomClickOnAddDemandLink() {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath(addDemandLink)).click();
    }
}
