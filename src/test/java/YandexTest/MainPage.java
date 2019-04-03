package YandexTest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (xpath = "//span[contains(text(),'Компьютерная техника')]")
    public WebElement computer;
    @FindBy(xpath = "//a[contains(text(),'Ноутбуки')]")
    public WebElement laptop;



    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }
    public void openLinck(){
        driver.get("https://market.yandex.ru");
    }

   public void computerLinckClick(){
        computer.click();
   }
   public void laptopLinkClick(){
        laptop.click();
   }

}
