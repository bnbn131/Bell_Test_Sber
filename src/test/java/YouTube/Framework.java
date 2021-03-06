package YouTube;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Framework {

    public WebDriver driver;
    public WebDriverWait wait;
//1.      Открыть браузер Chrome и развернуть на весь экран.
    @Before
    public void setUp() throws MalformedURLException {

        URL chromeDriverUrl = new URL("http://localhost:9515");
        driver = new RemoteWebDriver(chromeDriverUrl, new ChromeOptions()); // открываем хром
        System.out.println("Загружено");
        driver.manage().window().maximize(); // разворачиваем окно
    }

    public void waiting(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waiting(WebDriver driver, By by){
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



    public void waitingYouyube() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



//    @After
//    public void close() {
//        driver.quit();
//    }


}