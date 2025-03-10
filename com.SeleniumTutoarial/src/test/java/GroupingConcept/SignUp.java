package GroupingConcept;

import org.testng.annotations.Test;

public class SignUp {
    @Test(priority=1,groups={"Regression"})
    void signupToGoogle(){
        System.out.println("signup to Google");
    }
    @Test(priority=2,groups={"Regression"})
    void signupToFacebook(){
        System.out.println("signup to Facebook");
    }
    @Test(priority=3,groups={"Regression","Sanity"})
    void signupTotwitter(){
        System.out.println("signup to Twitter");
    }

}
