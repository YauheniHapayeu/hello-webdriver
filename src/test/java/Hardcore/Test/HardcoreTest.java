package Hardcore.Test;

import Hardcore.PageObjectModel.googleCloudHomePage;
import Hardcore.PageObjectModel.yopmailInbox;
import HurtMePlenty.PageObjectModel.googleCloudPricingCalculatorEstimationResult;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HardcoreTest {
    private WebDriver driver;
    @BeforeMethod (alwaysRun = true)
    public void browserSetup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (description = "Hurt Me Plenty home work")
    public void HurtMePlentyResults() throws InterruptedException {
        yopmailInbox expectedPasteResult = new googleCloudHomePage(driver)


                .openPage()
                .searchCalculator("Google Cloud Pricing Calculator")
                .openCalculator()
                .computeEngineFormSelection()
                .numberOfInstancesNumberPaste("4")
                .operatingSystemsAndSoftwareSelection()
                .provisioningModelSelection()
                .seriesSelection()
                .machineTypesSelection()
                .addGPUCheckBoxChecking()
                .addGPUTypeSelection()
                .addGPUNumberSelection()
                .localSsdSelection()
                .dataCenterLocationSelection()
                .commitedUsageSelection()
                .formSubmission()
                .emailPopupOpening()
                .newTabOpening()
                .randomizerOpening()
                .randomEmailCopying()
                .emailInput()
                .emailSending()
                .inboxChecking()
                .inboxRefreshing();

        yopmailInbox expectedPasteResult1 = new yopmailInbox(driver);
        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(driver.findElement(By.xpath("//h3[contains (text(),\"USD\")]")).getText().contains("1,081.20"))));
    }
    @AfterMethod(alwaysRun = true)
    public void browserTearDown (){
        driver.quit();
        driver = null;
    }
}
