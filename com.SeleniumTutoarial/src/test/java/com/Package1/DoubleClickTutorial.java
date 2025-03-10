package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickTutorial {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement filed1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement filed2 = driver.findElement(By.xpath("//input[@id='field2']"));
        filed1.clear();
        filed1.sendKeys("Software Testing");
        WebElement copyTextBtn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
        Actions act = new Actions(driver);
        act.doubleClick(copyTextBtn).build().perform();
        WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
                act.dragAndDrop(dragElement,dropElement).build().perform();

    }
}
