package S8;


import org.testng.annotations.Test;

public class NewTest {
    @Test(priority=1)
    public void openbrowser(){
        System.out.println("open the browser");
    }
    @Test(priority=2)
    public void openpage(){
        System.out.println("Enter login url ");

    }
    @Test(priority=3)
    public void data(){
        System.out.println("Enter login credentials");
    }
}
