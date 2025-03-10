package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/SignIn.feature",
        glue = "stepDefinition",
        plugin = { "pretty", "html:target/cucumber-html-reports","json:target/TestReports/cucumber.json", "junit:target/TestReports/cucumber.xml" },
        dryRun = false,
        monochrome = true

)
public class TestSignIn {
}
