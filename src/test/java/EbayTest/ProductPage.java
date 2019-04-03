package EbayTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy (xpath = "//div[@class=\"srp-ipp__control--legacy\"]//span")
    public By countProduct;

    @FindBy (xpath = "//div[@class=\"srp-ipp__control--legacy\"]//span")
    public By titleProduct;


    public By getCountProduct() {
        return countProduct;
    }



    public By getTitleProduct() {
        return titleProduct;
    }

    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

}