package GroupingConcept;

import org.testng.annotations.Test;

public class Logout {
    @Test(priority=1,groups={"Functional"})
    void logoutInGoogle(){
        System.out.println("Logout to Google");
    }
    @Test(priority=2,groups={"Functional","Sanity"})
    void logoutInFacebook(){
        System.out.println("Logout to Facebook");
    }
    @Test(priority=2,groups={"Functional","Smoke"})
    void logoutIntwitter(){
        System.out.println("Logout to Twitter");
    }
}
