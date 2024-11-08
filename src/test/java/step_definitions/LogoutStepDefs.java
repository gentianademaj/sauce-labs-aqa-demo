package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class LogoutStepDefs {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("Matt is a valid user of SauceDemo")
    public void matt_is_a_valid_user_of_sauce_demo() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("inventory"));
    }

    @When("He navigates to the burger menu")
    public void he_navigates_to_the_burger_menu() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutPage.burgerMenuButton));
        logoutPage.burgerMenuButton.click();
        //Assert.assertTrue(logoutPage.logoutButton.isDisplayed());
    }

    @Then("He should be able to logout")
    public void he_should_be_able_to_logout() {
        wait.until(ExpectedConditions.visibilityOf(logoutPage.logoutButton));
        logoutPage.logoutButton.click();
        Assert.assertEquals(ConfigurationReader.getProperty("url"), Driver.getDriver().getCurrentUrl());
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
        Driver.getDriver().quit();
    }
}
