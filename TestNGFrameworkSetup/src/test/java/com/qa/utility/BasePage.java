package com.qa.utility;

import com.qa.base.DriverManagerType;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.qa.base.DriverManagerType.driver;

public class BasePage {
    public static Properties prop;

   public BasePage(){
       try{
           prop = new Properties();
           FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/config/config.properties");
           prop.load(ip);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

   //  WebDriver driver;
   @BeforeClass
   @Parameters("browser")
   //@BeforeTest()
   public static void setup(String browser){
       driver = DriverManagerType.getDriver(browser);
       driver.get(prop.getProperty("appurl"));
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

   }
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
