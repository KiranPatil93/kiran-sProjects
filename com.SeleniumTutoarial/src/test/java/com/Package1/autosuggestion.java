package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class autosuggestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(1);
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        wait.until(ExpectedConditions.visibilityOfAllElements(options));
        System.out.println(options.size());
        for(int i=0;i<options.size();i++){
            Thread.sleep(1);
            String option = options.get(i).getText();
            System.out.println(option);
//            if(option.equals("selenium webdriver")){
//                options.get(i).click();
//            }
        }
    }

}
