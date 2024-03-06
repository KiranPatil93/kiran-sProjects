import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class dropdown {

  public static void main(String[] args) throws InterruptedException {

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      Thread.sleep(4000);
      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//aside[@class='oxd-sidepanel']//li[1]//a")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//div[@class='oxd-topbar-body']//li[1]")).click();
      Thread.sleep(1000);
      List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li"));
      int size = currencyList.size();
    try {
        for (WebElement element : currencyList) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(element));
            String txtOption = element.getText();
            System.out.println(txtOption);
            if (txtOption.equals("Employment Status")) {
                element.click();

            }

        }
    }catch(org.openqa.selenium.StaleElementReferenceException ex){
        for (WebElement element : currencyList) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(element));
            String txtOption = element.getText();
            System.out.println(txtOption);
            if (txtOption.equals("USD")) {
                element.click();

            }

        }
    }





















  }



}
