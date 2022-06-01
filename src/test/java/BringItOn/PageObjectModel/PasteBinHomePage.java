package BringItOn.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasteBinHomePage {
    private static final String HOMEPAGE_URL = "https://pastebin.com/";
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"postform-text\"]")
    private WebElement newPaste;

    @FindBy(xpath = "//*[@id=\"select2-postform-format-container\"]")
    private WebElement syntaxHighlighting;
    @FindBy(xpath ="//*[@id=\"select2-postform-expiration-container\"]")
    private WebElement pasteExpirationSelecting;

    @FindBy(xpath = "//input[@id=\"postform-name\"]")
    private WebElement pasteName;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement submitBtn;

    public PasteBinHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PasteBinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
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
    public PasteBinHomePage syntaxHighlightingInput() {
        syntaxHighlighting.click();
        WebElement element = driver.findElement(By.xpath("//li[text()=\"Bash\"]"));
        element.click();
        return this;
    }
    public PasteBinHomePage pasteNameInput(String title) {
        pasteName.sendKeys(title);
        return this;
    }
    public BringItOnResults pasteBinSubmission() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        submitBtn.click();
        Duration Sec10= Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class=\"textarea -raw js-paste-raw\"]")));
        return new BringItOnResults(driver);
    }
}
