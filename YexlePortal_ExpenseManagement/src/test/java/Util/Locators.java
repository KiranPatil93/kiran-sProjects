package Util;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinitions.MyStepDefinition.driver;

public class Locators extends BaseFixture {
    public Locators() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "(//*[contains(@class,'TextInput---text TextInput---align_start')])[1]")
    public
    WebElement wbPurpose;

    @FindBy(xpath = "//*[contains(@class,'EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable')]")
    public
    WebElement expenseTable;

}
