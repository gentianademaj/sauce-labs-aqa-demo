package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BasePage;

public class MultipleProductsOnCartPage extends BasePage {

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    public WebElement addBackpackToCart;

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addBikeLightToCart;

    @FindBy (id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement addTshirtToCart;

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeSauceLabBikeLight;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    public WebElement removeSauceTShirt;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeSauceBackpack;

    public void addProductsToCart (){
        wait.until(ExpectedConditions.elementToBeClickable(addBackpackToCart));
        addBackpackToCart.click();
        addBikeLightToCart.click();
        addTshirtToCart.click();
    }

    public void removeItemsFromCart(){
        wait.until(ExpectedConditions.elementToBeClickable(removeSauceLabBikeLight));
        removeSauceLabBikeLight.click();
        removeSauceTShirt.click();
        removeSauceBackpack.click();
    }
}
