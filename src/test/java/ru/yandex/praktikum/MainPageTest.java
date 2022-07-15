package ru.yandex.praktikum;

import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.pageobject.MainPage;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import com.codeborne.selenide.Configuration;

public class MainPageTest {
    @Before
    public void startUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768"; // значение по умолчанию для браузера на весь экран
    }

    @Test
    public void checkTextFaqAnswerOne() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(0);
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", mainPage.getFaqItemAnswerText(0));
    }

    @Test
    public void checkTextFaqAnswerTwo() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(1);
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, "
                + "можете просто сделать несколько заказов — один за другим.", mainPage.getFaqItemAnswerText(1));
    }

    @Test
    public void checkTextFaqAnswerThree() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(2);
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. "
                + "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру."
                + " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", mainPage.getFaqItemAnswerText(2));
    }

    @Test
    public void checkTextFaqAnswerFour() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(3);
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", mainPage.getFaqItemAnswerText(3));
    }

    @Test
    public void checkTextFaqAnswerFive() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(4);
        assertEquals("Пока что нет! Но если что-то срочное — "
                + "всегда можно позвонить в поддержку по красивому номеру 1010.", mainPage.getFaqItemAnswerText(4));
    }

    @Test
    public void checkTextFaqAnswerSix() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(5);
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток "
                + "— даже если будете кататься без передышек и во сне. Зарядка не понадобится.", mainPage.getFaqItemAnswerText(5));
    }

    @Test
    public void checkTextFaqAnswerSeven() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(6);
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, "
                + "объяснительной записки тоже не попросим. Все же свои.", mainPage.getFaqItemAnswerText(6));
    }

    @Test
    public void checkTextFaqAnswerEight() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.scrollToFaq();
        mainPage.getFaqItemAnswerText(7);
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", mainPage.getFaqItemAnswerText(7));
    }

    @After
    public void teardown() {
        Selenide.closeWindow();
    }
}