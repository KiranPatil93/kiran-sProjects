package examples.API;

import com.intuit.karate.junit5.Karate;

public class ApiTestRunner {

    @Karate.Test
    Karate testApi() {
        return Karate.run().relativeTo(getClass());
    }









}
