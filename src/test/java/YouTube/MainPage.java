package YouTube;

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

    @FindBy(xpath = "//yt-formatted-string[@class='style-scope ytd-button-renderer style-blue-text size-default']")
    public WebElement clickEnter;

    @FindBy (xpath = "//ytd-topbar-menu-button-renderer[1]//div[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")
    public WebElement clickCreate;

    @FindBy (xpath = "//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    public WebElement clickAddVideo;

    public void setClickAddVideo() {
        clickAddVideo.click();
    }

    public void setClickCreate() {
        clickCreate.click();
    }

    public void openLinck(){
        driver.get("https://www.youtube.com/");
    }

    public void setClickEnter() {
        clickEnter.click();
    }
}
