package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Bootstrap {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
       driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        //driver.findElement(By.xpath("//a[text()='Support']")).click();
           List<WebElement> options = driver.findElements(By.xpath("//a[@role='menuitem']"));

           for(int i=0; i<options.size(); i++){
               String textOption = options.get(i).getText();
               System.out.println(textOption);
               if(textOption.equals("Change Password")){
                   options.get(i).click();
                   break;
               }
           }



















    }
}
