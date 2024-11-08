package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class HomeSreen_DetailScreenPage extends BasePage {

    @FindBy(xpath = "//*[@id='item_0_title_link']/div")
    private WebElement titleOfProduct;

    @FindBy(xpath = "//*[@id='inventory_container']/div/div[2]/div[2]/div[2]/div")
    private WebElement priceHomeScreen;

    @FindBy(xpath = "//*[@id='inventory_item_container']/div/div/div[2]/div[3]")
    private WebElement priceDetailsScreen;

    @FindBy(id = "back-to-products")
    public WebElement backToProduct;


    public void clickOnTitle() {
        titleOfProduct.click();
    }

    public String getPriceOnHomeScreen() {
        return priceHomeScreen.getText();
    }

    public String getPriceOnDetailsScreen() {
        return priceDetailsScreen.getText();
    }
}
