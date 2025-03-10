package Pages;

import Utilities.ConfigFileReader;
import Utilities.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends DriverFactory {
@FindBy(xpath ="//input[@name='uid']")
WebElement userID;
@FindBy(xpath="//input[@name='password']")
WebElement pass;
@FindBy(xpath="//input[@name='btnLogin']")
WebElement loginBtn;

public LoginPage(){
    PageFactory.initElements(driver,this);
}

public void enterUserID(){
    userID.sendKeys(ConfigFileReader.getLoginUsername());
}
public void enterPassword(){
    pass.sendKeys(ConfigFileReader.getLoginPassword());
}
public void clickLoginBtn(){
    loginBtn.click();
}
}
