package karate;
//import com.intuit.karate.junit5.Karate;
//import com.intuit.karate.testng.Karate;
import com.intuit.karate.junit5.Karate;
import org.testng.annotations.Test;
public class KarateTestRunner  {
    @Karate.Test
    public Karate testKarate() {
        // This method will be automatically detected by TestNG as a test and execute the Karate feature files.
        return Karate.run("classpath:src/main/java/com/Feature/seleniumWebDriver.feature");
    }
}
