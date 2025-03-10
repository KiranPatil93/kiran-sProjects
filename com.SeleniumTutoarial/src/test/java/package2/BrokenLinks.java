package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        ChromeOptions option = new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
       List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total link present on page : " + links.size());
        int noOfBrokenLinks = 0;
        for(WebElement linkname:links) {
            String hrefAttValue = linkname.getAttribute("href");
            if (hrefAttValue == null || hrefAttValue.isEmpty()) {
                System.out.println("href attribute value in null or empty. So not possible to check");
                continue;
            }
            //hit the url into the server
            try {
                URL linkURL = new URL(hrefAttValue); //converted string value into URL format
                HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();//open connection to the server
                con.connect();//connect to the server and send request to the server
                if (con.getResponseCode() >= 400) {
                    System.out.println(hrefAttValue + "=====>Link is broken link");
                    noOfBrokenLinks ++;
                } else {
                    System.out.println("Not a broken link");
                }
            }catch(Exception e){

            }

        }
        System.out.println("No of broken links " +noOfBrokenLinks);
    }
}
