package YouTube;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

//belltztest@gmail.com
//Qwer!234
public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    @FindBy(xpath = "//input[@name='identifier']")
    public WebElement login;

    @FindBy (xpath = "//span[text()='Далее']")
    public WebElement nextLoginButton;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement pass;


    public void setNextLoginButton() {
       nextLoginButton.click();
    }

    public void setLogin() {
        login.sendKeys("belltztest@gmail.com");
    }

    public void setPass() {
        pass.sendKeys("Qwer!234");
    }


}
