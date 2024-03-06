package PageObjects;

import Utility.DriverFactory;
import Utility.FileReaderManager;
import Utility.WaitUtil;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.DriverFactory.driver;

public class LoginPage {





    @FindBy(name = "un")
     WebElement txtusername;

    @FindBy(name = "pw")
    WebElement txtpass;

    @FindBy(css = "input[value='Sign In']")
    WebElement BtnSignIn;

    @FindBy(css = "#errorMsg")
    WebElement validateMsg;
    @FindBy(xpath = "//a[@aria-label='Open user options menu']")
    WebElement userProfile;
    @FindBy(xpath = "//*[text()='Sign Out']")
    WebElement btnSignOut;
    public LoginPage(){

        PageFactory.initElements(DriverFactory.driver,this);
    }

    public void enterUserName(){
    String uname = FileReaderManager.getInstance().getConfigReader().getLoginUsername();
        txtusername.sendKeys(uname);
    }
public void enterWrongUsername(String wrongUsername){
        WaitUtil.waitTill(2);
    txtusername.sendKeys(wrongUsername);
}
    public void enterPassword(){
        WaitUtil.waitTill(2);
        txtpass.sendKeys(FileReaderManager.getInstance().getConfigReader().getLoginPassword());
    }
public void enterWrongPassword(String wrongPassword){
    WaitUtil.waitTill(2);
    txtpass.sendKeys(wrongPassword);

}
    public void clickOnSignInBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("sign In button is not displayed",BtnSignIn.isDisplayed());
        BtnSignIn.click();
    }
 public void validationErrorMessage(){
     WaitUtil.waitTill(3);
     String validationMessage = validateMsg.getText();
     System.out.println("Validation message is "+validationMessage );
     Assert.assertEquals(validationMessage,"The username/password entered is invalid. Usernames and passwords are case sensitive.");

 }
//userProfile
    public void clickOnUserProfile(){
        WaitUtil.waitTill(3);
        Assert.assertTrue("User profile link is not visible",userProfile.isDisplayed());
        userProfile.click();
    }
//btnSignOut
    public void clickOnSignOutBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("Sign Out button is not visible",btnSignOut.isDisplayed());
        btnSignOut.click();
    }
public void validateLoginPage(){
    WaitUtil.waitTill(5);
    Assert.assertTrue("sign In button is not displayed",BtnSignIn.isDisplayed());
}



























}
