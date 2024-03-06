package StepDefinition;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utility.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    public static TestContext contTest;
    public static LoginPage loginPage;
    public static HomePage home;

    public LoginStep() {
        contTest = new TestContext();
       // loginPage = PageObjectManager.getLoginPage();
     loginPage =  new LoginPage();
     home= new HomePage();
        //home = PageObjectManager.getHomePage();
    }

    @Given("I am on the login screen")
    public void i_am_on_the_login_screen() {
       loginPage.openUrl();
    }
    @Given("I enter Username")
    public void i_enter_username() {
        loginPage.enterUserName();
    }
    @Given("I enter the correct password")
    public void i_enter_the_correct_password() {
        loginPage.enterPassword();
    }
    @When("I press Log in")
    public void i_press_log_in() {
        loginPage.clickOnSignInBtn();
    }
    @Then("I should see the HomePage")
    public void i_should_see_the_home_page() {
       home.ValidateHomePage();
    }
    @Given("I enter the wrong password")
    public void i_enter_the_wrong_password() {

    }
    @Then("I should see an error message telling me the login attempt was invalid")
    public void i_should_see_an_error_message_telling_me_the_login_attempt_was_invalid() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
