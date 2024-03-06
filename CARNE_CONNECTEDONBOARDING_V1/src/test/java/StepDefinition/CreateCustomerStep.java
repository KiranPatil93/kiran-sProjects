package StepDefinition;

import PageObjects.CustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCustomerStep {
    //public static TestContext contTest;
    public static CustomerPage customer;
    public CreateCustomerStep(){
     //   contTest = new TestContext();
       // customer = PageObjectManager.getCustomerPage();
       // customer = contTest.getPageObjectManager().getCustomerPage();
        customer = new CustomerPage();
    }
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
        customer.selectCustomerType(option);
    }

    @When("I click on Type dropdown")
    public void iClickOnTypeDropdown() {
    }

    @And("I can select option from Type dropdown {string}")
    public void iCanSelectOptionFromTypeDropdown(String arg0, String arg1) {
    }

    @And("I enter client name in Name field {string}")
    public void iEnterClientNameInNameField(String arg0, String arg1) {
    }

    @And("I click on Look Up Client button")
    public void iClickOnLookUpClientButton() {
    }

    @Then("I should see client details {string}")
    public void iShouldSeeClientDetails(String arg0, String arg1) {
    }

    @Then("I should see warning message {string}")
    public void iShouldSeeWarningMessage(String arg0, String arg1) {
    }

    @And("I click on radio button for Oversight of Customer Payroll {string}")
    public void iClickOnRadioButtonForOversightOfCustomerPayroll(String arg0, String arg1) {
    }

    @And("I enter LEI code {string}")
    public void iEnterLEICode(String arg0, String arg1) {
    }

    @Then("I click on Next button")
    public void iClickOnNextButton() {
    }

    @When("I click on Add Contacts button")
    public void iClickOnAddContactsButton() {
    }

    @And("I enter FirstName {string}")
    public void iEnterFirstName(String arg0, String arg1) {
    }

    @And("I enter LastName {string}")
    public void iEnterLastName(String arg0, String arg1) {
    }

    @And("I select Title from Title dropdown {string}")
    public void iSelectTitleFromTitleDropdown(String arg0, String arg1) {
    }

    @And("I enter email {string}")
    public void iEnterEmail(String arg0, String arg1) {
    }

    @And("I select country from Country of residence {string}")
    public void iSelectCountryFromCountryOfResidence(String arg0, String arg1) {
    }

    @And("I select Date of Birth {string}")
    public void iSelectDateOfBirth(String arg0, String arg1) {
    }

    @Then("I click on Add Contact button")
    public void iClickOnAddContactButton() {
    }

    @And("I enter name {string}")
    public void iEnterName(String arg0, String arg1) {
    }

    @And("I select domicile {string}")
    public void iSelectDomicile(String arg0, String arg1) {
    }

    @And("I select country {string}")
    public void iSelectCountry(String arg0, String arg1) {
    }

    @And("I select Incorporation date {string}")
    public void iSelectIncorporationDate(String arg0, String arg1) {
    }

    @And("I select Financial Year enter details {string}")
    public void iSelectFinancialYearEnterDetails(String arg0, String arg1) {
    }

    @And("I enter other fund Information {string}")
    public void iEnterOtherFundInformation(String arg0, String arg1) {
    }

    @Then("I click on Submit button")
    public void iClickOnSubmitButton() {
    }
}
