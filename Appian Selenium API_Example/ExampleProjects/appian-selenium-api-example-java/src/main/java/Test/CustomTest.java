package Test;

import CustomeClasses.CustomClass;
import com.appiancorp.example.HelloAppian;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.automatedtest.fixture.TempoFixture;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.appiancorp.example.HelloAppian.fixture;

public class CustomTest extends TempoFixture {
public static CustomClass custome;
public static HelloAppian appian;
@BeforeMethod
public void SetUp(){
    appian = new HelloAppian();
  custome = new CustomClass();
}
@Test(priority = 1,description = "Enter Date")
public void fileuploading(){
    appian.Login();
    fixture.clickOnButton("New Case");
    fixture.populateFieldWith("Text",new String[]{"Kiran"});
   // custome.fileUpload();
}


































}
