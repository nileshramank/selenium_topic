package S8;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NewTest2 {
    @Test(priority=1)
    public void login() {
        assertEquals("login","login");
        System.out.println("Login mail");

    }
    @Test(priority=2)
    public void inbox() {
        System.out.println("view inbox");
    }
    @Test (priority=3)
    public void logout() {
        System.out.println("Logout mail");
    }
}
