package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicWebTableWithPagination {
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
        driver.findElement(By.xpath("//a[text()='Nationalities']")).click();

       List<WebElement> pagination = driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']//li"));
       int pageCount = pagination.size();
        System.out.println("Total pages are " +pageCount);
        for(int p=0; p<pageCount; p++){
            if(p>1){
             WebElement page =  driver.findElement(By.xpath("//ul[@class='oxd-pagination__ul']//li//button[text()='"+p+"']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", page);
                Thread.sleep(1000);
                page.click();
            }
            List<WebElement> natinalities = driver.findElements(By.xpath("//div[@role='table']//div[@role='row']//div[2]/div"));
          //nested for loop
          List<WebElement> totalrows = driver.findElements(By.xpath("//div[@role='table']//div[@role='row']"));
int rows = totalrows.size();
for(int r=1;r<rows; r++){
    String country = natinalities.get(r).getText();
    System.out.println(country);
    if(country.equals("Swedish")){
       WebElement checkbox = driver.findElement(By.xpath("//input[@value="+r+"]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", checkbox);
        break;
    }
}
        }














    }
}
