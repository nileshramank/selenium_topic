package S1_S3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d =new ChromeDriver();
        d.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //Experience
        WebElement exp=d.findElement(By.id("exp-4"));
        exp.click();
        // gender
        WebElement gender=d.findElement(By.id("sex-0"));
        gender.click();
        //first name
        d.findElement(By.name("firstname")).sendKeys("nilesh raman");
        //last name
        d.findElement(By.name("lastname")).sendKeys("k");

    }
}
