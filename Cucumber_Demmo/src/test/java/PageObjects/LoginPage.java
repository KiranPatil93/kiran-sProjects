package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
    this.driver = driver;
        PageFactory.initElements(driver,this);
    }
 @FindBy(xpath="//input[@id='un']")
    WebElement username;

    @FindBy(xpath="//input[@id='pw']")
    WebElement pword;

    @FindBy(xpath="//input[@value='Sign In']")
    WebElement signinBtn;

    @FindBy(xpath="//label[contains(text(),'Search')]")
    WebElement searchfield;



    public void setUSerName(String uname){
        pword.sendKeys(uname);
        System.out.println(uname);
    }
    public void setPassword(String password){
        username.sendKeys(password);
        System.out.println(password);
    }
    public void SignInButton(){
        signinBtn.click();

    }
    public void VerifyPage(String search){
        String searchBtn= searchfield.getText();
       Assert.assertEquals(searchBtn,search);
       System.out.println("NAvigate on required page");
    }
}
