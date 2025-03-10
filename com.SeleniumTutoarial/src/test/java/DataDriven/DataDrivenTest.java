package DataDriven;

import Utlity.ExcelUtil1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class DataDrivenTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        String filepath = System.getProperty("user.dir")+"//TestData//automation.xlsx";
        int rows =ExcelUtil1.getRowCount(filepath,"sheet1");
   for(int i=1;i<=rows;i++){
       String name = ExcelUtil1.getCellData(filepath,"sheet1",i,0);
       String email = ExcelUtil1.getCellData(filepath,"sheet1",i,1);
       String phone = ExcelUtil1.getCellData(filepath,"sheet1",i,2);
       String address = ExcelUtil1.getCellData(filepath,"sheet1",i,3);
       String country = ExcelUtil1.getCellData(filepath,"sheet1",i,4);
       String date = ExcelUtil1.getCellData(filepath,"sheet1",i,5);
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
       driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
       driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys(address);
       WebElement countrydrop = driver.findElement(By.xpath("//select[@id='country']"));
       Select select = new Select(countrydrop);
       select.selectByVisibleText(country);
       driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(date);
       driver.switchTo().frame(0);
       WebElement job = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
       Select se = new Select(job);
      List<WebElement> options =se.getOptions();
      for(WebElement opt:options){
          String jobtext = opt.getText();
          ExcelUtil1.setCellData(filepath,"sheet1",i,6,jobtext);
          ExcelUtil1.fillGreenColor(filepath,"sheet1",i,6);
      }
      driver.switchTo().defaultContent();

   }
        driver.quit();
    }
}
