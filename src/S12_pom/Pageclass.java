package S12_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass {
    WebDriver d;
    @FindBy(id="username")
    WebElement uname;
    @FindBy(id="password")
    WebElement passwd;
    @FindBy(id="submit")
    WebElement clicklogin;
    public Pageclass (WebDriver d) {
        PageFactory.initElements(d, this);

    }
    public void validatelogin() {
        uname.sendKeys("student");
        passwd.sendKeys("Password123");
        clicklogin.click();
    }
}