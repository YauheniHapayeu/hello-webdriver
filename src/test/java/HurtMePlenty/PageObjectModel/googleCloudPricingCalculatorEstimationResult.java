package HurtMePlenty.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class googleCloudPricingCalculatorEstimationResult {
    private final WebDriver driver;

    public googleCloudPricingCalculatorEstimationResult(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}