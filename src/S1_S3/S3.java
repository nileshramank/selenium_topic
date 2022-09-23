package S1_S3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3 {
    public static void main(String[] args) {
        //browser launch
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        //web page
        d.get("https://www.google.com/");
        //navigate
        d.navigate().to("https://www.facebook.com/home.php");
        //navigate back
        d.navigate().back();
        //navigate forward
        d.navigate().forward();
    }
}