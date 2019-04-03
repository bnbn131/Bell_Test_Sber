package YandexTest;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestYandex extends Framework {


    @Test
            public void testYandex(){

        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        LaptopPage laptopPage = PageFactory.initElements(driver, LaptopPage.class);

        //2.      Зайти на https://market.yandex.ru/
        mainPage.openLinck();

        //4. (пункт 4 идет сразу за пунктоп 3 в задании)      Навести мышкой на раздел Компьютеры
        //из-за того, что при наведении мышкой, нет выпадающего меню, по этому кликаем на "Компьютерная техника" и дальше выбираем "Ноутбуки"

        mainPage.computerLinckClick();
        mainPage.laptopLinkClick();

        //Задать параметр поиска от 15000 до 30000 рублей.

        laptopPage.priceFromeSendKeys();
        laptopPage.priceBeforeSendKeys();

        //7.      Выбрать производителя HP и Lenovo

        laptopPage.setClickHPCheckbox();
        laptopPage.setClickLenovoCheckbox();

        //8.      Нажать кнопку Применить. Кнопка "Применить" отсутствуюет, фильтры применяются автоматически.


        //9. Неменого не понимаю, по каким параметром должен проверить, что подходят, проверить, что нет других производителей? или каждый ноутбук загнать в переменную и потом проверить,
        // все ли верно?

    }

}
