package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseFixture {
    @FindBy(xpath = "//span[@class='base']")
    WebElement loginPage;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailIDd;
    @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
    WebElement pass;
    @FindBy(xpath = "//fieldset[@class='fieldset login']//button[@id='send2']")
    WebElement signinBtn;
    @FindBy(xpath = "//div[@class='message-error error message' ]//div[contains(text(), 'account sign-in was incorrect')]")
    WebElement signInError;

    public SignInPage() {

        PageFactory.initElements(driver, this);
    }

    public void verify_LoginPage() {
        if (loginPage.isDisplayed()) {
            System.out.println("User is on customer login page");
        } else {
            Assert.fail("User is not on customer login page");
        }
    }

    public void entersEmail_login(String emailID) {
        if (emailIDd.isDisplayed()) {
            emailIDd.sendKeys(emailID);
        } else {
            Assert.fail("email ID field not visible");
        }
    }

    public void entersPassword(String password) {
        if (pass.isDisplayed()) {
            pass.sendKeys(password);
        } else {
            Assert.fail("password field not visible");
        }
    }

    public void signInButton() {
        if (signinBtn.isDisplayed()) {
            signinBtn.click();
        } else {
            Assert.fail("Sign in button field not visible");
        }
    }
}

