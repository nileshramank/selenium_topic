package S8;

import org.testng.annotations.Test;

public class NewTest1 {
    @Test(priority=4)
    public void clickbutton(){
        System.out.println("clicklogin");
    }
    @Test(priority=5,enabled=false)
    public void firsttest(){
        System.out.println("login test passed");

    }
}
