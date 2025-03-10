package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateNewAccountPage;
import pageObjects.SignInPage;

public class SignInStep {
    private static SignInPage signIn = new SignInPage();
    private static CreateNewAccountPage newAccount = new CreateNewAccountPage();
    @Given("User is on the Customer Login page")
    public void userIsOnTheCustomerLoginPage(String home) {
        signIn.verify_LoginPage();

    }

    @And("User clicks on Sign In button")
    public void userClicksOnSignInButton() {
        signIn.signInButton();
    }



    @When("User enters Email {string}")
    public void userEntersEmail(String email) {
        signIn.entersEmail_login(email);
    }

    @And("User enters Password {string}")
    public void userEntersPassword(String password) {
        signIn.entersPassword(password);
    }


    @Then("User should be logged in and redirected to the {string}")
    public void userShouldBeLoggedInAndRedirectedToThe(String home) {
        newAccount.homePageValidation(home);
    }
}
