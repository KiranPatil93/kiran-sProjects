package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.BaseFixture;

import java.time.Duration;

public class BaseFixtureStep {
    private static BaseFixture fixture = new BaseFixture();
    @Given("I setup with {string} browser")
    public void iSetupWithBrowser(String browser) {
        fixture.init_Driver(browser);
    }

    @When("I set URL to {string}")
    public void iSetURLTo(String url) {
        fixture.openUrl(url);
    }
}
