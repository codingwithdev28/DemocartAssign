package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    By account = By.xpath("//i[@class='fa fa-user']");
    By login = By.linkText("Login");
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginBtn = By.xpath("//input[@value='Login']");

    public void clickLogin() {

        driver.findElement(account).click();
        driver.findElement(login).click();
    }

    public void login(String user,String pass) {

        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSubmit() {

        driver.findElement(loginBtn).click();
    }
}