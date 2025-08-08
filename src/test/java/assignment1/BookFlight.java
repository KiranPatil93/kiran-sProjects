package assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlight {
public static void selectDropdown(WebElement element,String text) {
	Select se = new Select(element);
	se.selectByVisibleText(text);
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		WebElement departureCity = driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement destinationCity = driver.findElement(By.xpath("//select[@name='toPort']"));
		
		String departure = "Portland";
		String destination = "New York";
		selectDropdown(departureCity,departure);
		selectDropdown(destinationCity,destination);
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		double lowestPrice =Double.MAX_VALUE; 
		 int lowestIndex = -1;
		List<WebElement> prices = driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));
		for(int i=0;i<prices.size();i++) {
		
				String textPrice = prices.get(i).getText().replace("$", "").trim(); //472.56
				System.out.println(textPrice);
				//convert string into double
				double numPrice = Double.parseDouble(textPrice);//error 
				if(numPrice<lowestPrice) {
					lowestPrice = numPrice;//lowest price value 
					lowestIndex = i;
					
				}
				
				
//				WebElement chooseFlight = driver.findElement(By.xpath("//table[@class='table']//tr//td["+i+"]/input"));
//				chooseFlight.click();
		}
		
		System.out.println("Lowest price " + lowestPrice);
		System.out.println("Lowest index " + lowestIndex);
//		Thread.sleep(2000);
//		
		Thread.sleep(2000);
		 if (lowestIndex != -1) {
	            List<WebElement> chooseFlightButtons = driver.findElements(By.xpath("//table[@class='table']//tr//td[1]/input"));
	            chooseFlightButtons.get(lowestIndex).click();
        }
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
