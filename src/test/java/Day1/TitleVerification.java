package Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class TitleVerification {
/*steps 
1. Launch the browser - chrome 
2. open the url in the browser "https://www.opencart.com/"
3. validate the title . "OpenCart - Open Source Shopping Cart Solution"
4. close the browser
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lauch the browser 
   WebDriver driver = new ChromeDriver();
   //open the url 
   driver.get("https://www.opencart.com/");
  
	//validate title - OpenCart - Open Source Shopping Cart Solution - expected result
        String act_title = driver.getTitle();
        System.out.println(act_title);
   if(act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
	   System.out.println("Test pass");
   }else {
	   System.out.println("Test fail");
   }
   //close the browser
   
  // driver.close();
   
	}

}
