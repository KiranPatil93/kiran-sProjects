package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='comboTree913038ArrowBtn']")).click();
        driver.findElement(By.xpath("//div[@id='comboTree913038DropDownContainer']//span[@class='comboTreeItemTitle'][normalize-space()='choice 2 1']")).click();


    //select multiple options
//       List<WebElement> options =
//               //Enhancing for loop
//                for(WebElement op:options){
//                    String optionText = op.getText();
//                    if(optionText.equals("option1")||optionText.equals("op2")||optionText.equals("opt3")){
//                        op.click();
//                    }
//                }


    }
}
