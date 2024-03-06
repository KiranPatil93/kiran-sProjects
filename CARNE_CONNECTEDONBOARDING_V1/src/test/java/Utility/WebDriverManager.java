package Utility;

import enums.DriverType;
import enums.EnvironmentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static enums.DriverType.CHROME;
import static enums.EnvironmentType.REMOTE;
import static enums.EnvironmentType.TEST;

public  class WebDriverManager {
    public static WebDriver driver;
    public static DriverType driverType;
    public static EnvironmentType environmentType;
    public static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    public WebDriverManager() {
        driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
      //  environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();

    }

    public static WebDriver createLocalDriver() {
        if (driverType==CHROME) {
            System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
            driver = new ChromeDriver();

        }

        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        return driver;
    }
    public static WebDriver createRemoteDriver() {
        throw new RuntimeException("RemoteWebDriver is not yet implemented");
    }

    public static WebDriver createDriver() {
        if (environmentType.equals(TEST)) {
            driver = createLocalDriver();
        } else if (environmentType.equals(REMOTE)) {
            driver = createRemoteDriver();
        }
        return driver;
    }
    public static WebDriver getDriver() {
        //if(driver == null) driver = createDriver();
        if(driver == null) driver = createLocalDriver();
        return driver;
    }

public static void getUrl(){
    driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    driver.getTitle();
}


    public static void closeDriver() {
        driver.close();
        driver.quit();
    }
}
