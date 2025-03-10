package DataDriven;

import Utlity.ExcelUtil1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class TestDriven {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        String filepath = System.getProperty("user.dir")+"//TestData//automation.xlsx";
        int rows = ExcelUtil1.getRowCount(filepath,"Sheet1");
        System.out.println(rows);
 for(int r=1; r<=rows;r++){
       String name =  ExcelUtil1.getCellData(filepath,"Sheet1",r,0);
       String mail = ExcelUtil1.getCellData(filepath,"Sheet1",r,1);
       String phone = ExcelUtil1.getCellData(filepath,"Sheet1",r,2);
       String address = ExcelUtil1.getCellData(filepath,"Sheet1",r,3);
       String country = ExcelUtil1.getCellData(filepath,"Sheet1",r,4);
       String date = ExcelUtil1.getCellData(filepath,"Sheet1",r,5);

       driver.findElement(By.id("name")).sendKeys(name);
     driver.findElement(By.id("email")).sendKeys(mail);
    driver.findElement(By.id("phone")).sendKeys(phone);
    driver.findElement(By.id("textarea")).sendKeys(address);
     WebElement countryDrop = driver.findElement(By.id("country"));
     Select se = new Select(countryDrop);
     se.selectByVisibleText(country);
    driver.findElement(By.id("datepicker")).sendKeys(date);
   //driver.switchTo().frame(0);
//    WebElement job = driver.findElement(By.id("RESULT_RadioButton-3"));
//    Select select = new Select(job);
//     select.selectByIndex(r);
    ExcelUtil1.fillGreenColor(filepath,"Sheet1",r,5);

}
driver.quit();
    }
}
