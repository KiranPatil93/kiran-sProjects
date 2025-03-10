package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static StepDefinition.Hooks.loginPage;

public class LoginStep {
    @Given("I open the url of the application")
    public void iOpenTheUrlOfTheApplication() {
        loginPage.openUrl();

    }

    @When("I enter the email")
    public void iEnterTheEmail() {
        loginPage.enterUserID();

    }

    @And("I enter the password")
    public void iEnterThePassword() {

        loginPage.enterPassword();
    }

    @And("I click on Login button")
    public void iClickOnLoginButton() {

        loginPage.clickLoginBtn();
    }

    @Then("I should navigate on home page")
    public void iShouldNavigateOnHomePage() {

        System.out.println("user is on home page");
    }
}
