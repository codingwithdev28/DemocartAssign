package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

    WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout() throws Exception {

        driver.findElement(
                By.xpath("//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']"))
                .click();

        Thread.sleep(2000);

        driver.findElement(
                By.xpath("//a[@class='btn btn-primary']"))
                .click();

        Thread.sleep(2000);
    }

    public void fillDetails() throws Exception {

        driver.findElement(By.id("input-payment-firstname"))
                .sendKeys("Chirantan");

        driver.findElement(By.id("input-payment-lastname"))
                .sendKeys("Dev");

        driver.findElement(By.id("input-payment-address-1"))
                .sendKeys("Dwarka");

        driver.findElement(By.id("input-payment-address-2"))
                .sendKeys("Delhi");

        driver.findElement(By.id("input-payment-city"))
                .sendKeys("New Delhi");

        driver.findElement(By.id("input-payment-postcode"))
                .sendKeys("110059");

        Select country =
                new Select(driver.findElement(
                        By.id("input-payment-country")));

        country.selectByValue("99");

        Thread.sleep(2000);

        Select state =
                new Select(driver.findElement(
                        By.id("input-payment-zone")));

        state.selectByVisibleText("Delhi");
    }

    public void confirmOrder() throws Exception {

        driver.findElement(
                By.id("button-payment-address"))
                .click();

        Thread.sleep(2000);

        driver.findElement(
                By.id("button-shipping-address"))
                .click();

        Thread.sleep(2000);

        driver.findElement(
                By.id("button-shipping-method"))
                .click();

        Thread.sleep(2000);

        driver.findElement(
                By.name("agree"))
                .click();

        driver.findElement(
                By.id("button-payment-method"))
                .click();
    }
}