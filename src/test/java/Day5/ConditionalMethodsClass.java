package Day5;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ConditionalMethodsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

WebElement startBtn= driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));

//System.out.println(startBtn.isDisplayed());
Thread.sleep(1000);
//isEnabled
 WebElement txt_name = driver.findElement(By.xpath("//input[@id='name']"));
//System.out.println(txt_name.isEnabled());

//if name field is enabled then enter text name1 otherwise print name field is disabled 

if(txt_name.isEnabled()) {
	txt_name.sendKeys("name1");
}else {
	System.out.println("name field is disabled");
}

   WebElement radio_Male = driver.findElement(By.xpath("//input[@id='male']"));
   WebElement radio_Female = driver.findElement(By.xpath("//input[@id='female']"));
   System.out.println("Before Selection");
   System.out.println("male radio button : "+radio_Male.isSelected());//false
   System.out.println("Female radio button : "+radio_Female.isSelected());//false
   Thread.sleep(2000);
   //click on male radio button
   //radio_Male.click();
//   System.out.println("After Selection of male radio button");
//   System.out.println("male radio button : "+radio_Male.isSelected()); //true
//   System.out.println("Female radio button : "+radio_Female.isSelected()); //false
   radio_Female.click();
   System.out.println("After Selection of Female radio button");
   System.out.println("male radio button : "+radio_Male.isSelected()); //false
   System.out.println("Female radio button : "+radio_Female.isSelected()); //true

	}

}
