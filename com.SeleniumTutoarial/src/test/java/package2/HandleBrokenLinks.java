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

public class HandleBrokenLinks {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> allLinks =driver.findElements(By.tagName("a"));
        System.out.println("Total links are " +allLinks.size());
        int totalBrokenLinks =0;
        for(WebElement linkname:allLinks) {
            String hrefAttValue = linkname.getAttribute("href"); //url
            if (hrefAttValue == null || hrefAttValue.isEmpty()) {
                System.out.println("The href value is null or empty");
                continue;
            }
            //convert string to url
            try {
                URL linkURL = new URL(hrefAttValue);
                HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();// open coonection into server
                con.connect();//connect to the server and send the request to the server //
                if (con.getResponseCode() >= 400) {
                    System.out.println(hrefAttValue + "Link is broken");
                    totalBrokenLinks ++;
                } else {
                    System.out.println("Link is not broken");
                }
            }catch(Exception e){

            }
        }
        System.out.println("Total broken links are " +totalBrokenLinks);
    }
}
