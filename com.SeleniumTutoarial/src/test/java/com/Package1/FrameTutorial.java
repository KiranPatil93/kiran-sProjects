package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameTutorial {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.name("mytext1")).sendKeys("xyz");
        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("abc");
        driver.switchTo().defaultContent();

        //Frame 3
        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("abc");
        //inner iframe which is part of frame3 - form filling demmo page
        driver.switchTo().frame(0);


    }
}
