package StepDefinition;

import Utility.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

import static StepDefinition.Hooks.customer;
import static StepDefinition.Hooks.excel;

public class CustomerSummaryStep extends DriverFactory {
    @When("I click on customer name link {string}")
    public void iClickOnCustomerNameLink(String customerName) {
        customer.clickOnCustomerNameLink(customerName);
    }

    @Then("I can navigate on customer page")
    public void iCanNavigateOnCustomerPage() {
        customer.validate_CustomerSummaryPage();
    }

    @When("I click on add sub funds button")
    public void iClickOnAddSubFundsButton() {
        customer.clickOnAddfundsBtn();
    }

    @And("I enter  Fund name {string}")
    public void iEnterFundName(String name) {
    customer.enterclientName(name);
    }

    @And("I  select Domicile from Domicile dropdown {string}")
    public void iSelectDomicileFromDomicileDropdown(String domicile) {
        customer.selectDomicile(domicile);
    }

    @And("I  select currency from Currency dropdown {string}")
    public void iSelectCurrencyFromCurrencyDropdown(String currency) {
        customer.selectCuurency(currency);
    }

    @And("I  select Incorporate date {string}")
    public void iSelectIncorporateDate(String date, String arg1) {
        customer.enterIncoroporationDate(date);
    }

    @And("I select Finanacial year end Date {string}")
    public void iSelectFinanacialYearEndDate(String financeEndDate) {
        customer.enterFinancialYearEndDate(financeEndDate);
    }

    @When("I click on Log into RDC button")
    public void iClickOnLogIntoRDCButton() {
        customer.clickOnRDCBtn();
    }

    @Then("I navigate on RDC page")
    public void iNavigateOnRDCPage() {
        customer.validateRDCPage();
    }

    @When("I click on Basic Info link")
    public void iClickOnBasicInfoLink() {
        customer.clickOnBsicInfo();
    }

    @Then("I can navigate on Basic Info page")
    public void iCanNavigateOnBasicInfoPage() {
        customer.validateBasicInfoPage();
    }

    @And("I can navigate on customer summary page")
    public void iCanNavigateOnCustomerSummaryPage() {
        customer.validate_CustomerSummaryPage();
    }

    @When("I click on Add previous Name link")
    public void iClickOnAddPreviousNameLink() {
        customer.clickOnPreviousCustomerNameLink();
    }

    @And("I can navigate on Add previous Name page")
    public void iCanNavigateOnAddPreviousNamePage() {
        customer.validate_addLinksPage();
    }

    @And("I enter previous customer name in Name field {string}")
    public void iEnterPreviousCustomerNameInNameField(String name) {
        customer.enterPreviousCustomerName(name);
    }

    @And("I select Effective from date {string}")
    public void iSelectEffectiveFromDate(String effectiveFrom) {
        customer.enterDateEffectiveFrom(effectiveFrom);
    }

    @And("I select Ceased on date {string}")
    public void iSelectCeasedOnDate(String ceasedOn) {
        customer.enterDateCeasedOn(ceasedOn);
    }

    @And("I click on Add previous customer name button")
    public void iClickOnAddPreviousCustomerNameButton() {
        customer.clickOnPreviousCustomerNameBtn();
    }

    @Then("I can see previous customer name added on Basic Info page {string}")
    public void iCanSeePreviousCustomerNameAddedOnBasicInfoPage(String arg0, String arg1) {


    }


    @And("I  navigate on customer summary page")
    public void iNavigateOnCustomerSummaryPage() {
        customer.validate_CustomerSummaryPage();
    }

    @And("I navigate on Basic Info page")
    public void iNavigateOnBasicInfoPage() {
        customer.validateBasicInfoPage();
    }

    @When("I click on Add Beneficial owner link")
    public void iClickOnAddBeneficialOwnerLink() {
        customer.clickOnBenificialOwnerLink();
    }

    @And("I navigate on Add Beneficial owner page")
    public void iNavigateOnAddBeneficialOwnerPage() {
        customer.validate_AddBenfecialOwnerPage();
    }

    @And("I enter Benificial name {string}")
    public void iEnterBenificialName(String arg0, String arg1) {
    }

    @And("I select owner type {string}")
    public void iSelectOwnerType(String arg0, String arg1) {
    }

    @And("I enter Date of Birth {string}")
    public void iEnterDateOfBirth(String arg0, String arg1) {
    }

    @And("I enter percentage of ownership {string}")
    public void iEnterPercentageOfOwnership(String arg0, String arg1) {
    }

    @And("I enter government Issued Id {string}")
    public void iEnterGovernmentIssuedId(String arg0, String arg1) {
    }

    @And("I enter Country\\/Jurisdiction {string}")
    public void iEnterCountryJurisdiction(String arg0, String arg1) {
    }

    @Then("I click on Add Benificial Owner button")
    public void iClickOnAddBenificialOwnerButton() {
        customer.clickOnBenificialOwnerLBtn();
    }

    @When("I click on documents link")
    public void iClickOnDocumentsLink() {
        customer.clickOnDocumentsLink();
    }

    @Then("I can see Documents page {string}")
    public void iCanSeeDocumentsPage() {
        customer.validate_DocumentsPage();
    }

    @When("I click on Products link")
    public void iClickOnProductsLink() {
        customer.clickOnProductsLink();
    }

    @Then("I can see Products page")
    public void iCanSeeProductsPage() {
        customer.validate_ProductsPage();
    }

    @When("I click on History link")
    public void iClickOnHistoryLink() {
        customer.clickOnHistoryTabLink();
    }

    @Then("I can see History page {string}")
    public void iCanSeeHistoryPage(String historyPage) {
        customer.validate_HistoryPage(historyPage);
    }

    @When("I click on Risk Assessments link")
    public void iClickOnRiskAssessmentsLink() {
        customer.clickOnRiskAssessmentTabLink();
    }

    @Then("I can see Risk Assessments page")
    public void iCanSeeRiskAssessmentsPage() {
        customer.validate_RiskAssessmentsPage();
    }

    @When("I click on Proposals link")
    public void iClickOnProposalsLink() {
        customer.clickOnProposalsTabLink();
    }

    @Then("I can see Proposals page")
    public void iCanSeeProposalsPage() {
        customer.validate_ProposalsPage();
    }

    @When("I click on Related Actions link")
    public void iClickOnRelatedActionsLink() {
        customer.clickOnRelatedActionsTabLink();
    }

    @Then("I can see Related Actions page")
    public void iCanSeeRelatedActionsPage() {
        customer.validate_RelateActionsPage();

    }

    @When("I click on attach link")
    public void iClickOnAttachLink() {
        customer.clickOnAttchLink();
    }

    @Then("I navigate on Attach page")
    public void iNavigateOnAttachPage() {
        customer.validate_AttachPage();
    }

    @When("I click on Edit Details link")
    public void iClickOnEditDetailsLink() {

    }

    @Then("I navigate on Edit Details page")
    public void iNavigateOnEditDetailsPage() {

    }

    @When("I click on Edit Entity Relationship link")
    public void iClickOnEditEntityRelationshipLink() {
        customer.clickOnEditEntityRelationshipsLink();
    }

    @Then("I navigate on Edit Entity Relationship page")
    public void iNavigateOnEditEntityRelationshipPage() {

    }

    @When("I click on Update contacts link")
    public void iClickOnUpdateContactsLink() {
customer.clickOnUpdateContactsLink();
    }

    @Then("I navigate on Update contacts page")
    public void iNavigateOnUpdateContactsPage() {
        customer.validate_UpdateContactsPage();
    }

    @When("I click on Edit Delegate Relationships link")
    public void iClickOnEditDelegateRelationshipsLink() {

    }

    @Then("I navigate on Edit Delegate Relationships page")
    public void iNavigateOnEditDelegateRelationshipsPage() {

    }

    @When("I click on Add Address link")
    public void iClickOnAddAddressLink() {
        customer.clickOnAddAddressLink();
    }

    @Then("I navigate on Add Address page")
    public void iNavigateOnAddAddressPage() {
        customer.validate_addAddressPage();
    }

    @When("I click on Add links link")
    public void iClickOnAddLinksLink() {
        customer.clickOnAddLinksLink();
    }

    @Then("I navigate on Add links page")
    public void iNavigateOnAddLinksPage() {
        customer.validate_addLinksPage();
    }

    @When("I click on Add Previous  link")
    public void iClickOnAddPreviousLink() {
        customer.clickOnAddPreviousCustomerLink();
    }

    @Then("I navigate on Add Previous  page")
    public void iNavigateOnAddPreviousPage() {
        customer.validate_CustomerSummaryPage();
    }

    @When("I click on Add Risk Assessment link")
    public void iClickOnAddRiskAssessmentLink() {
        customer.clickOnAAddRiskAssessmentLink();
    }

    @Then("I navigate on Add Risk Assessment page")
    public void iNavigateOnAddRiskAssessmentPage() {
        customer.validate_RiskAssessmentRelatedAction();
    }

    @Then("I navigate on Add Sub Funds page")
    public void iNavigateOnAddSubFundsPage() {
        customer.validate_AddSubFundsPage();
    }



    @Then("I navigate on Create Funds page")
    public void iNavigateOnCreateFundsPage() {
        customer.validate_CreateFundsPage();
    }

    @When("I click on Add sub Funds link")
    public void iClickOnAddSubFundsLink() {
        customer.clickOnAddSubFundsLink();
    }

    @When("I click on funds name")
    public void iClickOnFundsName() {
        customer.clickOnFundsName();
    }

    @When("I click on Add Funds link")
    public void iClickOnAddFundsLink() {
        customer.clickOnAAddfundsLink();
    }

    @Then("I navigate on Add Funds page")
    public void iNavigateOnAddFundsPage() {
        customer.validate_AddFundsPage();
    }

    @Given("I enter sheetname {string} and {}")
    public void iEnterSheetnameAnd(String sheetName, Integer rowNmber) throws IOException, InvalidFormatException {
        excel.readExcelFile(sheetName,rowNmber);
    }

    @And("I enter fund name {string}")
    public void iEnterFundName(String arg0, String arg1) {
    }

    @And("I select domicile value {string}")
    public void iSelectDomicileValue(String arg0, String arg1) {
    }

    @And("I enter RCS Code")
    public void iEnterRCSCode() {
    }

    @And("I enter GP RCS Number")
    public void iEnterGPRCSNumber() {
    }

    @And("I enter FATCA GIIN")
    public void iEnterFATCAGIIN() {
    }

    @And("I enter Fund TIN")
    public void iEnterFundTIN() {
    }

    @And("I enter GP TIN")
    public void iEnterGPTIN() {
    }

    @And("I enter CRO Number")
    public void iEnterCRONumber() {
    }

    @And("I enter Incorporation Date {string}")
    public void iEnterIncorporationDate(String arg0, String arg1) {
    }

    @And("I enter Financial Year End Date {string}")
    public void iEnterFinancialYearEndDate(String arg0, String arg1) {
    }

    @And("I enter Expected Launch Date {string}")
    public void iEnterExpectedLaunchDate(String arg0, String arg1) {
    }

    @And("I enter Seeding Date {string}")
    public void iEnterSeedingDate(String arg0, String arg1) {
    }

    @And("I enter ManCo\\/AIFM appointment date {string}")
    public void iEnterManCoAIFMAppointmentDate(String arg0, String arg1) {
    }

    @And("I enter CBI\\/CSSF Authorisation Date {string}")
    public void iEnterCBICSSFAuthorisationDate(String arg0, String arg1) {
    }

    @And("I enter First investment Date {string}")
    public void iEnterFirstInvestmentDate(String arg0, String arg1) {
    }

    @And("I enter Passporting notification date {string}")
    public void iEnterPassportingNotificationDate(String arg0, String arg1) {
    }

    @And("I enter First Closing Date {string}")
    public void iEnterFirstClosingDate(String arg0, String arg1) {
    }

    @And("I enter CSSF {int}\\/{int} filing date {string}")
    public void iEnterCSSFFilingDate(int arg0, int arg1, String arg2, String arg3) {
    }

    @And("I enter CSSF initial filing date \\(regulated Funds) {string}")
    public void iEnterCSSFInitialFilingDateRegulatedFunds(String arg0, String arg1) {
    }

    @And("I enter CSSF Approval Date \\(Regulated Funds) {string}")
    public void iEnterCSSFApprovalDateRegulatedFunds(String arg0, String arg1) {
    }

    @And("I enter CSSF Acknowledgement Date {string}")
    public void iEnterCSSFAcknowledgementDate(String arg0, String arg1) {
    }

    @And("I enter Date of receipt of CSSF code\\/ C code {string}")
    public void iEnterDateOfReceiptOfCSSFCodeCCode(String arg0, String arg1) {
    }

    @And("I enter Initial Client Approval Date {string}")
    public void iEnterInitialClientApprovalDate(String arg0, String arg1) {
    }

    @And("I enter Interim Client Approval date {string}")
    public void iEnterInterimClientApprovalDate(String arg0, String arg1) {
    }

    @And("I enter Final Client Approval Date {string}")
    public void iEnterFinalClientApprovalDate(String arg0, String arg1) {
    }

    @And("I enter General Partner incorporation date {string}")
    public void iEnterGeneralPartnerIncorporationDate(String arg0, String arg1) {
    }

    @And("I enter Fund Passporting approval date {string}")
    public void iEnterFundPassportingApprovalDate(String arg0, String arg1) {
    }

    @And("I enter Initial Carne Board Approval date {string}")
    public void iEnterInitialCarneBoardApprovalDate(String arg0, String arg1) {
    }

    @And("I enter Final Carne Board Approval Date {string}")
    public void iEnterFinalCarneBoardApprovalDate(String arg0, String arg1) {
    }

    @And("I enter Pre-marketing client approval date {string}")
    public void iEnterPreMarketingClientApprovalDate(String arg0, String arg1) {
    }

    @And("I click on user name")
    public void iClickOnUserName() {
    }

    @And("I click on forworded arrow")
    public void iClickOnForwordedArrow() {
    }

    @And("I select contact Type {string}")
    public void iSelectContactType(String arg0, String arg1) {
    }

    @And("I select position {string}")
    public void iSelectPosition(String arg0, String arg1) {
    }

    @And("I click on Add Delegate relationship link")
    public void iClickOnAddDelegateRelationshipLink() {
    }

    @And("I select delegate name {string}")
    public void iSelectDelegateName(String arg0, String arg1) {
    }

    @And("I select relation {string}")
    public void iSelectRelation(String arg0, String arg1) {
    }

    @And("I select delegate type {string}")
    public void iSelectDelegateType(String arg0, String arg1) {
    }

    @Then("I click on Submit button")
    public void iClickOnSubmitButton() {
    }

    @When("I click on add funds button")
    public void iClickOnAddFundsButton() {
        customer.clickOnAddfundsBtn();
    }
}
