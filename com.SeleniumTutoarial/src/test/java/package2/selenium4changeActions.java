package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class selenium4changeActions {
   public static void main(String[]args){
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.selenium-tutorial.com/courses/");
       WebElement ele = driver.findElement(By.partialLinkText("LIFETIME MEMBERSHIP TO ALL LIVE TRAININGS"));
       Actions act =  new Actions(driver);
       //Selenium 3
     // act.moveToElement(ele).clickAndHold().build().perform();
       //When we run the script, notice that click and hold action gets applied to the link (see the dark background color)
//Next, after clickAndHold, if we now want to releas, we have to again use moveToElement() method as shown below
      // act.moveToElement(ele).release().build().perform();

       //selenium 4
       act.clickAndHold(ele).build().perform();
       act.release(ele).build().perform();





   }

}
