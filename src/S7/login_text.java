package S7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeClass;

public class login_text {
    @Test
    public void test1() {
        System.out.println("Login test 1");
    }
    @Test
    public void test2() {
        System.out.println("Login test 1");
    }
    @BeforeClass
    public static void openbrowser() {
        System.out.println("Open browser");
    }
    @AfterClass
    public static void closebrowser() {
        System.out.println("Close browser");

    }
    @Before
    public void openloginpage( ) {
        System.out.println("open login page");
    }
    @After
    public void closeloginpage( ) {
        System.out.println("open login page");
    }


}
