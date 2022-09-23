package S11_keywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_keywords {
    static WebDriver d;
    public static void Open_bowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        d=new ChromeDriver();
        d.manage().window().maximize();
    }
    public static void Open_URL() {
        d.get("https://practicetestautomation.com/practice-test-login/");
    }
    public static void Enter_data() {

        d.findElement(By.id("username")).sendKeys("student");
        d.findElement(By.id("password")).sendKeys("Password123");

    }
    public static void Click_login() {
        d.findElement(By.id("submit")).click();
    }
    public static void Homepage() {
        System.out.println("Logged in successfully");

    }

}
