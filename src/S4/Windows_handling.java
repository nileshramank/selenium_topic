package S4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windows_handling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d =new ChromeDriver();
        d.get("https://demoqa.com/browser-windows");
        //maximize
        d.manage().window().maximize();
        //main window
        String mainwindow =d.getWindowHandle();
        System.out.println("Main Window: ->"+mainwindow);
        // open other window
        d.findElement(By.id("windowButton")).click();
        d.findElement(By.id("messageWindowButton")).click();
        Set<String> chlidwindows=d.getWindowHandles();
        for(String windows: chlidwindows) {
            System.out.println("other windows:"+windows);
            d.switchTo().window(windows);
            d.navigate().to("https://www.google.com/");
        }
    }

}
