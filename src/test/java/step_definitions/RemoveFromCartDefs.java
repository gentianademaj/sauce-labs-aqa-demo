package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.RemoveFromCartPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RemoveFromCartDefs {

    LoginPage loginPage = new LoginPage();
    AddToCartPage addToCart = new AddToCartPage();
    RemoveFromCartPage removeFromCartPage = new RemoveFromCartPage();


    @Given("Chris is in home page")
    public void chrisIsInHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
    }

    @And("He has a product added in a card")
    public void heHasAProductAddedInACard() {
        addToCart.addToCartButton.click();
    }

    @When("Chris he clicks Remove button")
    public void chrisHeClicksRemoveButton() {
        removeFromCartPage.removeButton.click();
    }

    @Then("he is able to add the product to cart again")
    public void heIsAbleToAddTheProductToCartAgain() {
        Assert.assertTrue(removeFromCartPage.addToCartButton.isDisplayed());
    }
}
