package com.Package1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class JavascriptClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        //replacement sendkeys
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(1000);
        js.executeScript("document.getElementById('name').value='Welcome'");
        Thread.sleep(1000);
        js.executeScript("document.getElementById('email').value='Java'");
        Thread.sleep(1000);
        js.executeScript("document.getElementById('phone').value='546384683'");
        Thread.sleep(1000);
        //scroll page by using pixel
        js.executeScript("window.scrollBy(0,400)", "");
        js.executeScript("document.getElementById('textarea').value='Javascript Executor'");
        Thread.sleep(1000);
        WebElement maleRadio = driver.findElement(By.id("male"));
        //replacement for click()
        js.executeScript("arguments[0].click();",maleRadio);
        Thread.sleep(1000);
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
        for(WebElement checkbox :checkboxes){
            Thread.sleep(1000);
            js.executeScript("arguments[0].click();",checkbox);
        }
     //scrolling until specific webelement visible
      Thread.sleep(2000);
       WebElement paginationTable = driver.findElement(By.xpath("//h2[normalize-space()='Pagination Table']"));
        js.executeScript("arguments[0].scrollIntoView();", paginationTable);
        Thread.sleep(1000);
        //highlight the webelement
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", paginationTable, "color: yellow; border: 2px solid yellow;");
        //scroll to bottom
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        //scroll up the page
        js.executeScript("window.scrollBy(0,-2000)", "");

    }


}
