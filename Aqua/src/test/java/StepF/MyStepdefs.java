package StepF;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.automatedtest.fixture.TempoFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyStepdefs extends BaseFixture {
    public static WebDriver driver = null;
    @Given("I custome click on action {string}")
    public void i_custome_click_on_action(String xText) {
        driver = CucumberTempoFixture.getSettings().getDriver();
        driver.findElement(By.xpath("//*[contains(text(),'"+xText+"')]")).click();
    }


    @When("I enter Input in grid at column {string} with {string}")
    public void iEnterInputInGridAtColumnWith(String row, String header) {
        driver = CucumberTempoFixture.getSettings().getDriver();
        driver.findElement(By.xpath("(//*[contains(@class,'TextInput---text TextInput---align_start TextInput---inEditableGridLayout')])['+row+']")).sendKeys(header);
    }

    @When("I enter Input in grid at textarea column {string} with {string}")
    public void iEnterInputInGridAtTextareaColumnWith(String row, String header) {
        driver = CucumberTempoFixture.getSettings().getDriver();
        driver.findElement(By.xpath("(//*[@class='ParagraphWidget---textarea ParagraphWidget---align_start ParagraphWidget---height_medium ParagraphWidget---inEditableGridLayout'])['+row+']")).sendKeys(header);
    }
}
