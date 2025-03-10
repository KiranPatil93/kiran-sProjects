package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClassTutorial {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
        Actions act = new Actions(driver);
//        WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
//        WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
//        Thread.sleep(1000);
//        act.moveToElement(desktop).moveToElement(mac).click().perform();
//        Thread.sleep(1000);



    }
}
