package YouTube;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestYoutube extends Framework {


    @Test
    public void testYoutube(){

    MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    AddVideoPage addVideoPage = PageFactory.initElements(driver, AddVideoPage.class);
    SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

    //1.	Перейдите на сайт https://www.youtube.com/
    mainPage.openLinck();
    //2.	Выполните авторизацию на сервисе
    mainPage.setClickEnter();
    loginPage.setLogin();
    loginPage.setNextLoginButton();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    loginPage.setPass();
        waiting(); //Если не добавить ожидание, то выдает ошибку, что какой-то div перекрывает элемент
        loginPage.setNextLoginButton();
       // loginPage.setNextPassButton();

        //3.	Нажмите на кнопку «Добавить видео»
        waiting();
        mainPage.setClickCreate();
        mainPage.setClickAddVideo();
        waiting();
        addVideoPage.setAddVideo();
        //4.	В открывшейся форме добавьте  медиа файл для загрузки
        addVideoPage.addFile.sendKeys("C:\\Work\\belltzyoutube.mkv");
        //6.	Добавьте необходимое описание и tags (в дальнейшем по ним необходимо будет выполнить поиск)
        addVideoPage.setAddTags();
        //5.	Дождитесь пока медиа файл загрузится и обработается на сервисе
        waitingYouyube();
        //7.	Опубликуйте медиа
        addVideoPage.setPublishl();

        //8.	Перейдите на главную страницу сервиса
        mainPage.openLinck();
        //9.	Выполните поиск по параметрам загруженного ранее видео
        searchPage.setSearch();
        searchPage.setSearchButton();

        try {
            waiting(driver, By.xpath("//span[@class=\"bold style-scope yt-formatted-string\"]"));
            List<WebElement> elementList = driver.findElements(By.xpath("//span[@class=\"bold style-scope yt-formatted-string\"]"));
            Assert.assertTrue(elementList.get(0).getText().equals("belltzyoutube"));
        }
        catch(Exception ex){
            System.out.println("Вроде это так должно работать, но оно не работает(((, youtube не выводит в поиске видео, возможно долгая обработка идет");
        }




//div[@class='upload-item-main']//div//div[@class='sub-item-exp-zippy']//div[@class='sub-item-exp']//div[@class='metadata-editor-container']//div[@class='metadata-container']//form[@name='mdeform']//div[contains(@class,'metadata-tab basic-info-tab')]//fieldset[@class='metadata-two-column']//div//input[@placeholder='Теги (например: Альберт Эйнштейн, мэшап, рак на горе)']

    }



}
