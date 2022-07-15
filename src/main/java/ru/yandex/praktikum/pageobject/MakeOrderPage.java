package ru.yandex.praktikum.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;


public class MakeOrderPage extends HeaderFragment {

        public final static String URL = "https://qa-scooter.praktikum-services.ru/order";

        @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']") // имя
        private SelenideElement nameField;

        @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']") // фамилия
        private SelenideElement surnameField;

        @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']") // адрес
        private SelenideElement addressField;

        @FindBy(how = How.XPATH, using = "//input[@class='select-search__input']") // поле ввода станции
        private SelenideElement metroInputField;

        @FindBy(how = How.XPATH, using = "//li[@class='select-search__row']")
        private SelenideElement metroStation;  // станция метро из списка

        @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']") // телефон
        private SelenideElement phoneNumberField;

        @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Далее']")
        // кнопка Далее
        private SelenideElement nextButton;

        public void setName(String getName) {
                nameField.setValue(getName);
        }

        public void setSurname(String getSurname) {
                surnameField.setValue(getSurname);
        }

        public void setAddress(String getAddress) {
                addressField.setValue(getAddress);
        }

        public void setMetro(String getMetro) {
                metroInputField.setValue(getMetro);
        }

        public void chooseMetroStation() {
                metroStation.click();
        }

        public void setPhoneNumber(String getPhoneNumber) {
                phoneNumberField.setValue(getPhoneNumber);
        }

        public void clickNextButton() {
                nextButton.click();
        }

        @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']") // когда
        private SelenideElement dateField;

        @FindBy(how = How.XPATH, using = "//span[@class='Dropdown-arrow']") // меню периода
        private SelenideElement periodMenu;

        @FindBy(how = How.XPATH, using = "//div[@class='Dropdown-option']") // список элементов срок аренды
        private ElementsCollection periodField;

        @FindBy(how = How.XPATH, using = "//label[@class='Checkbox_Label__3wxSf'][text()='чёрный жемчуг']") // чек-бокс черный жемчуг
        private SelenideElement colorFieldBlack;

        @FindBy(how = How.XPATH, using = "//label[@class='Checkbox_Label__3wxSf'][text()='серая безысходность']") // чек-бокс серая безысходность
        private SelenideElement colorFieldGrey;

        @FindBy(how = How.XPATH, using = ".//input[@placeholder='Комментарий для курьера']")
        private SelenideElement commentField; // комментарий

        @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Заказать']")
        // кнопка Заказать
        private SelenideElement makeOrderButton;

        @FindBy(how = How.XPATH, using = "//div[@class='Order_ModalHeader__3FDaJ'][text()='Хотите оформить заказ?']")
        private SelenideElement confirmationOrder;

        @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Да']")
        // кнопка Да
        private SelenideElement buttonYes;

        @FindBy(how = How.XPATH, using = "//div[@class='Order_ModalHeader__3FDaJ'][text()='Заказ оформлен']")
        // окно подтвержения оформления заказа
        private SelenideElement orderWindow;

        public void setDate(String getDate) {
                dateField.setValue(getDate);
        }

        public void clickPeriodMenu() {
                periodMenu.click();
        }

        public void choosePeriod(String getPeriod) {
                periodField.findBy(text(getPeriod)).click();
        }

        public void chooseColor(String getColor) {
                if (getColor.equals("чёрный жемчуг")) {
                        colorFieldBlack.click();
                } else if (getColor.equals("серая безысходность")) {
                        colorFieldGrey.click();
                }
        }

        public void setCommentField(String comment) {
                commentField.setValue(comment);
        }

        public void clickMakeOrderButton() {
                makeOrderButton.click();
        }

        public void clickButtonYes() {
                buttonYes.click();
        }

        public void isOrderWindowDisplayed() {
                orderWindow.shouldBe(visible);
        }
}