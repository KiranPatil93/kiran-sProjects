package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial_Xpath {

    public static void main(String[] args) throws InterruptedException {
        //lunch or open the broser
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        //xpath with Single attribute
        //driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mobile");

//xpath with multiple attributes

       //driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Laptop");


        //Xpath with 'and' 'or'
       // driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("TV");

//driver.findElement(By.xpath("//input[@name='search' or @placeholder='search']")).sendKeys("Books");

//xpth with Inner text
       Thread.sleep(1000);
       // driver.findElement(By.xpath("//a[text()='Cameras']")).click();

 String value = driver.findElement(By.xpath("//a[text()='Phones & PDAs']")).getText();

        System.out.println(value);

boolean displyaingValue =  driver.findElement(By.xpath("//input[@name='search']")).isDisplayed();

        System.out.println(displyaingValue);









    }

















}
