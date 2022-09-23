package S12_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageTest {
    WebDriver d;
    @BeforeClass
    public void openbrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://practicetestautomation.com/practice-test-login/");

    }
    @Test
    public void validatelogin() {
        Pageclass p=new Pageclass(d);
        p.validatelogin();
    }




}
