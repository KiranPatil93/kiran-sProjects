package CustomeClasses;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.automatedtest.fixture.SitesFixture;
import com.appiancorp.ps.automatedtest.fixture.TempoFixture;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.appiancorp.example.HelloAppian.driver;
import static com.appiancorp.example.HelloAppian.fixture;

public class CustomClass extends SitesFixture {



    public void fileUpload(){
        driver.findElement(By.xpath("//a[text()='Add New Document']")).click();
        fixture.waitForSeconds(2);
        WebElement fileInput =driver.findElement(By.xpath("//input[@type='file']"));
        String filePath=System.getProperty("user.dir") + "\\src\\main\\Documents\\pngdownload.jpg";
        fileInput.sendKeys(filePath);
    }










}
