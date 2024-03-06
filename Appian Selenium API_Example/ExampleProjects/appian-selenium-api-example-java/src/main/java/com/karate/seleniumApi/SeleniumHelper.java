package com.karate.seleniumApi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHelper {
    public static WebDriver driver;


    public SeleniumHelper(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    /*public static void setup() {
     //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\KiranPatil\\IdeaProjects\\Appian Selenium API_Example\\ExampleProjects\\appian-selenium-api-example-java\\lib\\Driver\\chromedriver.exe");
      //  driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
*/
    public void navigateTo(String url) {
        driver.get(url);
    }

    public  String getTitle() {
        return driver.getTitle();
    }

    public  void tearDown() {
        driver.quit();
    }
}
