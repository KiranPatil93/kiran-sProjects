package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {

//1 open the browser - chrome

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");//open the application
        driver.manage().window().maximize();// maximize screen
        // validate title of the application
        String title = driver.getTitle();//actual result
        System.out.println(title);
        //validation
 if(title.equals("Your Store")){
     System.out.println("Test is pass");
 }else{
     System.out.println("Test is fail");
 }
//ID
      //  driver.findElement(By.id("header-cart")).click();

        driver.findElement(By.name("search")).sendKeys("Mobile");
    //driver.close();

  //    driver.quit();
      Thread.sleep(2000);
        driver.findElement(By.linkText("Tablets")).click();

       WebElement tablet =   driver.findElement(By.partialLinkText("Tab"));  // output - single webelement
        tablet.click();

         List<WebElement> links = driver.findElements(By.tagName("a"));  //output - Multiple webelements
              int totalLinks = links.size();
        System.out.println("totalLinks" +totalLinks);

        List<WebElement> classnames =  driver.findElements(By.className("nav-item"));








    }
}
