package PageObjects;

import Utility.FileReaderManager;
import Utility.WaitUtil;
import Utility.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.WebDriverManager.driver;

public class LoginPage {

//public  static WebDriverManager manager = new WebDriverManager();

    public LoginPage(){
       // driver = manager.driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "un")
     WebElement txtusername;

    @FindBy(name = "pw")
    WebElement txtpass;

    @FindBy(css = "input[value='Sign In']")
    WebElement BtnSignIn;

    @FindBy(css = "#errorMsg")
    WebElement validateMsg;

public void openUrl(){
    WebDriverManager.getUrl();
}

    public void enterUserName(){
    String uname = FileReaderManager.getInstance().getConfigReader().getLoginUsername();
        txtusername.sendKeys(uname);
    }

    public void enterPassword(){
        txtpass.sendKeys(FileReaderManager.getInstance().getConfigReader().getLoginPassword());
    }

    public void clickOnSignInBtn(){
        WaitUtil.waitTill(2);
        Assert.assertTrue("sign In button is displayed",BtnSignIn.isDisplayed());
        BtnSignIn.click();
    }
 public void validationErrorMessage(){
     WaitUtil.waitTill(3);
     WaitUtil.waitForVisibilityOfElement(driver,10,validateMsg);
     String validationMessage = validateMsg.getText();
     System.out.println("Validation message is "+validationMessage );
     Assert.assertEquals(validationMessage,"The username/password entered is invalid. Usernames and passwords are case sensitive.");

 }






























}
