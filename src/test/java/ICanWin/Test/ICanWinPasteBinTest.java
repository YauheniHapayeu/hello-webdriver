package ICanWin.Test;

import ICanWin.PageObjectModel.PasteBinHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ICanWinPasteBinTest {
    private WebDriver driver;
    @BeforeMethod (alwaysRun = true)
    public void browserSetup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (description = "I can win home work")
    public void ICanWinOnlyPaste() {
        PasteBinHomePage expectedPasteResult = new PasteBinHomePage(driver)
            .openPage ()
            .newPasteInput ("Hello from WebDriver")
            .pasteExpirationSelection()
            .pasteNameInput("helloweb");
    }

    @AfterMethod (alwaysRun = true)
    public void browserTearDown (){
        driver.quit();
        driver = null;
    }
}
