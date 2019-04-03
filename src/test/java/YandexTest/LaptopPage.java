package YandexTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LaptopPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }


    @FindBy(xpath = "//input[@id='glpricefrom']")
    public WebElement priceFrom;

    @FindBy (xpath = "//input[@id='glpriceto']")
    public  WebElement priceBefore;

    @FindBy (xpath = "//li[8]//div[1]//a[1]//label[1]//div[1]") //lenovo
    public WebElement clickLenovoCheckbox;

    @FindBy (xpath = "//li[7]//div[1]//a[1]//label[1]//div[1]") //HP
    public WebElement clickHPCheckbox;



   public void priceFromeSendKeys(){
       priceFrom.sendKeys("15000");
   }
    public void priceBeforeSendKeys(){
        priceBefore.sendKeys("30000");
    }

    public void setClickLenovoCheckbox() {
       clickLenovoCheckbox.click();
    }

    public void setClickHPCheckbox() {
        clickHPCheckbox.click();
    }
}
