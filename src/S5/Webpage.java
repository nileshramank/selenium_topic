package S5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webpage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\software_selenium\\chromedriver.exe");
        WebDriver d =new ChromeDriver();
        //web page
        d.get("https://demo.guru99.com/test/web-table-element.php");
        //maximize
        d.manage().window().maximize();
        //no of columns
        List cols=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of columns: "+cols.size());
        //no of rows
        List rows=d.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
        System.out.println("No of rows: "+rows.size());
        //identify entire table
        WebElement basetable=d.findElement(By.tagName("table"));
        //particular row data
        WebElement tablerow=basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[4]"));
        String rowdata=tablerow.getText();
        System.out.println("4rd row data: "+rowdata);
        //particular cell data
        WebElement tablecell=basetable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[9]/td[1]"));
        String celldata=tablecell.getText();
          System.out.println("9th data: "+celldata);
    }

}
