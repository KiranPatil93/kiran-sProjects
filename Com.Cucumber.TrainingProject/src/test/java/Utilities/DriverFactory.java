package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    /**
     * This method is used to initialize the thradlocal driver on the basis of given
     * browser
     *
     * @return this will return driver.
     */
    public static WebDriver driver;
    public static void init_Driver(){
        String browser = ConfigFileReader.getBrowser();
        if(browser.equals("chrome")){
            driver = new ChromeDriver();

        }else if(browser.equals("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equals("Edge")){
            driver = new EdgeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFileReader.getImplicitelyWait()));
    }
    public void openUrl(){
        driver.get(ConfigFileReader.getApplicationUrl());
        driver.getTitle();
    }
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
    /**
     * this is used to get the driver with ThreadLocal
     *
     * @return
     */
}
