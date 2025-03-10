package package2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenshot {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourceFile =  ts.getScreenshotAs(OutputType.FILE); //return file type of object
//     //   File targetFile = new File("C:\\Users\\KiranPatil\\IdeaProjects\\com.SeleniumTutoarial\\Screenshot\\fullpage.png");
//       // File targetFile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
//        //copy source file into target location
//      //  sourceFile.renameTo(targetFile);
//
////capture the screenshot of specific section of the page
//        WebElement feature_Section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//        File Sourcefile2 = feature_Section.getScreenshotAs(OutputType.FILE);
//        File targetFile2 = new File(System.getProperty("user.dir")+"\\Screenshot\\featureProduct.png");
//        Sourcefile2.renameTo(targetFile2);
//       // driver.quit();
//
////capture of webElement screenshot
//        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//        File Sourcefile3 = logo.getScreenshotAs(OutputType.FILE);
//        File targetFile3 = new File(System.getProperty("user.dir")+"\\Screenshot\\logo.png");
//        Sourcefile3.renameTo(targetFile3);
    }
}
