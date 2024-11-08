package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class AddToCartPage extends BasePage {

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-bike-light']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    public WebElement selectedProductName;

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeItemButton;

    public void addItemToCart() {
        addToCartButton.click();
    }

    public void goToCart() {
        cartButton.click();
    }

    public void removeItemFromCartDetails(){
        removeItemButton.click();
    }

}