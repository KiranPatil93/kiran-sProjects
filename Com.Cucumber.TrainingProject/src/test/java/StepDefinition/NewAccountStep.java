package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.accountPage;

public class NewAccountStep {
    @When("I click on new Account menu")
    public void iClickOnNewAccountMenu() {

    }

    @And("I enter customer id {string}")
    public void iEnterCustomerId(String ID) {
        accountPage.enterCustomerID(ID);

    }

    @And("I select account type {string}")
    public void iSelectAccountType(String arg0) {

    }

    @And("I enter initial deposit {string}")
    public void iEnterInitialDeposit(String arg0) {

    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
    }
}
