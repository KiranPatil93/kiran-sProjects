package StepDefinition;

import Utility.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.home;
import static StepDefinition.Hooks.loginPage;


public class LoginStep extends DriverFactory{

    @Given("I am on the login screen")
    public void iAmOnTheLoginScreen() {
        openUrl();
    }
    @And("I enter wrong Username {string}")
    public void iEnterWrongUsername(String wrongUsername) {
loginPage.enterWrongUsername(wrongUsername);
    }

    @And("I enter the wrong password {string}")
    public void iEnterTheWrongPassword(String wrongPassword) {

        loginPage.enterWrongPassword(wrongPassword);
    }
    @And("I enter Username")
    public void iEnterUsername() {
        loginPage.enterUserName();
    }

    @And("I enter the wrong password")
    public void iEnterTheWrongPassword() {
        loginPage.enterPassword();
    }

    @When("I press Log in")
    public void iPressLogIn() {
        loginPage.clickOnSignInBtn();
    }

    @Then("I should see an error message telling me the login attempt was invalid")
    public void iShouldSeeAnErrorMessageTellingMeTheLoginAttemptWasInvalid() {
        loginPage.validationErrorMessage();
    }

    @And("I enter the correct password")
    public void iEnterTheCorrectPassword() {
        loginPage.enterPassword();
    }

    @Then("I should see the HomePage")
    public void iShouldSeeTheHomePage() {
        home.ValidateHomePage();
    }


    @When("I click on user Profile")
    public void iClickOnUserProfile() {
        loginPage.clickOnUserProfile();
    }

    @And("I click on SignOut button")
    public void iClickOnSignOutButton() {
        loginPage.clickOnSignOutBtn();
    }

    @Then("I should see Login page")
    public void iShouldSeeLoginPage() {
        loginPage.validateLoginPage();
    }
}
