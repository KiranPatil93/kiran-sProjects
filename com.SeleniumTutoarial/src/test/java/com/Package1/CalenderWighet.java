package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalenderWighet {
    static void selectFutureDate(WebDriver driver, String month, String year){
        while(true){
            String  currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(currentMonth.equals(month)&&currentYear.equals(year) ){
                break;
            }
            driver.findElement(By.xpath("//span[text()='Next']")).click();

        }

    }
    static void selectPastDate(WebDriver driver, String month, String year){
        while(true){
            String  currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            if(currentMonth.equals(month)&&currentYear.equals(year) ){
                break;
            }
            driver.findElement(By.xpath("//span[text()='Prev']")).click();

        }

    }

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
      //  driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("23/04/2027");
WebElement calender = driver.findElement(By.xpath("//input[@id='datepicker']"));
String year = "2023";
String month = "March";
String date = "20";
        calender.click();
        //selectFutureDate(driver, month,year);
        selectPastDate(driver, month,year);
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
