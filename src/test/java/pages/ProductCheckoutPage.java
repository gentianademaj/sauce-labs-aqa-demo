package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class ProductCheckoutPage extends BasePage {

    @FindBy(id = "checkout")
    public WebElement checkOutButton;

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    @FindBy(id = "continue")
    public WebElement continueToCheckoutOverviewButton;

    @FindBy(css = "span[data-test='title']")
    public WebElement checkoutOverviewTitle;

    @FindBy(id = "finish")
    public WebElement finishButtonCheckout;

    @FindBy(xpath = "//*[@id='checkout_complete_container']/h2")
    public WebElement thankYouForYourOrderMessage;

    public void clickCheckoutButton() {
        checkOutButton.click();
    }

    public void fillInCheckoutInfo(String name, String surname, String zipCode) {
        firstName.sendKeys(name);
        lastName.sendKeys(surname);
        postalCode.sendKeys(zipCode);
    }

    public void clickOnContinueButton() {
        continueToCheckoutOverviewButton.click();
    }

    public void clickOnFinishButton() {
        finishButtonCheckout.click();
    }

}
