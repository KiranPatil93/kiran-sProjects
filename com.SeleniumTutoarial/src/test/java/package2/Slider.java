package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Slider {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//child::span[1]"));
        System.out.println("position of minimum slider before moving " +min_slider.getLocation()); //(59, 249)
        Actions act = new Actions(driver);
        act.dragAndDropBy(min_slider,100, 249).perform(); //(159, 249)
        System.out.println("position of minimum slider after moving " +min_slider.getLocation());

        WebElement max_slider = driver.findElement(By.xpath("//div[@id='slider-range']//child::span[2]"));
        System.out.println("position of maximum slider before moving " +max_slider.getLocation());//(510, 249)
        act.dragAndDropBy(max_slider,-200,249).perform();
        System.out.println("position of maximum slider after moving " +max_slider.getLocation());



    }
}
