package com.qa.test;

import com.qa.page.LoginPage;
import com.qa.utility.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginTest extends BasePage {
    public static LoginPage loginPage;


//    LoginTest(){
//        super();
//
//    }

public void loginTest(){
        loginPage = new LoginPage();
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLogin();
}
}
