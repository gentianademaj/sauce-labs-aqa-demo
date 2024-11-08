package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddToCartPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AddToCartStepDefs {

    AddToCartPage addToCartPage = new AddToCartPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is in home page")
    public void user_is_in_home_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
    }

    @When("User clicks on Add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        addToCartPage.addItemToCart();
    }

    @And("Clicks on the cart")
    public void clicks_on_the_cart() {
        addToCartPage.goToCart();
    }

    @Then("Cart page is shown with selected product")
    public void cart_page_is_shown_with_selected_product() {
        Assert.assertTrue(addToCartPage.selectedProductName.isDisplayed());
        addToCartPage.removeItemFromCartDetails();
    }
}
