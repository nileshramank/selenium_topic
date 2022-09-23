package S1_S3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
    WebDriver d =new ChromeDriver();
		d.get("https://demo.guru99.com/test/radio.html");
    //radio button
    WebElement opt1=d.findElement(By.id("vfb-7-1"));
		opt1.click();
    WebElement opt2=d.findElement(By.id("vfb-7-3"));
		opt2.click();
    //checkbox
    WebElement cbox1=d.findElement(By.id("vfb-6-1"));
		cbox1.click();
    WebElement cbox2=d.findElement(By.id("vfb-6-2"));
		cbox2.click();

}
}
