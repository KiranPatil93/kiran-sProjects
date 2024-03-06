package CustomeClasses;

import com.appiancorp.example.HelloAppian;
import com.appiancorp.ps.automatedtest.fixture.SitesFixture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.appiancorp.example.HelloAppian.driver;
import static com.appiancorp.example.HelloAppian.fixture;

public class ProjectCreation extends HelloAppian {

    @Test(priority = 1,description = "Enter Text")
    public void enterText(){
        fixture.clickOnButton("New Project Request");
    }

    public void fileUpload(){
        driver.findElement(By.xpath("//a[text()='Add New Document']")).click();
        fixture.waitForSeconds(2);
        WebElement fileInput =driver.findElement(By.xpath("//input[@type='file']"));
        String filePath=System.getProperty("user.dir") + "\\src\\main\\Documents\\pngdownload.jpg";
        fileInput.sendKeys(filePath);
    }










}
