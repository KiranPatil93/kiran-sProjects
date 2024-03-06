package PageObjects;

import Utility.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {




    @FindBy(xpath = "//div[normalize-space()='Home']")
    WebElement validateHome;
    public HomePage(){

        PageFactory.initElements(DriverFactory.driver, this);
    }
    public void ValidateHomePage()
    {
        String TxtHome = validateHome.getText();
        System.out.println(TxtHome);
        Assert.assertEquals(TxtHome,"HOME");

    }


































































}
