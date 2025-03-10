package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
public class simpleScript {
public static  WebDriver driver= new ChromeDriver();
@BeforeSuite
void testBeforeSuite(){

    System.out.println("Script has been started");
}
@BeforeMethod
    void openTheBrowser(){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority=1,groups={"Sanity"})
    void verifyTitle(){
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);
        SoftAssert se = new SoftAssert();
        if(pageTitle.equals("Orangehrm")){
            System.out.println("orange HRM application is opened");
          //  Assert.assertTrue(true);

        }else{
           // System.out.println("Another application is opened");
           // Assert.assertTrue(false);
          //Assert.fail("Title is not matching");//stop
            //se.fail("Title is not matching");
            se.assertAll("Title is not matching");

            System.out.println("checking Execution");
            System.out.println("checking Assert");

        }

       // Assert.assertEquals(pageTitle,"Orangehrm","Title is not matching");

    }
    @Test(priority=2,groups={"Sanity"})
    void login(){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }
   @AfterTest
  void closeBrowser(){
        driver.close();
   }
}
