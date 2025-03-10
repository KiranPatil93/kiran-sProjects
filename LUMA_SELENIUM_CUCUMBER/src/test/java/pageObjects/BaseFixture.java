package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseFixture {
    public static WebDriver driver;
    public void init_Driver(String browser){
        if(browser.equals("CHROME")){
            driver = new ChromeDriver();
        }else if(browser.equals("FIREFOX")){
            driver = new FirefoxDriver();
        }else{
            driver = new EdgeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
    }
    public void openUrl(String url){
        driver.get(url);

    }
}
