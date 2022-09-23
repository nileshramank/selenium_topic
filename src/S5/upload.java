package S5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        //webpage
        d.get("https://demo.guru99.com/test/upload/");
        //maximize
        d.manage().window().maximize();
        //upload button
        WebElement upload =d.findElement(By.name("uploadfile_0"));
        upload.sendKeys("C:\\Users\\Nilesh\\Documents\\sabari 3.pdf");
        //license terms
       d.findElement(By.id("terms")).click();
        //submit button
        d.findElement(By.name("send")).click();
    }

}
