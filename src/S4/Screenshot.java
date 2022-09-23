package S4;

import io.netty.handler.codec.http.multipart.FileUpload;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.swing.*;
import java.io.File;

public class Screenshot {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d =new ChromeDriver();
        //web page
        d.get("https://www.istockphoto.com/photos/nature");
        //maximize
        d.manage().window().maximize();
        //covert web driver to take screenshot
        File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        //copy to file destination
        //FileUtils.copyFile(src,new File("D:\\software selenium\\1.png"));
        System.out.println("Screenshot taken...");
    }

}
