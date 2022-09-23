package S1_S3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        //webpage
        d.get("https://practicetestautomation.com/practice-test-login/");
        //username
        d.findElement(By.id("username")).sendKeys("student");
        //password
        d.findElement(By.id("password")).sendKeys("Password123");
        //login button
        d.findElement(By.id("submit")).click();

    }
}
