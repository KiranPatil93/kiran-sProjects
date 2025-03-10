package com.Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
      WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
         button1.click();
       Alert alrt = driver.switchTo().alert();
      String alertText = alrt.getText(); // retrive inner text in webelement
        System.out.println(alertText);
        alrt.accept(); //click on ok button
       WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
       button2.click();
       alrt.dismiss(); //reject the popup
         Thread.sleep(2000);
        WebElement button3 = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
      button3.click();
        alrt.sendKeys("xyz");
      alrt.accept();

    }
}
