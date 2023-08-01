package StepDefinition;

import Utility.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.customer;

public class CreateCustomerStep extends DriverFactory {
    @Given("I click on Customer Menu")
    public void iClickOnCustomerMenu() {
    customer.clickOnCustomerMenu();
    }

    @When("I click on New Customer button")
    public void iClickOnNewCustomerButton() {
        customer.clickOnNewCustomerBtn();
   }

    @Then("I should see Add New Customer page")
    public void iShouldSeeAddNewCustomerPage() {
        customer.validate_CreateCustomerPage();
    }

    @When("I select customer Type from Type dropdown {string}")
    public void iSelectCustomerTypeFromTypeDropdown(String option) {
        customer.selectCustomerType(option );
    }



    @And("I click on Look Up Client button")
    public void iClickOnLookUpClientButton() {
     customer.clickOnLookUpBtn();
    }

    @Then("I should see client details {string}")
    public void iShouldSeeClientDetails(String customerName) {
     customer.validatecustomerName(customerName);
    }

    @Then("I should see warning message {string}")
    public void iShouldSeeWarningMessage(String message) {
     customer.validate_WarningMessage(message);
    }

    @And("I click on radio button for Oversight of Customer Payroll {string}")
    public void iClickOnRadioButtonForOversightOfCustomerPayroll(String payroll) {
     customer.clickOnOversightofCustomerPayroll(payroll);
    }

    @And("I enter LEI code")
    public void iEnterLEICode() {
        customer.enterLEICode();
    }

    @Then("I click on Next button")
    public void iClickOnNextButton() {
     customer.clickOnNextBtn();
    }

    @When("I click on Add Contacts button")
    public void iClickOnAddContactsButton() {
     customer.clickOnAddContactsBtn();
    }

    @And("I enter FirstName {string}")
    public void iEnterFirstName(String firstName) {
customer.enterFirstName(firstName);
    }

    @And("I enter LastName {string}")
    public void iEnterLastName(String lastName) {
     customer.enterLastName(lastName);
    }

    @And("I select Title from Title dropdown {string}")
    public void iSelectTitleFromTitleDropdown(String title) {
     customer.selectTitle(title);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
     customer.enterEmail(email);
    }

    @And("I select country from Country of residence {string}")
    public void iSelectCountryFromCountryOfResidence(String country) {
     customer.selectCuurency(country);
    }

    @And("I select Date of Birth {string}")
    public void iSelectDateOfBirth(String date) {
     customer.enterBirthDate(date);
    }

    @Then("I click on Add Contact button")
    public void iClickOnAddContactButton() {
     customer.clickOnAddContactButton();
    }


    @And("I enter name {string}")
    public void iEnterName(String name) {
     customer.enterclientName(name);
    }

    @And("I select domicile {string}")
    public void iSelectDomicile(String domicile) {
     customer.selectDomicile(domicile);
    }

    @And("I select country {string}")
    public void iSelectCountry(String country) {
     customer.selectCountryResidence(country);
    }

    @And("I select Incorporation date {string}")
    public void iSelectIncorporationDate(String IncorporationDate) {
     customer.enterIncoroporationDate(IncorporationDate);
    }

    @And("I select Financial Year enter details {string}")
    public void iSelectFinancialYearEnterDetails(String FinancialDetails) {
     customer.enterFinancialYearEndDate(FinancialDetails);
    }

    @And("I enter other fund Information {string}")
    public void iEnterOtherFundInformation(String fundInfo) {
     customer.enterOtherInformation(fundInfo);
    }


    @Then("I click on submit button")
    public void iClickOnSubmitButton() {
        customer.clickOnSubmitBtn();
    }
}
