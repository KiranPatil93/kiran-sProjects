package day13;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//to find total number of rows
		List<WebElement> rows =driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rowCount = rows.size();
		//System.out.println("total number of rows :" +rowCount);
		
		
		//to find number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		int columnCount = cols.size();
		//System.out.println("total number of columns :" +columnCount);
		
		//print all headers
		
//		for(int c=0;c<columnCount;c++) {
//			String headers =cols.get(c).getText();
//			System.out.println(headers+"\t");
//		}
	

	
	//print data present in 5th row and 1st column
		
	
//	   String cellData =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
//	   
//	   System.out.println(cellData);
	   
	   
	   
	   //read all the data from the table 
//	   for(int r=2;r<=rowCount;r++) {
//		   for(int c=1;c<=columnCount;c++) {
//			   String data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
//			   System.out.print(data + "\t");
//			   
//		   }
//		   System.out.println();
//	   }
	   
	   
	   //condition based - print bookname whose author is mukesh
	   
//	   for(int r=2; r<=rowCount;r++) {
//		 
//		   String author =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//		  // System.out.println(author);
//		   if(author.equals("Mukesh")) {
//			   String bookName =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
//			   System.out.println(bookName+""+author);
//		   }
//	   }
//	   
	   
	   
	   //find total price
		int total = 0;
	   for(int r=2;r<rowCount;r++) {
		     String price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		     System.out.println(price);
		     //convert string into integer
		     total = total + Integer.parseInt(price);
	   }
	   System.out.println("total price :"+ total);
	}
	
	
	
	
	
	
	
	
	
	
	
}
