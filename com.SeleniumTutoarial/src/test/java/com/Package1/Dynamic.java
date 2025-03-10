package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Dynamic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Admin']//parent::a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Nationalities']")).click();

        String totalPages = driver.findElement(By.xpath("//span[text()=' (194) Records Found']")).getText();
        System.out.println(totalPages);
        String pages = totalPages.substring( totalPages.indexOf("(")+1,totalPages.indexOf(")"));
        System.out.println(pages);
        int count = Integer.parseInt(pages);

        List<WebElement> pagination = driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']//li"));
       int pageCount = pagination.size();
       System.out.println(pageCount);
       for(int p=1; p<pageCount; p++){
            Thread.sleep(1000);
          if(p>1){
                WebElement page = driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//button[text()="+p+"]"));
               ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page);
               page.click();
               Thread.sleep(3000);

          }
           List<WebElement> rows = driver.findElements(By.xpath("//div[@role='table']//div[@role='row']//div[2]/div"));
           int rowCount = rows.size();
           System.out.println(rowCount);
           for(int r=0;r<rowCount; r++){
               String rowText = rows.get(r).getText();
               System.out.println(rowText);
               if(rowText.equals("Swedish")){
               WebElement checkbox =  driver.findElement(By.xpath("//input[@value="+r+"]"));
                   JavascriptExecutor executor = (JavascriptExecutor)driver;
                   executor.executeScript("arguments[0].click();", checkbox);
                 break;
               }
           }
       }

//     for(WebElement row : rows){
//         System.out.println( row.getText());
//     }




    }
}
