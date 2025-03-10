package com.qa.page;

import com.qa.utility.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.base.DriverManagerType.driver;

public class LoginPage extends BasePage {
    @FindBy(xpath="//input[@id='un']")
    WebElement uname;
    @FindBy(xpath="//input[@id='pw']")
    WebElement pasname;
    @FindBy(xpath="//input[@value='Sign In']")
    WebElement btnLogin;
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
   public void enterUsername(){
       String user = prop.getProperty("username");
       uname.sendKeys(user);
   }
   public void enterPassword(){
       String pass = prop.getProperty("password");
       pasname.sendKeys(pass);
   }
   public void clickOnLogin(){
       btnLogin.click();
   }
}
