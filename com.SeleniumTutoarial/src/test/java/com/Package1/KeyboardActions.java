package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://appian-test.skolverket.se/suite/sites/case-management/page/HomePage");
        WebElement textBox1 = driver.findElement(By.id("inputText1"));
        textBox1.sendKeys("Welcome in Selenium");
        Actions act = new Actions(driver);

        //ctrl+A select texr
          act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //ctrl + C  copy text
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //Tab select next text area
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //ctrl + v  paste text
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

    }
}
