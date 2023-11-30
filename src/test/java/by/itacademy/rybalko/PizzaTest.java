package by.itacademy.rybalko;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PizzaTest {
    WebDriver driver;

    @BeforeEach
    public void start() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/");
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }

    @Test
    public void pizzaBooking() throws InterruptedException {
        Pizza pizza = new Pizza(driver);
        pizza.clickButtonPizza();
        pizza.clickButtonMargo();
        pizza.clickButtonOrder();
        Thread.sleep(2000);
        pizza.clickButtonBasket();
        Thread.sleep(2000);
        String actual = pizza.getTextProductName();
        String expected = "Пицца \"Маргарита\" (21см)";
        Assertions.assertEquals(expected, actual);
    }

}


