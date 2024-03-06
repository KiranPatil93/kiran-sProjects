import org.testng.annotations.*;

public class Annotations {
@Test
public void method1(){
System.out.println("this is normal method");
}
@BeforeMethod
public void beforeMetho(){
    System.out.println("this is method will execute before each method");
}
@AfterMethod
public void afterMethod(){
    System.out.println("this method will execute after each method");
}
@BeforeTest
public void beforeTest(){
    System.out.println("this method will execute Before test");
}
@AfterTest
public void afterTest(){
    System.out.println("this method will execute after test");
}
@BeforeClass
public void beforeClass(){
    System.out.println("this method will execute before class");
}
@AfterClass
public void afterClass(){
    System.out.println("this method will execute after class");
}
@BeforeSuite
public void beforeSuit(){
    System.out.println("this method will execute before suit");
}
@AfterSuite
public void afterSuit(){
    System.out.println("this method will execute after suit");
}















//    @Test
//    public void testCase1(){
//        System.out.println("This is normal test case");
//
//    }
//    @BeforeMethod
//public void beforeMethod(){
//    System.out.println("This will execute before each method");
//}
//@AfterMethod
//public void afterMethod(){
//    System.out.println("This will execute after each method");
//}
//@BeforeClass
//public void beforeClass(){
//    System.out.println("This will execute before class");
//}
//@AfterClass
//public void afterClass(){
//    System.out.println("This will execute after class");
//}
//@BeforeTest
//public void beforeTest(){
//    System.out.println("This will execute before Test");
//}
//@AfterTest
//public void afterTest(){
//    System.out.println("This will execute After Test");
//}
//@BeforeSuite
//public void beforeSuit(){
//    System.out.println("This will execute before suit");
//}
//@AfterSuite
//public void afterSuit(){
//    System.out.println("This will execute after suit");
//}




//@Test(priority =1)
//    public void method_B(){
//System.out.println("This is B method");
//
//    }
//@Test(priority=2)
//public void method_A(){
//    System.out.println("This is A method");
//}














}
