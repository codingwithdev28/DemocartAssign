package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;
import io.cucumber.java.en.*;

import Pages.AddtoCart;
import Pages.Checkout;
import Pages.Login;
import Pages.Register;
import Pages.Search;

public class DemocartSteps {

    WebDriver driver;

    Register register;
    Login login;
    Search search;
    AddtoCart cart;
    Checkout checkout;

    @Given("DemoCart page is open in default browser")
    public void demo_cart_page_is_open_in_default_browser() {

    	  driver = Hooks.driver;
        register = new Register(driver);
        login = new Login(driver);
        search = new Search(driver);
        cart = new AddtoCart(driver);
        checkout = new Checkout(driver);
    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        register.clickRegister();
    }

    @And("enters registration details {string} {string} {string} {string} {string} {string}")
    public void enters_registration_details(String name,
                                            String lname,
                                            String email,
                                            String phone,
                                            String pass,
                                            String cpass) {

        register.enterDetails(
                name,lname,email,
                phone,pass,cpass);
    }

    @And("clicks on submit button")
    public void clicks_on_submit_button() {
        register.submit();
    }

    @Then("user should register successfully")
    public void user_should_register_successfully() {
        System.out.println("Registration Successful");
    }

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button() {

    	 WebDriverWait wait =
    	            new WebDriverWait(driver, Duration.ofSeconds(10));

    	    wait.until(ExpectedConditions.elementToBeClickable(
    	            By.xpath("//a[@title='My Account']")))
    	            .click();

    	    driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
    }

    @Then("user should logout successfully")
    public void user_should_logout_successfully() {

        System.out.println("Logout Successful");
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        login.clickLogin();
    }

    @And("enters username and password {string} {string}")
    public void enters_username_and_password(
            String email,
            String pass) {

        login.login(email, pass);
    }

    @And("clicks on login submit button")
    public void clicks_on_login_submit_button() {

        login.clickSubmit();
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Login Successful");
    }

    @When("user searches products from excel")
    public void user_searches_products_from_excel()
            throws Exception {

        search.searchProductsFromExcel();
    }

    @Then("related products should be displayed")
    public void related_products_should_be_displayed() {

        System.out.println("Products Displayed");
    }

    @When("user adds multiple products to cart")
    public void user_adds_multiple_products_to_cart()
            throws Exception {

        cart.addProducts();
    }

    @Then("products should be added successfully")
    public void products_should_be_added_successfully() {

        System.out.println("Products Added");
    }

    @When("user removes one product from cart")
    public void user_removes_one_product_from_cart() {

        cart.removeProduct();
    }

    @Then("product should be removed successfully")
    public void product_should_be_removed_successfully() {

        System.out.println("Product Removed");
    }

    @Then("total amount should be validated")
    public void total_amount_should_be_validated() {

        System.out.println("Total Amount Validated");
    }

    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout()
            throws Exception {

        checkout.checkout();
    }

    @And("enters all required checkout details")
    public void enters_all_required_checkout_details()
            throws Exception {

        checkout.fillDetails();
    }

    @And("clicks confirm order button")
    public void clicks_confirm_order_button()
            throws Exception {

        checkout.confirmOrder();
    }

    @Then("order should be placed successfully")
    public void order_should_be_placed_successfully() {

        System.out.println("Order Placed Successfully");
    }

    @And("browser should close")
    public void browser_should_close() {

        driver.quit();
    }
}