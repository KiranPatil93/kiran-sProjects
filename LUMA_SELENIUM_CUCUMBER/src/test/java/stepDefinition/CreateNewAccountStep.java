package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseFixture;
import pageObjects.CreateNewAccountPage;

public class CreateNewAccountStep {
    private static CreateNewAccountPage newAccount = new CreateNewAccountPage();

    @Given("User is on {string}")
    public void userIsOn(String home) {
        newAccount.homePageValidation(home);
    }

    @And("user click on link {string}")
    public void userClickOnLink(String link) {
        newAccount.click_CreateNewAccount(link);
    }

    @And("user navigate on Create New Customer Account page")
    public void userNavigateOnCreateNewCustomerAccountPage() {
        newAccount.validation_CreateNewAccountPage();
    }

    @When("user enter first name {string}")
    public void userEnterFirstName(String firstName) {
        newAccount.enterFirstName(firstName);
    }

    @And("user enter last name {string}")
    public void userEnterLastName(String lastName) {
        newAccount.enterLastName(lastName);
    }

    @And("user enter email {string}")
    public void userEnterEmail(String email) {
        newAccount.enterEmail(email);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        newAccount.enterPassword(password);
    }

    @And("user enter confirm password {string}")
    public void userEnterConfirmPassword(String confirmPassword) {
        newAccount.enterConfirmPassword(confirmPassword);
    }

    @And("user click on button {string}")
    public void userClickOnButton(String button) {
        newAccount.click_button(button);
    }

    @Then("successfully account should create")
    public void successfullyAccountShouldCreate() {
        newAccount.validation_SuccessAccount();
    }
}

