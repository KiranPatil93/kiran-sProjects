package testNG;

import org.testng.annotations.Test;

public class TestNGBasics {
	//open app
    //login
    //logout
   @Test(priority=200)
    void openApp(){

       System.out.println("Open the application");
    }
    @Test(priority=200)
    void login(){

       System.out.println("login...");
    }
    @Test(priority=200)
    void logout(){
       System.out.println("logout.....");
    }

	
	
	
	
}
