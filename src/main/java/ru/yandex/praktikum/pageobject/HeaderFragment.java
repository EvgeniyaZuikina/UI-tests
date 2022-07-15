package ru.yandex.praktikum.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.*;

public class HeaderFragment {
	public final static String URL = "https://qa-scooter.praktikum-services.ru/";

	@FindBy(how = How.XPATH, using = "//a[@class='Header_LogoYandex__3TSOI']") // логотип Яндекс
	private SelenideElement yandexLogo;

	@FindBy(how = How.XPATH, using = "//a[@class='Header_LogoScooter__3lsAR']") // логотип Самокат
	private SelenideElement scooterLogo;

	@FindBy(how = How.XPATH, using = "//div[@class='Header_Disclaimer__3VEni']") // надпись Учебный тренажер
	private SelenideElement textSimulator;

	@FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g'][text()='Заказать']") // кнопка Заказать
	private SelenideElement headerOrderButton;

	@FindBy(how = How.XPATH, using = "//button[@class='Header_Link__1TAG7']") // кнопка Статус заказа
	private SelenideElement orderStatusButton;

	@FindBy(how = How.XPATH, using = ".//input[@placeholder='Введите номер заказа']") // поле ввода номера заказа
	private SelenideElement orderNumberInputField;

	@FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Header_Button__28dPO'][text()='Go!']") // кнопка Go!
	private SelenideElement searchOrderButton;

	public void clickHeaderOrderButton() {
		headerOrderButton.click();
		page(MakeOrderPage.class);
	}

}

	
	
	