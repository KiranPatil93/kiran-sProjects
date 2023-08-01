package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.customer;
import static StepDefinition.Hooks.onboarding;

public class OnboardingSummaryStep {
    @Given("I click on Onboarding Menu")
    public void iClickOnOnboardingMenu() {
        onboarding.clickOnOnboardingMenu();
    }

    @And("I navigate on Onboarding page")
    public void iNavigateOnOnboardingPage() {
        onboarding.validateOnBoardingPage();
    }

    @When("I click on Onboarding ID {string}")
    public void iClickOnOnboardingID(String customerName) {
        onboarding.clickOnOnboardingId(customerName);
    }

    @Then("I can see onboarding summary")
    public void iCanSeeOnboardingSummary() {
        onboarding.validate_OnboardingSummaryPage();
    }

    @When("I click on customer name {string}")
    public void iClickOnCustomerName(String customerName) {
        onboarding.clickOnCustomerNamelink(customerName);
    }

    @Then("I can see Customer details")
    public void iCanSeeCustomerDetails() {
        onboarding.validate_CustomerNameSummary();

    }

    @And("I click on Onboarding ID")
    public void iClickOnOnboardingID() {

    }

    @Then("I can see Assignee details")
    public void iCanSeeAssigneeDetails() {
        onboarding.validate_AssigneeSummaryPage();
    }

    @When("I click on Documents link")
    public void iClickOnDocumentsLink() {
        customer.clickOnDocumentsLink();
    }

    @Then("I can see Documents page")
    public void iCanSeeDocumentsPage() {
        customer.validate_DocumentsPage();
    }

    @When("I click on Tasks link")
    public void iClickOnTasksLink() {
        onboarding.clickOnTaskTab();
    }

    @Then("I can see Tasks page")
    public void iCanSeeTasksPage() {
        onboarding.validate_TaskPage();
    }

    @When("I click on New Tasks button")
    public void iClickOnNewTasksButton() {
        onboarding.clickOnNewTaskBtn();
    }

    @Then("I can navigate on New Task page")
    public void iCanNavigateOnNewTaskPage() {
        onboarding.validate_AddTaskPage();
    }

    @When("I click on Action Log link")
    public void iClickOnActionLogLink() {
        onboarding.clickOnActionLogTab();
    }

    @Then("I can see Action Log page")
    public void iCanSeeActionLogPage() {
        onboarding.validate_ActionLogPage();
    }

    @When("I click on Discussion link")
    public void iClickOnDiscussionLink() {
        onboarding.clickOnDiscussionTab();
    }

    @Then("I can see Discussion page")
    public void iCanSeeDiscussionPage() {
        onboarding.validate_DiscussionPage();
    }

    @When("I click on Owners link")
    public void iClickOnOwnersLink() {
        onboarding.clickOnOwnersTab();
    }

    @Then("I can see Owners page")
    public void iCanSeeOwnersPage() {
        onboarding.validate_OwnersPage();
    }

    @When("I click on Add Owners button")
    public void iClickOnAddOwnersButton() {
        onboarding.clickOnOAddOwnerBtn();
    }

    @Then("I can see Add Owners page")
    public void iCanSeeAddOwnersPage() {
        onboarding.validate_AddOwnersPage();
    }

    @When("I click on Onboarding name link")
    public void iClickOnOnboardingNameLink() {
onboarding.clickOnOnboardingName();
    }

    @Then("I can navigate on Onboarding summary page")
    public void iCanNavigateOnOnboardingSummaryPage() {
        onboarding.validate_windowOnboardingSummary();
    }

    @When("I click on Risk Assessment link")
    public void iClickOnRiskAssessmentLink() {
        onboarding.clickOnLinkRiskAssessmentLink();
    }

    @Then("I can see Risk Assessment page")
    public void iCanSeeRiskAssessmentPage() {
        onboarding.validate_LinkRiskAssessment();
    }

    @When("I click on Link Risk Assessment to onboarding button")
    public void iClickOnLinkRiskAssessmentToOnboardingButton() {

    }

    @Then("I can navigate on Create Risk Assessment page")
    public void iCanNavigateOnCreateRiskAssessmentPage() {
    }

    @When("I click on New Tasks link")
    public void iClickOnNewTasksLink() {
        onboarding.clickOnNewTaskLink();
    }

    @Then("I can navigate on New Tasks page")
    public void iCanNavigateOnNewTasksPage() {
            onboarding.validate_NewTaskPage();
    }

    @When("I click on Cancel link")
    public void iClickOnCancelLink() {
        onboarding.clickOnOCancelLink();
    }

    @Then("I can navigate on Cancel Onboarding page")
    public void iCanNavigateOnCancelOnboardingPage() {

    }

    @When("I click on Complete link")
    public void iClickOnCompleteLink() {
        onboarding.clickOnOCompleteLink();

    }

    @Then("I can navigate on Complete Onboarding page")
    public void iCanNavigateOnCompleteOnboardingPage(){
    }

    @When("I click on Update link")
    public void iClickOnUpdateLink() {
        onboarding.clickOnUpdatefundingDateLink();
    }

    @Then("I can navigate on Update Onboarding page")
    public void iCanNavigateOnUpdateOnboardingPage() {
    }

    @When("I click on Pause link")
    public void iClickOnPauseLink() {
    }

    @Then("I can navigate on Pause Onboarding page")
    public void iCanNavigateOnPauseOnboardingPage() {
    }

    @When("I click on Update funding date link")
    public void iClickOnUpdateFundingDateLink() {
    }

    @Then("I can navigate on Update funding date page")
    public void iCanNavigateOnUpdateFundingDatePage() {
    }

    @When("I click on Update funding value link")
    public void iClickOnUpdateFundingValueLink() {
    }

    @Then("I can navigate on Update funding value page")
    public void iCanNavigateOnUpdateFundingValuePage() {
    }

    @When("I click on attach Documents link")
    public void iClickOnAttachDocumentsLink() {
    }

    @Then("I can navigate on attach Documents page")
    public void iCanNavigateOnAttachDocumentsPage() {
    }

    @When("I click on Add Owner link")
    public void iClickOnAddOwnerLink() {
    }

    @Then("I can navigate on Add Owner page")
    public void iCanNavigateOnAddOwnerPage() {
    }

    @When("I click on Link Risk Assessment to onboarding link")
    public void iClickOnLinkRiskAssessmentToOnboardingLink() {
    }

    @Then("I can navigate on Link Risk Assessment to onboarding page")
    public void iCanNavigateOnLinkRiskAssessmentToOnboardingPage() {
    }

    @When("I click on Extract Task Information link")
    public void iClickOnExtractTaskInformationLink() {
    }

    @Then("I can navigate on Extract Task Information page")
    public void iCanNavigateOnExtractTaskInformationPage() {
    }

    @When("I click on Add product link")
    public void iClickOnAddProductLink() {
    }

    @Then("I can navigate on Add product page")
    public void iCanNavigateOnAddProductPage() {
    }

    @When("I click on Attach multiple documents link")
    public void iClickOnAttachMultipleDocumentsLink() {
    }

    @Then("I can navigate on Attach multiple documents page")
    public void iCanNavigateOnAttachMultipleDocumentsPage() {
    }

    @And("I can click on Add Owner button")
    public void iCanClickOnAddOwnerButton() {
        onboarding.clickOnAddOwnerBtn();

    }

    @And("I navigate on Add owner page")
    public void iNavigateOnAddOwnerPage() {
        onboarding.validate_AddOwnersPage();
    }
}
