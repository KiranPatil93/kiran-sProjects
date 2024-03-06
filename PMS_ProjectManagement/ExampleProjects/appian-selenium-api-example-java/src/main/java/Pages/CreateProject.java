package Pages;

import com.appiancorp.example.HelloAppian;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProject extends HelloAppian {

    public CreateProject(){
        // this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Customers')]")
    WebElement menuCustomer;






}
