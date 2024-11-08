package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomeSreen_DetailScreenPage;

public class HomeScreen_detailScreenDefs {

    HomeSreen_DetailScreenPage homeSreenDetailScreenPage = new HomeSreen_DetailScreenPage();


    @When("She checks the price of {string} of the product Sauce Labs Bike Light")
    public void sheChecksThePriceOfOfTheProductSauceLabsBikeLight(String Price) {
        Assert.assertEquals(Price, homeSreenDetailScreenPage.getPriceOnHomeScreen());
    }


    @And("Clicks on the title of the Product")
    public void clicksOnTheTitleOfTheProduct() {
        homeSreenDetailScreenPage.clickOnTitle();
        Assert.assertTrue(homeSreenDetailScreenPage.backToProduct.isDisplayed());
    }

    @Then("She can verify the price on the details screen matches the price in home screen")
    public void sheCanVerifyThePriceOnTheDetailsScreenMatchesThePriceInHomeScreen() {
        Assert.assertEquals("$9.99", homeSreenDetailScreenPage.getPriceOnDetailsScreen());
    }
}
