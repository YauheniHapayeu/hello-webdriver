package ICanWin.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class PasteBinHomePage {
    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"postform-text\"]")
    private WebElement newPaste;

    @FindBy(xpath ="//*[@id=\"select2-postform-expiration-container\"]")
    private WebElement pasteExpirationSelecting;

    @FindBy(id = "postform-name")
    private WebElement pasteName;

    public PasteBinHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PasteBinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        return this;
    }

    public PasteBinHomePage newPasteInput(String code) {
        newPaste.sendKeys(code);
        return this;
    }
    public PasteBinHomePage pasteExpirationSelection() {
        pasteExpirationSelecting.click();
        WebElement element = driver.findElement(By.xpath("//li[text()=\"10 Minutes\"]"));
        element.click();
        return this;
    }
    public PasteBinHomePage pasteNameInput (String title) {
        pasteName.sendKeys(title);
        return this;
    }
}
