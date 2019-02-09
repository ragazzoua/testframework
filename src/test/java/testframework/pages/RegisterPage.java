package testframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * created by FAMILY 16.08.2018
 */

public class RegisterPage extends BasePage {

    @FindBy(className = "checkmark")
    private WebElement checkMark;

    public void setCheckMark(boolean value) {
        if (!checkMark.isSelected() == value) {
            checkMark.click();
        }

    }
}
