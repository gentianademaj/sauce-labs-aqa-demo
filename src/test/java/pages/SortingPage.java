package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class SortingPage extends BasePage {

    @FindBy(css = "select[data-test='product-sort-container']")
    public WebElement sortButton;

    @FindBy(css = "div[data-test='inventory-item-name']")
    public WebElement inventoryItemName;
}
