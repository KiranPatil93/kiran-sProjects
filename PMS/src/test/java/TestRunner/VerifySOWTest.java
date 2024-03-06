package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/VerifySOW.feature", glue = {
        "com.appiancorp.ps.cucumber","MyStepDefinition"}, plugin = {"pretty"})
public class VerifySOWTest {

}
