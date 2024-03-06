import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass {
    public static WebDriver driver;
    @BeforeMethod
    public void InitilizationOfWebDriver(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
    }
    @Test()
    public void openUrl(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
    }
    @Test()
public void navigation() throws InterruptedException {
    String title = driver.getTitle();
    System.out.println(title);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().refresh();
}

}
