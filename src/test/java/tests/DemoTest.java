package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void demoTest1(){
        System.out.println("Demo test");
    }

    @Test(description = "test for fail test demo")
    public void demoFailTest(){
        System.out.println("test for fail test demo");
        Assert.assertEquals(25,25);


    }

}
