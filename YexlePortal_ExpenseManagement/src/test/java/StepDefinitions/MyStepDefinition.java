package StepDefinitions;

import Util.ExcelReader;
import Util.Locators;
import Util.WaitUtil;
import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import com.appiancorp.ps.cucumber.fixtures.CucumberTempoFixture;
import com.brsanthu.googleanalytics.logger.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Util.TestUtil.scrollToViewByJavaScriptExecutor;
import static Util.TestUtil.selectdropdownValue;

public class MyStepDefinition extends BaseFixture {
  private Locators locators = new Locators();
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
   public static WebDriver driver= null;


    @When("I select value From Date as {string}")
    public void iSelectValueFromDateAs(String fromDate) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath("(//*[contains(@class,'DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width')])[1]")).sendKeys(fromDate);
    }

    @When("I select value from dropdown {string} search box with {string}")
    public void i_select_value_from_dropdown_search_box_with(String dropProject, String options) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
   WebElement dropProjectEvent =  driver.findElement(By.xpath("//*[contains(text(),'" + dropProject + "')]//following::div[2]"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].click()", dropProjectEvent);
        Thread.sleep(3000);
        selectdropdownValue(options);
       /* for (int i = 0; i < 3; i++) {
            try {
                List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(@class,'MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')]"));
                for (WebElement dropoption : allOptions) {
                    String txtoptions = dropoption.getText();
                    System.out.println(txtoptions);
                    if (txtoptions.equals(options)) {
                        dropoption.click();
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }*/
    }

    @When("I select value To Date as {string}")
    public void iSelectValueToDateAs(String endDate) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath("(//*[contains(@class,'DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width')])[2]")).sendKeys(endDate);
    }

    @When("I enter Input in grid at column {string} with {string}")
    public void iEnterInputInGridAtColumnWith(String column, String expDate) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        WaitUtil.waitTill(5);
            WebElement inputField = driver.findElement(By.xpath("//table[contains(@class,'EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable')]//tr//td[" + column + "]//input"));
            Actions act = new Actions(driver);
            act.moveToElement(inputField).sendKeys(expDate).build().perform();

    }

    @When("I populate grid dropdown {string} column {string} search box with {string}")
    public void iPopulateGridDropdownColumnSearchBoxWith(String crncy, String column, String currency) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        if (!crncy.isEmpty()) {
            driver.findElement(By.xpath("//table[contains(@class,'EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable')]//tr//td[" + column + "]//descendant::div[2]")).click();
            for (int i = 0; i < 3; i++) {
                try {
                    List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(@class,'MenuWidgetItem---default_direction MenuWidgetItem---inDropdownWidget')]"));
                    for (WebElement dropoption : allOptions) {
                        String txtoptions = dropoption.getText();
                        System.out.println(txtoptions);
                        if (txtoptions.equals(currency)) {
                            dropoption.click();
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                } finally {

                    // driver.findElement(By.xpath("(//*[contains(@class,'DatePickerWidget---text DatePickerWidget---align_start DatePickerWidget---input_width')])[1]")).sendKeys("23");
                }

            }
        } else {
            Assert.fail("Currency dropdown is empty");
        }

    }

    @When("I upload documents with {string}")
    public void iUploadDocumentsWith(String document) throws InterruptedException {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath("//*[contains(text(),'Upload')]")).sendKeys(document);

    }




    @When("user fills the form from given sheetname {string} and rownumber {int}")
    public void user_fills_the_form_from_given_sheetname_and_rownumber(String SheetName, Integer RowNumber) {
        ExcelReader reader = new ExcelReader();
        try {
            List<Map<String, String>> testData = reader.getData("TestData/RaiseExpense.xlsx", SheetName);
            String dropProject = testData.get(RowNumber).get("dropProject");
            String options = testData.get(RowNumber).get("option");
            String fromDate = testData.get(RowNumber).get("fromDate");
            String endDate = testData.get(RowNumber).get("endDate");
            String purpose = testData.get(RowNumber).get("purpose");
            String expenseDate = testData.get(RowNumber).get("expenseDate");
            String description = testData.get(RowNumber).get("description");
            String currency = testData.get(RowNumber).get("currency");
            String amount = testData.get(RowNumber).get("amount");
            String tax = testData.get(RowNumber).get("tax");
            String document = testData.get(RowNumber).get("C:\\Users\\KiranPatil\\Downloads");
            i_select_value_from_dropdown_search_box_with(dropProject, options);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    @When("I enter value in textfield {string} with {string}")
    public void i_enter_value_in_textfield_with(String txtpurpose, String purpose) {
        driver = ctf.getSettings().getDriver();
        scrollToViewByJavaScriptExecutor(locators.wbPurpose);
        locators.wbPurpose.sendKeys(purpose);
    }

    @When("I click on radio button in grid column {string} bills Availabe with {string}")
    public void i_click_on_radio_button_in_grid_column_bills_availabe_with(String column, String result) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath("//table[contains(@class,'EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable')]//tr//td[" + column + "]//input")).click();


    }
    @After
    public void Close(){
        driver = ctf.getSettings().getDriver();
        driver.quit();
    }

    @When("I upload file in grid with column {string} with {string}")
    public void iUploadFileInGridWithColumnWith(String column, String document) {
        driver = ctf.getSettings().getDriver();
        WebElement uploadFile =  driver.findElement(By.xpath("//table[contains(@class,'EditableGridLayout---table EditableGridLayout---striped EditableGridLayout---distribute EditableGridLayout---scrollable')]//tr//td[" + column + "]//input"));
        uploadFile.sendKeys(document);
    }



    @Given("I custome click on Menu {string}")
    public void i_custome_click_on_menu(String menu) {
        driver = ctf.getSettings().getDriver();
        WebElement expRequests = driver.findElement(By.xpath("//*[contains(text(),'"+menu+"')]"));
        Actions act = new Actions(driver);
        act.moveToElement(expRequests).click().build().perform();
    }



    @Given("I zoom In page")
    public void i_zoom_in_page() {
        driver = ctf.getSettings().getDriver();
       // WebElement html = driver.findElement(By.tagName("html"));
       // html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));

        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='90%';");
    }
}




