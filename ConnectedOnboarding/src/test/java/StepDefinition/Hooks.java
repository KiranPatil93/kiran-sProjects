package StepDefinition;

import PageObjects.*;
import Utility.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends DriverFactory {

    public static LoginPage loginPage;
    public static HomePage home;
    public static CustomerPage customer;
    public static OnboardingPage onboarding;
    public static TaskPage task;
    public static excelFilePage excel;

    @Before
    public void setup(){
        init_driver();
        loginPage = new LoginPage();
        home = new HomePage();
        customer = new CustomerPage();
        onboarding = new OnboardingPage();
        task = new TaskPage();
        excel = new excelFilePage();
    }
    @AfterStep
public void addScreenshot(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

}


@After
    public void tearDown(){
    closeBrowser();
    }

}
