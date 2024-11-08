package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductCheckoutPage;

public class ProductCheckOutDefs {

    ProductCheckoutPage productCheckoutPage = new ProductCheckoutPage();


    @And("She click on the Checkout button")
    public void sheClickOnTheCheckoutButton() {
        productCheckoutPage.clickCheckoutButton();
    }

    @And("She fills out the Checkout form")
    public void sheFillsOutTheCheckoutForm() {
        productCheckoutPage.fillInCheckoutInfo("Demo", "Test", "10000");
    }

    @And("She clicks on Continue button")
    public void sheClicksOnContinueButton() {
        productCheckoutPage.clickOnContinueButton();

    }

    @Then("She validates the Checkout Overview page")
    public void sheValidatesTheCheckoutOverviewPage() {
        Assert.assertEquals("Checkout: Overview", productCheckoutPage.checkoutOverviewTitle.getText());
    }

    @When("She clicks on Finish button")
    public void sheClicksOnFinishButton(){
        productCheckoutPage.clickOnFinishButton();

    }

    @Then("She sees the Thank you for your order page")
    public void sheSeesTheThankYouForYourOrderPage() {
        Assert.assertEquals("Thank you for your order!", productCheckoutPage.thankYouForYourOrderMessage.getText());
    }
}
