package HurtMePlenty.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleCloudPricingCalculatorSearchResults {
    private WebDriver driver;

    public googleCloudPricingCalculatorSearchResults(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//div[@class=\"gs-title\"]/*[@class=\"gs-title\"]/b[text()=\"Google Cloud Pricing Calculator\"]")
    private WebElement CalculatorLink;

        public googleCloudPricingCalculatorForm openCalculator() {
            CalculatorLink.click();
            return new googleCloudPricingCalculatorForm(driver);

        }
}