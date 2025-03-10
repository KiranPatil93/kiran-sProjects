package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class RadioButtons {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       // driver.findElement(By.xpath("//input[@value ='radio2']")).click();
        // select single checkbox
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();

        //select all checkboxes
      List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type='checkbox']"));
      for(int i=0; i<checkboxes.size(); i++){
          checkboxes.get(i).click();
      }

      //select first 2 checkboxes
        for(int i=0; i<checkboxes.size();i++){
            if(i<2){
                checkboxes.get(i).click();
            }
            break;
        }
        //select last 3 checkboxes
        for(int i=1; i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }
    }


}
