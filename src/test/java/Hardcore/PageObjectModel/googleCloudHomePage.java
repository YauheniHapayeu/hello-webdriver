package Hardcore.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class googleCloudHomePage {
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    public WebDriver driver;

    @FindBy(xpath = "//input[@name = 'q']")
    private WebElement search;


    public googleCloudHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public googleCloudHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        Duration Sec10= Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name = 'q']")));
        return this;
    }

    public googleCloudPricingCalculatorSearchResults searchCalculator (String term) {
        search.click();
        search.sendKeys(term);
        search.sendKeys(Keys.ENTER);
        Duration Sec10= Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='gs-title']")));
        return new googleCloudPricingCalculatorSearchResults(driver);
    }
}
