package StepDefinition;

import Pages.LoginPage;
import Pages.NewAccountPage;
import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverFactory {
    public static LoginPage loginPage;
    public static NewAccountPage accountPage;
    @Before
    public void setup(){
        init_Driver();
        loginPage = new LoginPage();
        accountPage = new NewAccountPage();
    }
    @After
    public void tearDown(){

        closeBrowser();
    }

}

