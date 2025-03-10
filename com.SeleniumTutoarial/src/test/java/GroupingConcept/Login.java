package GroupingConcept;

import org.testng.annotations.*;

public class Login {
    @Test(priority =1,groups={"Smoke"})
    void loginToGoogle(){
        System.out.println("login to Google");
    }
    @Test(priority =2,groups={"Smoke"})
    void loginToFacebook(){
        System.out.println("Login to Facebook");
    }
    @Test(priority =3,groups={"Regression"})
    void loginTotwitter(){
        System.out.println("Login to Twitter");
    }

}
