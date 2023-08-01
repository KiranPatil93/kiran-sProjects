package com.appiancorp.ps.cucumber.fixtures;

import com.appiancorp.ps.automatedtest.fixture.BaseFixture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStepdefs extends BaseFixture {
    private CucumberTempoFixture ctf = new CucumberTempoFixture();
    public static WebDriver driver= null;

    @Given("I custome click on card {string}")
    public void i_custome_click_on_card(String text) {
        driver = ctf.getSettings().getDriver();
        driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).click();
    }
}
