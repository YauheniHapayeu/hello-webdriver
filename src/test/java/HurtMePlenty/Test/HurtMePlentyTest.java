package HurtMePlenty.Test;

import HurtMePlenty.PageObjectModel.googleCloudPricingCalculatorEstimationResult;
import HurtMePlenty.PageObjectModel.googleCloudHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HurtMePlentyTest {
    private WebDriver driver;
    @BeforeMethod (alwaysRun = true)
    public void browserSetup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (description = "Hurt Me Plenty home work")
    public void HurtMePlentyResults() {
        googleCloudPricingCalculatorEstimationResult expectedPasteResult = new googleCloudHomePage(driver)


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
                .formSubmission();


        googleCloudPricingCalculatorEstimationResult expectedPasteResult1 = new googleCloudPricingCalculatorEstimationResult(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[4]/div")).getText(), "Provisioning model: Regular");

        googleCloudPricingCalculatorEstimationResult expectedPasteResult2 = new googleCloudPricingCalculatorEstimationResult(driver);
        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[5]/div[1]")).getText().contains("Instance type: n1-standard-8"))));

        googleCloudPricingCalculatorEstimationResult expectedPasteResult3 = new googleCloudPricingCalculatorEstimationResult(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[1]/div")).getText(),"Region: Frankfurt");

        googleCloudPricingCalculatorEstimationResult expectedPasteResult4 = new googleCloudPricingCalculatorEstimationResult(driver);
        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[7]/div[1]")).getText().contains("Local SSD: 2x375 GiB"))));

        googleCloudPricingCalculatorEstimationResult expectedPasteResult5 = new googleCloudPricingCalculatorEstimationResult(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[3]/div")).getText(),"Commitment term: 1 Year");

        googleCloudPricingCalculatorEstimationResult expectedPasteResult6 = new googleCloudPricingCalculatorEstimationResult(driver);
        Assert.assertTrue(Boolean.parseBoolean(String.valueOf(driver.findElement(By.xpath("//*[@id=\"resultBlock\"]/md-card/md-card-content/div/div/div/h2/b")).getText().contains("1,081.20"))));

    }
    @AfterMethod(alwaysRun = true)
    public void browserTearDown (){
        driver.quit();
        driver = null;
    }
}
