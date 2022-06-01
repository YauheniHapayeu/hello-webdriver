package BringItOn.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BringItOnResults {
    private WebDriver driver;

    public BringItOnResults(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = this.driver;
    }
}