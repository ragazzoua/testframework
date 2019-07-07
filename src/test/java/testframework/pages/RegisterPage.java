package testframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * created by FAMILY 16.08.2018
 */

public class RegisterPage extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/form/div[6]/div")
    private WebElement checkMark;

    public void setCheckMark(boolean value) {
        if (!checkMark.isSelected() == value) {
            checkMark.click();
        }
    }
}
