package com.qa.test;

import com.qa.page.LoginPage;
import com.qa.utility.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.qa.test.BaseTest.homePage;

public class HomeTest extends BaseTest {



//    @BeforeMethod
//    public void init(){
//        loginPage = new LoginPage();
//       // homePage = new HomePage();
//    }


    public void caseBtn() throws InterruptedException {
        homePage.OpenApplication();

    }
}
