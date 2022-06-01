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

public class yopmailHomePage {

    private final WebDriver driver;

    public yopmailHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class=\"txtlien\"]/*[text()=\"Random Email Address\"]")
    private WebElement randomizer;

    public yopmailRandomizer randomizerOpening() {
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"txtlien\"]/*[text()=\"Random Email Address\"]")));
        randomizer.click();
        return new yopmailRandomizer(driver);
    }
}
