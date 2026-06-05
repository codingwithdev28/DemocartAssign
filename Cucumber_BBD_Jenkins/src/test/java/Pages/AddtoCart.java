package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {

    WebDriver driver;

    public AddtoCart(WebDriver driver) {
        this.driver = driver;
    }

    public void addProducts() throws Exception {

        driver.findElement(By.name("search"))
                .clear();

        driver.findElement(By.name("search"))
                .sendKeys("iphone");

        driver.findElement(By.name("search"))
                .sendKeys(Keys.ENTER);

        driver.findElement(
                By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]"))
                .click();
        
        WebElement h=driver.findElement(By.name("search"));
    	  h.clear();
    	  h.sendKeys("HP");
    	  h.sendKeys(Keys.ENTER);
    	  driver.findElement(By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']")).click();
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//button[@id='button-cart']")).click();

        Thread.sleep(2000);
    }

    public void removeProduct() {

        driver.findElement(
                By.xpath("//*[@id='top-links']/ul/li[4]/a/i"))
                .click();

        driver.findElement(
                By.xpath("//a[text()='iPhone']/ancestor::tr//button[contains(@data-original-title,'Remove')]"))
                .click();
    }
}