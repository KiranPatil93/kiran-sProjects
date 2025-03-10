package com.Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticWebTable {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //find total rows
            List<WebElement> rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
            int rowCount = rows.size();
        System.out.println(rowCount);

          List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
          int cols = columns.size();
           System.out.println(cols);
           for(int i=0; i<cols; i++){
               String headers = columns.get(i).getText();
               System.out.println(headers +"\t");
           }

         WebElement selenium = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]"));
            String txtcolumn = selenium.getText();
        System.out.println(txtcolumn);


        for(int r =2; r<rowCount; r++){
            for(int c=1; c<cols+1; c++){
          WebElement cell=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]"));
                String txt_Cell = cell.getText();
                System.out.println(txt_Cell + "\t");
            }
            System.out.println();
        }
for(int r=2; r<rowCount; r++){
   WebElement authers = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]"));
   String auther = authers.getText();
    if(auther.equalsIgnoreCase("Mukesh")){
        WebElement bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]"));
        String book = bookname.getText();
        System.out.println("Mukesh written bookname " + book);
    }
}

int total = 0;
for(int r= 2; r<rowCount; r++){
    WebElement price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]"));
    String textPrice = price.getText();
    //System.out.println(textPrice);
    total = total + Integer.parseInt(textPrice);
}
        System.out.println("Total Price is " + total );






//print total price
//        int total =0;
//        for(int r=2;r<rowCount;r++){
//            WebElement cell=  driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]"));
//            String price = cell.getText();
//            System.out.println(price);
//             total = total + Integer.parseInt(price);
//            System.out.println(total);
//        }












    }
}
