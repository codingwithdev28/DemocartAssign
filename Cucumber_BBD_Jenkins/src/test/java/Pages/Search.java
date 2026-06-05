package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.ExcelReader;

public class Search {

    WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProductsFromExcel() throws Exception {

        List<String> products =
                ExcelReader.getProducts();

        for(String product : products) {

            driver.findElement(By.name("search"))
                    .clear();

            driver.findElement(By.name("search"))
                    .sendKeys(product);

            driver.findElement(By.name("search"))
                    .sendKeys(Keys.ENTER);

            Thread.sleep(2000);

            System.out.println("Searched : " + product);
        }
    }
}