package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial_CSSSelector {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver(); //open the browser
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //tag id -> tagname#id
       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");


        //tag classname    -> tagname.classname  - input.search-box-text ui-autocomplete-input

     //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mobile");

     //tag attribute  - >   tagname[attribute='value']

        //driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("laptop");

// tag class attribute

        driver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("T-shirts");
















    }




















}
