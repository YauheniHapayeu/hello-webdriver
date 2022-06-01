package Hardcore.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class googleCloudPricingCalculatorForm {
    private final WebDriver driver;

    public googleCloudPricingCalculatorForm(WebDriver driver) {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allow=\"clipboard-write https://cloud-dot-devsite-v2-prod.appspot.com\"]")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"myFrame\"]")));
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class=\"md-tab ng-scope ng-isolate-scope md-ink-ripple md-active\"]/*[@class=\"tab-holder compute\"]")
    private WebElement computeEngine;

    @FindBy(xpath = "//*[@id=\"input_86\"]")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//*[@id='select_value_label_77']")
    private WebElement operatingSystemsAndSoftware;

    //    VM Class
    @FindBy(xpath = "//*[@id=\"select_value_label_78\"]")
    private WebElement provisioningModel;

    //    Instance type
    @FindBy(xpath = "//*[@id=\"select_value_label_80\"]")
    private WebElement series;

    @FindBy(xpath = "//*[@id=\"select_value_label_81\"]")
    private WebElement machineType;

    @FindBy(xpath = "/html/body/md-content/md-card/div/md-card-content[1]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[12]/div[1]/md-input-container/md-checkbox/div[1]")
    private WebElement addGPUCheckBox;

    @FindBy(xpath = "//*[@id=\"select_449\"]")
    private WebElement gpuType;

    @FindBy(xpath = "//*[@id=\"select_value_label_448\"]")
    private WebElement gpuNumber;

    @FindBy(xpath = "//*[@id=\"select_value_label_409\"]")
    private WebElement localSsd;

    @FindBy(xpath = "//*[@id=\"select_value_label_84\"]")
    private WebElement dataCenterLocation;

    @FindBy(xpath = "//*[@id=\"select_128\"]")
    private WebElement commitedUsage;

    @FindBy(xpath = " //button[@aria-label=\"Add to Estimate\"]")
    private WebElement estimation;


    public googleCloudPricingCalculatorForm computeEngineFormSelection() {
        computeEngine.click();
        return this;
    }

    public googleCloudPricingCalculatorForm numberOfInstancesNumberPaste(String number) {
        numberOfInstances.click();
        numberOfInstances.sendKeys(number);
        return this;
    }

    public googleCloudPricingCalculatorForm operatingSystemsAndSoftwareSelection() {
        operatingSystemsAndSoftware.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_88\"]")));
        WebElement elementFree = driver.findElement(By.xpath("//*[@id=\"select_option_88\"]"));
        elementFree.click();
        return this;
    }

    public googleCloudPricingCalculatorForm provisioningModelSelection() {
        provisioningModel.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_101\"]")));
        WebElement elementRegular = driver.findElement(By.xpath("//*[@id=\"select_option_101\"]"));
        elementRegular.click();
        return this;
    }

    public googleCloudPricingCalculatorForm seriesSelection() {
        series.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_198\"]")));
        WebElement elementRegular = driver.findElement(By.xpath("//*[@id=\"select_option_198\"]"));
        elementRegular.click();
        return this;
    }

    public googleCloudPricingCalculatorForm machineTypesSelection() {
        machineType.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_415\"]")));
        WebElement elementRegular = driver.findElement(By.xpath("//*[@id=\"select_option_415\"]"));
        elementRegular.click();
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", addGPUCheckBox );
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_value_label_409\"]")));
        return this;
    }
    public googleCloudPricingCalculatorForm addGPUCheckBoxChecking() {
        addGPUCheckBox.click();
        gpuType.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_456\"]")));
        WebElement elementType = driver.findElement(By.xpath("//*[@id=\"select_option_456\"]"));
        elementType.click();
        return this;
    }
    public googleCloudPricingCalculatorForm addGPUTypeSelection() {
        gpuType.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_456\"]")));
        WebElement elementType = driver.findElement(By.xpath("//*[@id=\"select_option_456\"]"));
        elementType.click();
        return this;
    }
    public googleCloudPricingCalculatorForm addGPUNumberSelection() {
        gpuNumber.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_460\"]")));
        WebElement elementNumber = driver.findElement(By.xpath("//*[@id=\"select_option_460\"]"));
        elementNumber.click();
        return this;
    }
    public googleCloudPricingCalculatorForm localSsdSelection() {
        localSsd.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_436\"]")));
        WebElement elementSsd = driver.findElement(By.xpath("//*[@id=\"select_option_436\"]"));
        elementSsd.click();
        return this;
    }

    public googleCloudPricingCalculatorForm dataCenterLocationSelection() {
        dataCenterLocation.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_222\"]")));
        WebElement elementLocation = driver.findElement(By.xpath("//*[@id=\"select_option_222\"]"));
        elementLocation.click();
        return this;
    }
    public googleCloudPricingCalculatorForm commitedUsageSelection() {
        commitedUsage.click();
        Duration Sec10 = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, Sec10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select_option_126\"]")));
        WebElement elementUsage = driver.findElement(By.xpath("//*[@id=\"select_option_126\"]"));
        elementUsage.click();
        return this;
    }

    public googleCloudPricingCalculatorEstimationResult formSubmission() {
        estimation.click();
        return new googleCloudPricingCalculatorEstimationResult(driver);
    }

}