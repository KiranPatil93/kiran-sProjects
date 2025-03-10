package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class newSwitch {
    public static void main(String[] args){
        //System.setProperties("//pathof the driver");//optional
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
       //driver.switchTo().newWindow(WindowType.TAB);//new tab
       driver.switchTo().newWindow(WindowType.WINDOW);//new window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
