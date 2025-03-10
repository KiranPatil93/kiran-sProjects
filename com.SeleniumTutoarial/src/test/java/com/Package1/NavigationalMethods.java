package com.Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// open the application in browser
      //  Thread.sleep(4000);
        driver.navigate().refresh(); //page reload
        Thread.sleep(7000);
        driver.navigate().back();// back in application
       Thread.sleep(5000);
       driver.navigate().forward();







    }


}
