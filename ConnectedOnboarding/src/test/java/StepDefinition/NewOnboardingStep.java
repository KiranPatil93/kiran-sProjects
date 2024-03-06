package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.*;

public class NewOnboardingStep {
    @Given("I am on Home page")
    public void iAmOnHomePage() {
      home.ValidateHomePage();
    }

    @When("I click on Onboarding menu")
    public void iClickOnOnboardingMenu() {
        onboarding.clickOnOnboardingMenu();
    }

    @Then("I am on Onboarding page")
    public void iAmOnOnboardingPage() {
        onboarding.validateOnBoardingPage();
    }

    @When("I click on New Onboarding button")
    public void iClickOnNewOnboardingButton() {
        onboarding.clickOnNewOnboardingPage();

    }

    @Then("I am on New Onboarding page")
    public void iAmOnNewOnboardingPage() {
        onboarding.validate_OnNewOnboardingPage();
    }

    @When("I choose customer name {string}")
    public void iChooseCustomerName(String customerName) {
      onboarding.enterCustomerName(customerName);
    }

    @And("I enter customer name {string}")
    public void iEnterCustomerName(String customerName) {
        onboarding.enterCustomerName(customerName);
    }

    @And("I can choose Customer name")
    public void iCanChooseCustomerName() {

    }

    @And("I am on Provide Onboarding details page")
    public void iAmOnProvideOnboardingDetailsPage() {
        onboarding.validate_ProvideOnboardingDetails();
    }

    @When("I click on Customer name {string}")
    public void iClickOnCustomerName(String customerName) {
onboarding.clickOnCustomerName(customerName);
    }

    @Then("I navigate on Customer details page")
    public void iNavigateOnCustomerDetailsPage() {
onboarding.validate_CustomerNameSummary();
    }

    @When("I enter Estimated Onboarding Completion Date {string}")
    public void iEnterEstimatedOnboardingCompletionDate(String completionDate) {
        onboarding.enterOnboardingEstimateCompletionDate(completionDate);
    }

    @And("I navigate on Add Products page")
    public void iNavigateOnAddProductsPage() {
        onboarding.validate_AddProductsPage();
    }

    @And("I can see onboarding ID")
    public void iCanSeeOnboardingID() {
        onboarding.validate_OnboardingID();
    }

    @And("I can see success messgae {string}")
    public void iCanSeeSuccessMessgae(String message) {
        onboarding.validate_SuccessMessage(message);
    }

    @When("I click on Go to process setup page button")
    public void iClickOnGoToProcessSetupPageButton() {
        onboarding.clickOnProcessSetupBtn();
    }

    @Then("I navigate on Onboarding process setup page")
    public void iNavigateOnOnboardingProcessSetupPage() {
        onboarding.validate_ProcessSetupPage();
    }
}
