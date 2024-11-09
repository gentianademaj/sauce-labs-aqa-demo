package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SortingPage;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDefs extends BrowserUtils {

    SortingPage sortingPage = new SortingPage();

    @When("He clicks on the drop down sorting menu")
    public void heClicksOnTheDropDownSortingMenu() {
        sortingPage.sortButton.click();
    }

    @And("He sorts on {string} on Dropdown list")
    public void heSelectsOptionOnDropdownList(String value) throws InterruptedException {
        selectByValue(value, sortingPage.sortButton);
    }

    @Then("The products are shown accordingly")
    public void theProductsAreShownAccordingly() {
        // Get all product names from the page
        List<WebElement> inventoryElements = driver.findElements(By.cssSelector("div[data-test='inventory-item-name']"));
        List<String> actualNames = new ArrayList<>();

        for (WebElement item : inventoryElements) {
            String name = item.getText();
            actualNames.add(name);
            System.out.println(name);
        }

        // Create a sorted version of the list in descending order (Z-A)
        List<String> expectedNames = new ArrayList<>(actualNames);
        expectedNames.sort(Collections.reverseOrder());

        // Verify the actual order matches the expected sorted order
        Assert.assertEquals("Items are not sorted in descending order (Z-A)", expectedNames, actualNames);

    }
}
