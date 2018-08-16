package testframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * created by FAMILY 16.08.2018
 */

public class HomePage extends BasePage {
    @FindBy(id = "btn-register")
    private WebElement signUpBtn;

    public void clickSignUpBtn() {
        signUpBtn.click();
    }
}
