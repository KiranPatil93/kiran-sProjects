package Utility;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

import static org.openqa.selenium.remote.DesiredCapabilities.*;

public class DriverFactory {
    public static WebDriver driver;


    /**
     * This method is used to initialize the thradlocal driver on the basis of given
     * browser
     *
     * @return this will return tldriver.
     */



    public static void init_driver() {
        String browser = String.valueOf(FileReaderManager.getInstance().getConfigReader().getBrowser());
        System.out.println("browser value is: " + browser);
        if (browser=="CHROME") {
        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
      /*  if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
           tlDriver.set(new ChromeDriver());
           // System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
           // driver = new ChromeDriver();
        }else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equals("safari")) {
            tlDriver.set(new SafariDriver());
        } else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
*/
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));


    }
    public void openUrl(){
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
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
