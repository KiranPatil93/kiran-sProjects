package com.StepDefinition;

import PageObjects.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
WebDriver driver;
public LoginPage login;
    @io.cucumber.java.en.Given("Navigate on Zoo-Animal-Managment Application login page using url {string}")
    public void navigateOnZooAnimalManagmentApplicationLoginPageUsingUrl(String url) {
        System.setProperty("webdriver.chrom.driver",System.getProperty("user")+"//Drivers/chromedriver.exe");
        driver = new ChromeDriver();
     login = new LoginPage(driver);
     driver.get(url);
     String Title = driver.getTitle();
     if(Title.equals(url)){
         System.out.println("Url is matching with Actual Url");
     }else{
         Assert.fail("Url is not matching with actual url");
     }
    }

    @io.cucumber.java.en.When("user fills {string} with {string}")
    public void userFillsWith(String uname) {
   login.setUSerName(uname);
    }

    @io.cucumber.java.en.And("Password filed with {string}")
    public void passwordFiledWith(String password) {
        login.setPassword(password);
    }

    @io.cucumber.java.en.And("user click on login button")
    public void userClickOnLoginButton() {
        login.SignInButton();
    }

    @io.cucumber.java.en.Then("User navigate on Zoo Details page")
    public void userNavigateOnZooDetailsPage(String search) {
    login.VerifyPage(search);

    }

    //@io.cucumber.java.en.Then("error message displayed with wrong password")
    //public void errorMessageDisplayedWithWrongPassword() {
   // }
}
