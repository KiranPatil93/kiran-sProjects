package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Calender2 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.switchTo().frame(0);
        WebElement calender = driver.findElement(By.xpath("//span[@class='icon_calendar']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", calender);
        calender.click();
        String year = "2025";
        String month= "May";
        String date = "17";
            WebElement yearSelection = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
            Select select = new Select(yearSelection);
            select.selectByVisibleText(year);

    }
}
