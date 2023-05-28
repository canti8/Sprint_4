package tests;

import pageObject.MainPage;
import model.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class OrderPageScooterTest extends BaseUITest {
    private final Order orderData;

    public OrderPageScooterTest(Order orderData) {
        this.orderData = orderData;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[]{
                new Order("Верхняя кнопка", "Тест", "Юзер", "Тестовый адрес", "Автозаводская", "896077794852", "18.07.2022", "четверо суток", "black", "Оставьте у подъезда"),
                new Order("Нижняя кнопка", "Антон", "Викторович", "Город Тверь", "Автозаводская", "89605559485", "19.07.2022", "сутки", "grey", "Нет комментария")
        };
    }
    @Test
    public void orderScooter() {

        boolean isInputDataBlockDisplayed = new MainPage(driver)
                .open()
                .clickOrderTopButton()
                .fillOrderDetailsForm(orderData)
                .isOrderTrue();
        Assert.assertTrue("Заказ не был оформлен", isInputDataBlockDisplayed);


    }
}

