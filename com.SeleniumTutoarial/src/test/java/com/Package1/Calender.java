package com.Package1;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Calender {
    static void selectFutureDate(WebDriver driver, String month, String year){
        while(true){
            String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//a[@title='Next']")).click();
        }
    }
    static void selectPastDate(WebDriver driver,String month,String year){
        while(true){
            String currentMonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//a[@title='Prev']")).click();
        }
    }
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        WebElement dateInput = driver.findElement(By.xpath("//input[@id='datepicker']"));
       // dateInput.sendKeys("06/10/2024");
        String year = "2026";
        String month = "June";
        String date = "25";

        dateInput.click();
        selectFutureDate(driver,month,year);
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for(WebElement dt:allDates){
            String currentDate = dt.getText();
            if(currentDate.equals(date)){
                dt.click();
                break;
            }
        }





















    }
}
