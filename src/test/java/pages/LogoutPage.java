package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BasePage;

public class LogoutPage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    public WebElement burgerMenuButton;

    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutButton;

    public void navigateToLogout(){
        burgerMenuButton.click();
        logoutButton.click();
    }
}
