package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CreateNewAccountPage extends BaseFixture {
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement fName;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lName;
    @FindBy(xpath = "//input[@id='email_address']")
    WebElement eAddress;
    @FindBy(xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    WebElement confirmPass;
    @FindBy(xpath = "//span[contains(text(),'Create New Customer Account')]")
    WebElement createAccountPage;
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)' and contains(text(), 'Thank you for registering')]")
    WebElement successMessage;
    @FindBy(xpath = "//a[text()='My Orders']")
    WebElement order;

    public CreateNewAccountPage() {

        PageFactory.initElements(driver, this);
    }

    public void homePageValidation(String home) {
        WebElement homeText = driver.findElement(By.xpath("//span[contains(text(),'" + home + "')]"));
        String homeGetText = homeText.getText();
        if (homeGetText.equals(home)) {
            System.out.println("User is on home page");
        } else {
            Assert.fail("User is not on home page");
        }
    }

    public void click_CreateNewAccount(String link) {
        List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'" + link + "')]"));
        if (links.size() > 0) {
            links.get(0).click();
        } else {
            Assert.fail(link + "is not visible");
        }
    }
public void validation_CreateNewAccountPage(){
if(createAccountPage.isDisplayed()){
    System.out.println("user is on Create account page");
}else{
    Assert.fail("user is not on Create account page");
}
}
    public void enterFirstName(String firstName) {
        if (fName.isDisplayed()) {
            fName.sendKeys(firstName);
        } else {
            Assert.fail("Unable to enter first name");
        }
    }

    public void enterLastName(String lastName) {
        if (lName.isDisplayed()) {
            lName.sendKeys(lastName);
        } else {
            Assert.fail("Unable to enter last name");
        }
    }
    //pass
    public void enterEmail(String email) {
        if (eAddress.isDisplayed()) {
            eAddress.sendKeys(email);
        } else {
            Assert.fail("Unable to enter email");
        }
    }
    public void enterPassword(String password) {
        if (pass.isDisplayed()) {
            pass.sendKeys(password);
        } else {
            Assert.fail("Unable to enter password");
        }
    }

    public void enterConfirmPassword(String confirmPassword) {
        if (confirmPass.isDisplayed()) {
            confirmPass.sendKeys(confirmPassword);
        } else {
            Assert.fail("Unable to enter confirm password");
        }
    }
    public void click_button(String buttonName){
        WebElement button = driver.findElement(By.xpath("//button[@title='"+buttonName+"']"));
        if(button.isDisplayed()){
            button.click();
        }else{
            Assert.fail(buttonName+ "is not visible");
        }
    }
    public void validation_SuccessAccount(){
      String message =   successMessage.getText();
if(order.isDisplayed()){
    System.out.println("successfully created account");
}else{
    Assert.fail("Account not been created");
}
    }

}
