package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;

public class Parametrization {
    WebDriver driver;
    @BeforeClass
    void setup(){
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }@Test(dataProvider ="dp")
    void testLogin(String email,String password) throws InterruptedException {
     driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
     driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
     driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
     driver.findElement(By.xpath("//input[@value='Login']")).click();
     Thread.sleep(2000);
     boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
     if(status==true){
         driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
         Assert.assertTrue(true);
     }else{
         Assert.fail();
     }
    }
    @AfterClass
    void tearDown(){
     driver.quit();
    }
    @DataProvider(name="dp")
 Object[][]loginData(){
       Object data[][] ={
               {"things@gmail.com","things@123"},
               {"thoughts@mail.com","thoughts@123"}
       };
         return data;
    }
}
