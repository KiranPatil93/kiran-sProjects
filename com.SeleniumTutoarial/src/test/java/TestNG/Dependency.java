package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
    @Test(priority=1)
    void openApp() {
        System.out.println("Open App");
        Assert.assertTrue(true);
    }
    @Test(priority=2,dependsOnMethods={"openApp"})
    void login(){
        System.out.println("login");
        Assert.assertTrue(false);
    }
    @Test(priority=3,dependsOnMethods={"login"})
    void search(){
        System.out.println("Search");
    }
    @Test(priority=4,dependsOnMethods={"login"})
    void advanceSearch(){
        System.out.println("Advance Search");
    }
    @Test(priority=5,dependsOnMethods={"login"})
    void logout(){
        System.out.println("Ologout");
    }
@Test(priority=6)
    void m1(){
    System.out.println("Independent method 1");
    }
    @Test(priority=7)
    void m2(){
        System.out.println("Independent method 2");
    }
}
