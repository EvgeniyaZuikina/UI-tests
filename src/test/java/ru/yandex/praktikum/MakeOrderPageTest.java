package ru.yandex.praktikum;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.model.Customer;
import ru.yandex.praktikum.model.RentDetails;
import ru.yandex.praktikum.pageobject.MainPage;
import ru.yandex.praktikum.pageobject.MakeOrderPage;
import static com.codeborne.selenide.Selenide.open;


public class MakeOrderPageTest {
    @Before
    public void startUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1366x768"; // значение по умолчанию для браузера на весь экран
    }

    @Test
    public void makeOrderSimpleCustomer() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.clickHeaderOrderButton();
        MakeOrderPage makeOrderPage = open(MakeOrderPage.URL, MakeOrderPage.class);
        makeOrderPage.setName(Customer.getSimpleCustomer().getName());
        makeOrderPage.setSurname(Customer.getSimpleCustomer().getSurname());
        makeOrderPage.setAddress(Customer.getSimpleCustomer().getAddress());
        makeOrderPage.setMetro(Customer.getSimpleCustomer().getMetro());
        makeOrderPage.chooseMetroStation();
        makeOrderPage.setPhoneNumber(Customer.getSimpleCustomer().getPhoneNumber());
        makeOrderPage.clickNextButton();
        makeOrderPage.setDate(RentDetails.getSimpleRentDetails().getDate());
        makeOrderPage.clickPeriodMenu();
        makeOrderPage.choosePeriod(RentDetails.getSimpleRentDetails().getPeriod());
        makeOrderPage.chooseColor(RentDetails.getSimpleRentDetails().getColor());
        makeOrderPage.setCommentField(RentDetails.getSimpleRentDetails().getComment());
        makeOrderPage.clickMakeOrderButton();
        makeOrderPage.clickButtonYes();
        makeOrderPage.isOrderWindowDisplayed();
    }

    @Test
    public void makeOrderComplexCustomer() {
        MainPage mainPage = open(MainPage.URL, MainPage.class);
        mainPage.closeCookiePopupIfPresent();
        mainPage.clickOrderButton();
        MakeOrderPage makeOrderPage = open(MakeOrderPage.URL, MakeOrderPage.class);
        makeOrderPage.setName(Customer.getComplexCustomer().getName());
        makeOrderPage.setSurname(Customer.getComplexCustomer().getSurname());
        makeOrderPage.setAddress(Customer.getComplexCustomer().getAddress());
        makeOrderPage.setMetro(Customer.getComplexCustomer().getMetro());
        makeOrderPage.chooseMetroStation();
        makeOrderPage.setPhoneNumber(Customer.getComplexCustomer().getPhoneNumber());
        makeOrderPage.clickNextButton();
        makeOrderPage.setDate(RentDetails.getComplexRentDetails().getDate());
        makeOrderPage.clickPeriodMenu();
        makeOrderPage.choosePeriod(RentDetails.getComplexRentDetails().getPeriod());
        makeOrderPage.chooseColor(RentDetails.getComplexRentDetails().getColor());
        makeOrderPage.setCommentField(RentDetails.getComplexRentDetails().getComment());
        makeOrderPage.clickMakeOrderButton();
        makeOrderPage.clickButtonYes();
        makeOrderPage.isOrderWindowDisplayed();
    }
    @After
    public void teardown()
    {
        Selenide.closeWindow();
    }
}