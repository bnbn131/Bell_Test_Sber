package YouTube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }
    @FindBy (xpath = "//input[@placeholder='Введите запрос']")
    public WebElement search;

    @FindBy (xpath = "//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")
    public WebElement searchButton;

    public void setSearchButton() {
        searchButton.click();
    }

    public void setSearch() {
        search.sendKeys("belltzyoutube");
    }
}
