package com.Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {
    public static void main(String[] args){
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.opencart.com/");

//       String title = driver.getTitle();
//        System.out.println(title);
//
//        String url = driver.getCurrentUrl();
//        System.out.println(url);

     //   System.out.println(driver.getPageSource());
        String id = driver.getWindowHandle();
        System.out.println("windowIs is " + id); //5414F5598DD48C2082A936A010A065A9






















    }

























}
