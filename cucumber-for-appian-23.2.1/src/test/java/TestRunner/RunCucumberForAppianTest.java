package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/ApplicationExample.feature", glue = {
    "com.appiancorp.ps.cucumber","MyStepdefs"}, plugin = {"pretty"}, tags = "@Upload")
public class RunCucumberForAppianTest {
}
