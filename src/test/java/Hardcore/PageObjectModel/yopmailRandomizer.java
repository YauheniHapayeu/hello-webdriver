package Hardcore.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class yopmailRandomizer {

    private final WebDriver driver;

    public yopmailRandomizer(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id=\"cprnd\"]")
    private WebElement copyButton;

    @FindBy(xpath = "//button[@class=\"md but text f24 egenbut\"]/*[text()=\"Check Inbox\"]")
    private WebElement checkInboxButton;

    public googleCloudPricingCalculatorEstimationResult randomEmailCopying() {
        copyButton.click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(0));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allow=\"clipboard-write https://cloud-dot-devsite-v2-prod.appspot.com\"]")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"myFrame\"]")));
        return new googleCloudPricingCalculatorEstimationResult(driver);
    }

    public yopmailInbox inboxChecking() {
        checkInboxButton.click();
        driver.switchTo().defaultContent();
        return new yopmailInbox(driver);
    }
}