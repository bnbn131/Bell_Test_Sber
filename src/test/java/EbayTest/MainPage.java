package EbayTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    @FindBy (xpath = "//a[contains(text(),'Войдите')]")
    public WebElement clickEnter;


    public void openLinck(){
        driver.get("https://www.ebay.com/");
    }

    public void setClickEnter() {
       clickEnter.click();
    }
}
