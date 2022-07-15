package ru.yandex.praktikum.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class MainPage extends HeaderFragment {
    public final static String URL = "https://qa-scooter.praktikum-services.ru/";

    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Привезём его прямо к вашей двери, а когда накатаетесь — заберём']") //
    private SelenideElement textFirst;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']") //
    private SelenideElement textAfterScroll;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX'][text()='Самокат на пару дней']") // Самокат на пару дней
    private SelenideElement scooterHeader;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']") // блок характеристик
    private SelenideElement scooterModel;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Модель Toxic PRO']")// модель
    private SelenideElement modelToxicPro;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Максимальная скорость']") //
    private SelenideElement maxSpeed;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='40 км/ч']") //
    private SelenideElement speedValue;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Проедет без поздарядки']") //
    private SelenideElement withoutRecharge;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='80 км']") //
    private SelenideElement pathValue;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='Выдерживает вес']") //
    private SelenideElement weightMax;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK'][text()='120 кг']") //
    private SelenideElement weightValue;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Scooter__3YdJy']/img") // картинка самоката
    private SelenideElement scooterPict;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_BluePrint__TGX2n']/img") // картинка самоката после скролла
    private SelenideElement scooterPictAfterScroll;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_ArrowDown__fnDme Home_Animated__17o7s Home_Bounce__O19_v']") //
    private SelenideElement scrollDownElement;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Как это работает']")// как это работает
    private SelenideElement textHowItWorks;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='1']") // кружок с цифрой 1
    private SelenideElement roadMapNum1;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Заказываете самокат']") // статус заказываете самокат
    private SelenideElement roadMapStatus1;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5'][text()='Выбираете, когда и куда привезти']") // описание выбираете
    private SelenideElement roadMapDesc1;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='2']") // кружок с цифрой 2
    private SelenideElement roadMapNum2;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Курьер привозит самокат']") // статус заказываете самокат
    private SelenideElement roadMapStatus2;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5'][text()='А вы — оплачиваете аренду']") // описание выбираете
    private SelenideElement roadMapDesc2;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='3']") // кружок с цифрой 3
    private SelenideElement roadMapNum3;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Катаетесь']") // статус заказываете самокат
    private SelenideElement roadMapStatus3;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5'][text()='Сколько часов аренды осталось — видно на сайте']") // описание выбираете
    private SelenideElement roadMapDesc3;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp Home_Lineless__2-Rxp'][text()='4']") // кружок с цифрой 4
    private SelenideElement roadMapNum4;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Курьер забирает самокат']") // статус заказываете самокат
    private SelenideElement roadMapStatus4;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5'][text()='Когда аренда заканчивается']") // описание выбираете
    private SelenideElement roadMapDesc4;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_ThirdPart__LSTEE']//button") // кнопка Заказать
    private SelenideElement orderButton;

    @FindBy(how = How.XPATH, using = "//div[@class='App_CookieConsent__1yUIN']") // попап куки
    private SelenideElement cookiePopup;

    @FindBy(how = How.XPATH, using = "//div[@class='App_CookieText__1sbqp'][text()='И здесь куки! В общем, мы их используем.']") // текст куки
    private SelenideElement cookieText;

    @FindBy(how = How.XPATH, using = "//button[@class='App_CookieButton__3cvqF'][text()='да все привыкли']")  // кнопка окна куки Да все привыкли
    private SelenideElement cookieButton;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Вопросы о важном']") // заголовок Вопросы
    private SelenideElement faqText;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='Accordion']/div[@data-accordion-component='AccordionItem']") // блок вопросов с ответами
    private SelenideElement faqElements;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemButton']") //  вопросы
    private ElementsCollection faqItemQuestion;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemPanel']") //  ответы
    private ElementsCollection faqItemAnswer;


    public MakeOrderPage clickOrderButton() {
        orderButton.scrollIntoView(true).shouldBe(Condition.visible).click();
        return page(MakeOrderPage.class);
    }

    public MainPage closeCookiePopupIfPresent() {
        if (cookieButton.isDisplayed()) {
            cookieButton.click();
        }
        return this;
    }

    public void scrollToFaq(){
    faqElements.shouldBe(Condition.visible).scrollTo();
    }

    public void clickFaqItemQuestion(int index) {
        faqItemQuestion.get(index).click();
    }

    public String getFaqItemAnswerText(int index) {
        clickFaqItemQuestion(index);
        faqItemAnswer.get(index).scrollIntoView(true).click();
        String textAnswer = faqItemAnswer.get(index).getText();
        return textAnswer;
    }
    }

