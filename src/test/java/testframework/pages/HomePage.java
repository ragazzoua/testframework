package testframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * created by FAMILY 16.08.2018
 */

public class HomePage extends BasePage {
    @FindBy(id = "btn-register")
    private WebElement signUpBtn;

	@FindBy(id = "btn-login")
	private WebElement loginBtn;


    public RegisterPage clickSignUpBtn() {
        signUpBtn.click();
        return new RegisterPage();
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
}
