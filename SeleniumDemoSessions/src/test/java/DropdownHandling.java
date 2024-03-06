import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropdownHandling {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[1]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//nav[@class='oxd-topbar-body-nav']//li[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("")).sendKeys("Allocation");
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='menu']//a"));
        for(WebElement element:options){
            String txtoption = element.getText();
            System.out.println(txtoption);
            if(txtoption.equals("Employment Status")){
                element.click();
            }
        }





































    }
}
