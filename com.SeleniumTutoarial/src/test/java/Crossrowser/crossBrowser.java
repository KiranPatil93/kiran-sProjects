package Crossrowser;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {
    WebDriver driver;
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    ChromeOptions chromeOptions = new ChromeOptions();
    EdgeOptions edgeOptions = new EdgeOptions();

@Parameters("browser")
    @BeforeTest
    public void initilize(String browser){
if(browser.equalsIgnoreCase("firefox")){
   driver = new FirefoxDriver();
    System.out.println("FireFox being launched");
}else if(browser.equalsIgnoreCase("chrome")){driver = new ChromeDriver();
    System.out.println("Chrome being launched");
}else if(browser.equalsIgnoreCase("edge")){
    driver = new EdgeDriver();
    System.out.println("Edge browser being launched");
//}else if(browser.equalsIgnoreCase("safari")){
//  driver = new SafariDriver();
//    System.out.println("Edge browser being launched");
}
    }
@Test
    public void orangeHRMLogin(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
@AfterTest
public void afterTest(){
       driver.quit();
}




}
