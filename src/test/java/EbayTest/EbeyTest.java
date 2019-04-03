package EbayTest;

import YandexTest.Framework;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EbeyTest extends Framework {

    @Test
    public void testEbay() {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        //1.	Перейдите на сайт https://www.ebay.com/
        mainPage.openLinck();

        //2.	Кликните на ссылку «Войдите»
        mainPage.setClickEnter();

        //3.	Заполните логин и пароль и войдите в систему
        loginPage.setLogin();
        loginPage.setPass();
        loginPage.setInputClick();

        //4.	Перейдите на главную страницу сервиса, после логина сам переходит на главную страницу, но на всякий случай

        mainPage.openLinck();

        //5.	Выполните поиск по товарам «samsung»
        searchPage.setSearch();
        searchPage.setSearchButtonClick();

        searchPage.enterCheckNumber();
        waiting();

        try {
            searchPage.enterCheckNumber();
        } catch (Exception e){
            System.out.println("Fail in step check number: " + e);
        }
        Assert.assertTrue(searchPage.getNumbersProduct() == searchPage.getCatalog().size());

        for(WebElement catalog : searchPage.getCatalog()){
            Assert.assertTrue(catalog.getText().toLowerCase().contains("Samsung"));
            System.out.println(catalog.getText());
        }





    }
}
