package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.DriverFactory.driver;

public class NewAccountPage {
@FindBy(xpath="//input[@name='cusid']")
WebElement customerID;
@FindBy(xpath="//input[@name='cusid']")
WebElement accountType;

   public NewAccountPage(){
       PageFactory.initElements(driver,this);
   }

   public void enterCustomerID(String ID){
       customerID.sendKeys(ID);
   }
   public void selectAccountType(){

   }
}
