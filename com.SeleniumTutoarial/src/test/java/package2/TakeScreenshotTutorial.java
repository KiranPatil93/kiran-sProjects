package package2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenshotTutorial {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        TakesScreenshot ts = (TakesScreenshot)driver;//optional
     //   1. Take full page screenshot
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
        sourceFile.renameTo(targetFile);//copy
        //specific section screenshot
        WebElement featureProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File sourcefile1 =featureProduct.getScreenshotAs(OutputType.FILE);
        File targetFile1 = new File(System.getProperty("user.dir")+"\\Screenshot\\feature.png");
        sourcefile1.renameTo(targetFile1);
        //webElement
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourcefile2 =logo.getScreenshotAs(OutputType.FILE);
        File targetFile2 = new File(System.getProperty("user.dir")+"\\Screenshot\\image.png");
        sourcefile2.renameTo(targetFile2);
    }
}
