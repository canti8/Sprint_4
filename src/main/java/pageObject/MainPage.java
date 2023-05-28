package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    // Драйвер
    private final WebDriver driver;
    public MainPage(WebDriver driver) {

        this.driver = driver;
    }

    // Главная страница
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    // Открыть ссылку
    public MainPage open() {
        driver.get(URL);
        return this;
    }
    // Принять куки
    private final By acceptCookieButton = By.id("rcc-confirm-button");

    // Кнопка заказать сверху
    private final By orderButtonInHeader = By.xpath("//button[@class='Button_Button__ra12g']");

    // Кнопка заказать снизу
    private final By orderButtonDown = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Кнопки с вопросами (аккордеон)
    public static String questionAccordionButton = "accordion__heading-%s";
    // Ответы на вопросы (аккордеон)
    public static String answerAccordionText = "accordion__panel-%s";

    // Окно с подтверждением заказа
    private final By finalOrder = By.className("Order_ModalHeader__3FDaJ");

    // Кликнуть принять куки
    public MainPage acceptCookie() {
        driver.findElement(acceptCookieButton).click();
        return this;
    }

    // Скролл до аккордеона
    public MainPage scrollToAccordion() {
        WebElement element = driver.findElement(By.className("Home_FAQ__3uVm4"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    //Динамический номер для локатора кнопок
    public static By accordionButton(String number) {

        return By.id(String.format(questionAccordionButton, number));
    }
    //Динамический номер для локатора ответов
    public static By accordionText(String number) {

        return By.id(String.format(answerAccordionText, number));
    }

    //Клик по кнопкам с вопросами (аккордеон)
    public MainPage clickAccordionButton(String number) {
        driver.findElement(accordionButton(number)).click();
        return this;
    }
    //Возвращение текста ответов на вопросы (аккордеон)
    public String getAccordionText(String number) {

        return driver.findElement(accordionText(number)).getText();
    }

    private final By orderButton_1 = By.className("Button_Button__ra12g");

    // Кликнуть принять куки
    public OrderDetailsFormPage clickOrderButton() {
        driver.findElement(orderButton_1).click();
        return new OrderDetailsFormPage(driver);
    }
    // Кликнуть принять куки
    public OrderDetailsFormPage clickOrderTopButton() {
        driver.findElement(orderButtonInHeader).click();
        return new OrderDetailsFormPage(driver);
    }

}