package EbayTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    @FindBy (xpath = "//input[@id='userid']")
    public WebElement login;

    @FindBy (xpath = "//input[@id='pass']")
    public WebElement pass;

    @FindBy (xpath = "//button[@id='sgnBt']")
    public WebElement inputClick;

    public void setInputClick() {
        inputClick.click();
    }

    public void setLogin() {
        login.sendKeys("bellozontest@yandex.ru");
    }

    public void setPass() {
        pass.sendKeys("qwer1234");
    }


}

