package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SliderDemo {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
       // System.out.println("Location of minimum slider before moving " + minSlider.getLocation());
        Actions act = new Actions(driver);
//        act.dragAndDropBy(minSlider,100,249).build().perform();
//        System.out.println("Location of minimum slider after moving " + minSlider.getLocation());

        WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("Location of maximum slider before moving " + maxSlider.getLocation()); //(510, 249)
        act.dragAndDropBy(maxSlider,-200,249).build().perform();
        System.out.println("Location of maximum slider after moving " + maxSlider.getLocation());



    }
}
