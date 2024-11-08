package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.MultipleProductsOnCartPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class MultipleProductsOnCartDefs {

    LoginPage loginPage = new LoginPage();
    MultipleProductsOnCartPage multipleProductsOnCartPage = new MultipleProductsOnCartPage();


    @Given("Mia is a SauceDemo user")
    public void miaIsASauceDemoUser() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
    }

    @When("She adds three new products")
    public void sheAddsThreeNewProducts() {
        multipleProductsOnCartPage.addProductsToCart();
    }

    @Then("She sees all three products in the cart page")
    public void sheSeesAllThreeProductsInTheCartPage() {
        List<WebElement> itemsInTheInventory = Driver.getDriver().findElements(By.className("cart_item"));
        String listOfItemsFound = String.valueOf(itemsInTheInventory.size());
        Assert.assertEquals("3", listOfItemsFound);
        System.out.println("Total items found are = "+ listOfItemsFound);
    }

    @And("She clears products from her Cart")
    public void sheClearsProductsFromHerCart() {
        multipleProductsOnCartPage.removeItemsFromCart();
    }
}
