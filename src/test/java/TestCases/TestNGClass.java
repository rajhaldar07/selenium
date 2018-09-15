package TestCases;

import org.testng.annotations.Test;

public class TestNGClass {

    @Test(priority = 1, description = "Student Login")
    public void loginApplication(){
        System.out.println("This is my first test");

    }

    @Test(priority = 2, description = "Student selecting their credentials")
    public void selectItems(){
        System.out.println("This is my second test");

    }

    @Test(priority = 3, description = "Student placing Transcript order")
    public void checkoutItems(){
        System.out.println("This is my third test");

    }
}
