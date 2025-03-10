package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iFrameTutorial {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      WebElement frame1 =driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
       driver.switchTo().frame(frame1);
        driver.findElement(By.name("mytext1")).sendKeys("Welcome");
        driver.switchTo().defaultContent(); //return on original page

        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("Java");
      WebElement iframe = driver.findElement(By.cssSelector("iframe[src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
      driver.switchTo().frame(iframe);
      driver.findElement(By.cssSelector("div[id='i11'] div[class='AB7Lab Id5V1']")).click();
    driver.switchTo().defaultContent();
    }
}
