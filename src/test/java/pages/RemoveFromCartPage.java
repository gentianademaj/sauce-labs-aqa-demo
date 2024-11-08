package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class RemoveFromCartPage extends BasePage {

    @FindBy(id = "remove-sauce-labs-bike-light")
    public WebElement removeButton;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement addToCartButton;

    public void removeButton(){
        removeButton.click();
    }

    public void addToCartButton(){
        addToCartButton.isDisplayed();
    }


}
