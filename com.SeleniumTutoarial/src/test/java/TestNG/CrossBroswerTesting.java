package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBroswerTesting {
    WebDriver driver;
    @BeforeClass
    @Parameters("browser")
    void crossBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();

        }else if(browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
    }
@Test
    void login(){
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("things@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("things@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

}
