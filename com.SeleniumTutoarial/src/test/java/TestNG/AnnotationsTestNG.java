package TestNG;

import org.testng.annotations.*;

public class AnnotationsTestNG {

    @Test(priority=200)
    void method1(){
        System.out.println("BeforeMethod");
    }
    @Test(priority=-87)
    void method2(){
        System.out.println("BeforeTest");
    }
    @Test(priority=1)
    void method3(){
        System.out.println("BeforeClass");
    }
    @Test(priority=4)
    void method4(){
        System.out.println("BeforeSuite");
    }
    @Test(priority=6)
    void method5(){
        System.out.println("Test");
    }
    @Test(priority=5)
    void method6(){
        System.out.println("AfterSuite");
    }
    @Test(priority=9)
    void method7(){
        System.out.println("AfterTest");
    }
    @Test(priority=7)
    void method8(){
        System.out.println("AfterMethod");
    }
    @Test(priority=8)
    void method9(){
        System.out.println("AfterClass");
    }
}
