package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;
import utilities.BasePage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class LoginStepDefs extends BasePage {
    LoginPage loginPage = new LoginPage();

    @Given("Maria is on the SauceDemo login page")
    public void mariaIsOnTheSauceDemoLoginPage() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("url"));
    }

    @When("The user enters {string} and {string}")
    public void theUserEntersAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/inventory.html"));
    }


    @When("She enters invalid credentials")
    public void sheEntersInvalidCredentials() {
        loginPage.login("standardasdasdas", "adaweaqwe");
    }

    @Then("She should see an error message")
    public void sheShouldSeeAnErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.errorMessage));
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
    }
}
