package YouTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddVideoPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AddVideoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    @FindBy (xpath = "//div[@id='upload-prompt-box']//div[2]")
    public WebElement addVideo;

    @FindBy(xpath ="//div[@id=\"upload-prompt-box\"]/div/input")
    WebElement addFile;

    @FindBy (xpath = "//div[@class='upload-item-main']//div//div[@class='sub-item-exp-zippy']//div[@class='sub-item-exp']//div[@class='metadata-editor-container']//div[@class='metadata-container']//form[@name='mdeform']//div[contains(@class,'metadata-tab basic-info-tab')]//fieldset[@class='metadata-two-column']//div//input[@class='video-settings-add-tag']")
    public WebElement addTags;

    @FindBy (xpath = "//span[contains(text(),'Опубликовать')]")
    public WebElement  publish;

    public void setPublishl() {
        publish.click();
    }

    public void setAddTags() {
        addTags.sendKeys("belltzyoutube");
    }

    public void setAddVideo() {
        addVideo.click();
    }
}
