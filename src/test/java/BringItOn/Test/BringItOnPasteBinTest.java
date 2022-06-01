package BringItOn.Test;

import BringItOn.PageObjectModel.BringItOnResults;
import BringItOn.PageObjectModel.PasteBinHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.System.getProperty;


public class BringItOnPasteBinTest {
    private WebDriver driver;
    @BeforeMethod (alwaysRun = true)
    public void browserSetup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (description = "Bring It On home work")
    public void BringItOnResults() {
        BringItOnResults expectedPasteResult = new PasteBinHomePage(driver)

                .openPage()
                .newPasteInput("git config --global user.name  \"New Sheriff in Town\"\n" +
                        "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                        "git push origin master --force")
                .syntaxHighlightingInput()
                .pasteExpirationSelection()
                .pasteNameInput("how to gain dominance among developers")
                .pasteBinSubmission();


        BringItOnResults expectedPasteResult1 = new BringItOnResults(driver);
        Assert.assertEquals(driver.getTitle(), "how to gain dominance among developers - Pastebin.com");

        BringItOnResults expectedPasteResult2 = new BringItOnResults(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"highlighted-code\"]/div/div/a")).getText(), "Bash");

        BringItOnResults expectedPasteResult3 = new BringItOnResults(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//textarea[@class=\"textarea -raw js-paste-raw\"]")).getText(),"git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");

    }
    @AfterMethod (alwaysRun = true)
    public void browserTearDown (){
        driver.quit();
        driver = null;
    }
}
