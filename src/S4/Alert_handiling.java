package S4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handiling {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\software selenium\\chromedriver.exe");
        WebDriver d =new ChromeDriver();
        d.get("https://demoqa.com/alerts");
        //maximize
        d.manage().window().maximize();
        //generate the alert
        d.findElement(By.id("alertButton")).click();
        //move from main window to alerts window
        Alert a=d.switchTo().alert();
        //to capture alert message
        String msg=a.getText();
        System.out.println("simple alert:"+msg);
        //wait 3 sec before clicking ok button
        Thread.sleep(3000);
        //ok button
        a.accept();
        //generate confirmation alert
        d.findElement(By.id("confirmButton")).click();
        //move from main window to alert window
        Alert a1=d.switchTo().alert();
        // to capture alert message
        String msg1=a1.getText();
        System.out.println("Confirmation Alert:"+msg1);
        //wait 3 sec before clicking ok button
        Thread.sleep(3000);
        //cancel button
        a1.dismiss();

    }
}
