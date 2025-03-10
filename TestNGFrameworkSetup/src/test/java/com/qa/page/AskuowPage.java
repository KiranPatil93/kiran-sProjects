package com.qa.page;

import com.qa.utility.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.qa.base.DriverManagerType.driver;

public class AskuowPage extends BasePage {
    @FindBy(xpath="//input[@id='un']")
    WebElement uname;
    @FindBy(xpath="//input[@id='pw']")
    WebElement pasname;
    @FindBy(xpath="//input[@value='Sign In']")
    WebElement btnLogin;
    public AskuowPage(){
        PageFactory.initElements(driver, this);
    }

    public void loginAsASKUOW(String email,String pass) throws InterruptedException {
        uname.sendKeys(email);
        Thread.sleep(1000);
        pasname.sendKeys(pass);
        Thread.sleep(1000);
        btnLogin.click();
    }

}

