package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement country  = driver.findElement(By.cssSelector("#country"));
        Select se = new Select(country);
     //   se.selectByValue("france");
        //se.selectByVisibleText("Japan");
       // se.selectByIndex(2);

        List<WebElement> allOptions = se.getOptions(); // all option in dropdown

        for(int i=0;i<allOptions.size();i++ ){
           String optionText = allOptions.get(i).getText();
            System.out.println(optionText);
        }




    }
}
