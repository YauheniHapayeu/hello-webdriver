package Hardcore.PageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class googleCloudPricingCalculatorEstimationResult {
    private final WebDriver driver;

    public googleCloudPricingCalculatorEstimationResult(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"email_quote\"]")
    private WebElement emailButton;

    @FindBy(xpath = "//*[@id=\"input_527\"]")
    private WebElement emailField;

    @FindBy(xpath = "//button[@aria-label=\"Send Email\"]")
    private WebElement sendEmailButton;

//    public googleCloudPricingCalculatorEstimationResult priceColecting() {
//        String totalPrice=driver.findElement(By.xpath("//h2[@class=\"md-title\"]/b[1]")).getText();
//        emailButton.click();
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"input_525\"]")));
//        return this;

    public googleCloudPricingCalculatorEstimationResult emailPopupOpening() {
        emailButton.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"input_525\"]")));
        return this;
    }
    public yopmailHomePage newTabOpening() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://yopmail.com/");
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"pindexhautctn\"]")));
        return new yopmailHomePage(driver);
    }
    public googleCloudPricingCalculatorEstimationResult emailInput() {
        emailField.sendKeys(Keys.CONTROL+ "v");
        return this;
    }
    public yopmailRandomizer emailSending() {
        sendEmailButton.click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        return new yopmailRandomizer(driver);
    }
}