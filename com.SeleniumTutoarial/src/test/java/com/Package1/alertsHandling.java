package com.Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandling {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(5000);
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert.dismiss();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert.sendKeys("kiran");
        alert.accept();
}



}