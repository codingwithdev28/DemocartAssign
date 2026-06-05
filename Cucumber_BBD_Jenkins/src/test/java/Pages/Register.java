package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

    WebDriver driver;
    WebDriverWait wait;
    public Register(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public void clickRegister() {

    	WebElement icon=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-user']")));
		 icon.click();
		 driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
    }

    public void enterDetails(String fname,
                             String lname,
                             String email,
                             String phone,
                             String pass,
                             String cpass) {

        driver.findElement(By.id("input-firstname"))
                .sendKeys(fname);

        driver.findElement(By.id("input-lastname"))
                .sendKeys(lname);

        driver.findElement(By.id("input-email"))
                .sendKeys(email);

        driver.findElement(By.id("input-telephone"))
                .sendKeys(phone);

        driver.findElement(By.id("input-password"))
                .sendKeys(pass);

        driver.findElement(By.id("input-confirm"))
                .sendKeys(cpass);
    }

    public void submit() {

    	 driver.findElement(By.name("agree")).click();
         driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
    }
}