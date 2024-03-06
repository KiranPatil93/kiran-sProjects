package PageObjects;

import Utility.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public  static WebDriverManager manager = new WebDriverManager();
    WebDriver driver;
    public HomePage(){
        //driver = manager.createLocalDriver();
        //driver = manager.driver;
        PageFactory.initElements(manager.driver, this);
    }
    @FindBy(xpath = "//div[normalize-space()='Home']")
    WebElement validateHome;
    public void ValidateHomePage()
    {
        String TxtHome = validateHome.getText();
        System.out.println(TxtHome);
        Assert.assertEquals(TxtHome,"HOME");

    }


































































}
