package Hardcore.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class yopmailInbox {

    private final WebDriver driver;

    public yopmailInbox(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id=\"refresh\"]")
    private WebElement refreshButton;

    @FindBy(xpath = "//*[@id=\"messagectn\"]")
    private WebElement inboxEmptyMsg;

    public yopmailInbox inboxRefreshing() throws InterruptedException {

        do {Thread.sleep(5000);
        refreshButton.click();
        if (inboxEmptyMsg.isDisplayed() == false)
            break;}
        while (inboxEmptyMsg.isDisplayed() == true);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"ifmail\"]")));
        return this;
    }
}
