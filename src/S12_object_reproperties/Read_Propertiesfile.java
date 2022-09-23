package S12_object_reproperties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

public class Read_Propertiesfile {
    public static void main(String[] args) throws Exception {
        Read_Propertiesfile.readproperties();

    }
    public static void readproperties() throws Exception {
        Properties pro=new Properties();
        InputStream fip =new FileInputStream("D:\\IJ\\selenium_topic\\src\\S12_object_reproperties\\config.properties");
        pro.load(fip);
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d =new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.google.co.in/");
        d.findElement(By.name(pro.getProperty("search_box"))).sendKeys("gmail login");
        d.findElement(By.name(pro.getProperty("search_box"))).sendKeys(Keys.ENTER);

        d.findElement(By.name(pro.getProperty("gmail"))).sendKeys("//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[1]/td/div/h3/a");

        d.findElement(By.name(pro.getProperty("search_box"))).sendKeys(Keys.ENTER);




    }
}
