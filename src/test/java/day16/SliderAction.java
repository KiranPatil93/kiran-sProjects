package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']//child::span[1]"));
		Actions act = new Actions(driver);
		System.out.println("minimum slider location before moving" +minSlider.getLocation()); //59,256
		act.dragAndDropBy(minSlider, 150, 256).build().perform();
		System.out.println("minimum slider location after moving" +minSlider.getLocation());//208,256
		
		WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']//child::span[2]"));
		System.out.println("maximum slider location before moving" +maxSlider.getLocation()); //510,256
		act.dragAndDropBy(maxSlider, -200, 256).build().perform();
		System.out.println("maximum slider location after moving" +maxSlider.getLocation());//311,256

	}

}
