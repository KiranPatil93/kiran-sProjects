import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityInTestNg {
    @Test(priority =1)
    public void method_B(){
        System.out.println("this is method B");

    }
    @Test(priority =2)
    public void method_A(){
        System.out.println("this is method A");
    }
    public void navigationOnHomePage(){
        //open url
        //enter username
        //unterpass
        //click on login button
        //navigate on home
       // validation


    }
}
