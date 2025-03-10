package TestNG;

import org.testng.annotations.*;

public class Annotations {
    @Test
    public void method1(){
        System.out.println("test ");
    }
    @BeforeTest
    public void method2(){
        System.out.println("before Test");
    }
    @BeforeClass
    public void method3(){
        System.out.println("before class");
    }
    @BeforeSuite
    public void method4(){
        System.out.println("before suite");
    }
    @BeforeMethod
    public void method5(){
        System.out.println("before method");
    }
    @BeforeGroups
    public void method6(){
        System.out.println("before suite");
    }
    @AfterMethod
    public void method7(){
        System.out.println("After method");
    }
    @AfterSuite
    public void method8(){
        System.out.println("After Suite");
    }
    @AfterGroups
    public void method9(){
        System.out.println("After Groups");
    }
    @AfterClass
    public void method10(){
        System.out.println("After class");
    }
    @AfterTest
    public void method11(){
        System.out.println("After test");
    }

}
