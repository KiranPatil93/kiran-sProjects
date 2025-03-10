package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        Thread.sleep(5000);
//       boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//
//        System.out.println(logo);
     driver.findElement(By.linkText("Register")).click();
      Thread.sleep(3000);
//        boolean state = driver.findElement(By.xpath("//input[@id ='FirstName']")).isEnabled();
//        System.out.println(state);

        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before selection...");

        System.out.println(male.isSelected()); //false
        System.out.println(female.isSelected()); //false

        System.out.println("After selection of male");
        male.click();
        Thread.sleep(1000);
        System.out.println(male.isDisplayed()); //true
        System.out.println(female.isSelected()); //false

        System.out.println("After selection of Female");

        female.click();
        Thread.sleep(1000);
        System.out.println(male.isSelected()); //false
        System.out.println(female.isSelected()); //true

        System.out.println("For newsLetter checkbox");
       WebElement newsLetter =  driver.findElement(By.xpath("//input[@id ='Newsletter']"));
        System.out.println(newsLetter.isDisplayed());



    }
}
