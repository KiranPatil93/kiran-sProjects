package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement selectDropdpwn = driver.findElement(By.id("country"));
        Select select = new Select(selectDropdpwn);
        select.selectByValue("canada");
        select.selectByVisibleText("United Kingdom");
        select.selectByIndex(3);
        //capture options from the dropdown
        List<WebElement> options = select.getOptions();
        System.out.println(options.size());
        //printing the options
        for(int i =0; i<options.size(); i++){
            String option = options.get(i).getText();
            System.out.println(option);

        }
    }
}
