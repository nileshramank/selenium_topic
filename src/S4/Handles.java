package S4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Handles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        //web page
        d.get("https://demoqa.com/select-menu");
        //identify dropdown
        Select s = new Select(d.findElement(By.id("oldSelectMenu")));
        s.selectByIndex(3);
        s.selectByValue("7");
        s.selectByVisibleText("Purple");
        //to print selected option
        WebElement sop = s.getFirstSelectedOption();
        System.out.println("select option is" + sop.getText());
        // to get all option in dropdown\
        System.out.println("All option in dropdown are");
        List<WebElement> asop = s.getOptions();
        Select ms = null;
        for (WebElement s1 : asop) {
            System.out.println(s1.getText());
            //multi select
            ms = new Select(d.findElement(By.id("cars")));
            if
            (ms.isMultiple()) ;
            ms.selectByVisibleText("Volvo");
            ms.selectByIndex(4);
        }
        {
            System.out.println("Not multi select dropdown");
        }
        //to print selected option
        System.out.println("All selected option are:");
        List<WebElement> ams = ms.getAllSelectedOptions();
        for (WebElement options : ams) {
            System.out.println(options.getText());
        }
    }
}

