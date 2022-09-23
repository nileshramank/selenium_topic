package Testng;
import com.beust.jcommander.Parameter;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class newtest {
    static WebDriver d;
    @Parameters( {"browsers"})
    @BeforeClass
    public void openbrowser(String browsers) {
        if (browsers.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
            d = new ChromeDriver();
            d.manage().window().maximize();
            d.get("https://www.google.com/");
        } else if (browsers.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "D:\\software_selenium\\msedgedriver.exe");
            d = new EdgeDriver();
            d.manage().window().maximize();
            d.get("https://www.google.com/");
        }
    }
        @BeforeMethod
                public void openpage() {
            d.get("https://www.google.com/");
        }
        @Test
                public void test(){
            d.findElement(By.name("q")).sendKeys("selenium logo");
            d.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
        }
    }


