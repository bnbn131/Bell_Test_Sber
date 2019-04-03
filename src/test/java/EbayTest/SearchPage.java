package EbayTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private ProductPage productPage;
    private List<WebElement> catalog;
    private int numbersProduct = 0;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    @FindBy(xpath = "//input[@placeholder='Найдите любые товары']")
    public WebElement search;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchButtonClick;

    public void setSearchButtonClick() {
        searchButtonClick.click();
    }

    public void setSearch() {
        search.sendKeys("Samsung");
    }
    public int getNumbersProduct(){
        return numbersProduct;
    }
    public List<WebElement> getCatalog() {
        return catalog;
    }

    public void checkNumber(){
        productPage = new ProductPage(driver);
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.
                visibilityOfElementLocated(productPage.getCountProduct()));

        String numberSize  = driver.findElement(productPage.getCountProduct()).getText();
        catalog = driver.findElements(productPage.getTitleProduct());
        System.out.println("number " + numberSize);
        System.out.println("catalog " + catalog.size());
        numbersProduct = Integer.parseInt(numberSize);
    }

    public void enterCheckNumber(){
        try {
            checkNumber();
        } catch (Exception e){
            System.out.println("Error in step enter check number");
            driver.navigate().refresh();
            checkNumber();
        }
    }
}
