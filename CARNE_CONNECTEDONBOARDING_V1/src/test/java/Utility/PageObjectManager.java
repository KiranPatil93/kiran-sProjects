package Utility;

import PageObjects.CustomerPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {


    private LoginPage productsPage;



    public static LoginPage loginPage;
    public static HomePage home;
    public static CustomerPage customer;
    public static WebDriverManager driver= new WebDriverManager();

    public PageObjectManager(WebDriver driver) {

        WebDriverManager.driver =  driver;
    }


    public static LoginPage getLoginPage() {

      //return  (loginPage == null) ?
        return loginPage = new LoginPage();//: loginPage;

    }
    public static HomePage getHomePage() {

        return (home == null) ? home = new HomePage() : home;

    }
    public static CustomerPage getCustomerPage() {

      //  return (customer == null) ?
        return customer = new CustomerPage();//: customer;

    }
}
