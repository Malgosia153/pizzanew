package by.itacademy.rybalko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pizza {
    private String clickButtonPizza = "//img[@alt=\"Пицца\"]";
    private String clickButtonMargo = "/html/body/div[1]/div[5]/div[2]/div[2]/div[1]/div[11]/div[1]/div/div[2]/div[3]/div[3]";
    private String clickButtonOrder = "/html/body/div[1]/div[5]/div[2]/div[2]/div[1]/div[11]/div[1]/div/div[2]/div[3]/div[3]";
    private String clickButtonBasket = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div[1]";
    private String getTextProductName = "/html/body/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]/div[1]";

    WebDriver driver;

    public Pizza(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonPizza() {
        driver.findElement(By.xpath(clickButtonPizza)).click();
    }

    public void clickButtonMargo() {
        driver.findElement(By.xpath(clickButtonMargo)).click();
    }

    public void clickButtonOrder() {
        driver.findElement(By.xpath(clickButtonOrder)).click();
    }

    public void clickButtonBasket() {
        driver.findElement(By.xpath(clickButtonBasket)).click();
    }

    public String getTextProductName() {
        return driver.findElement(By.xpath(getTextProductName)).getText();
    }

}


