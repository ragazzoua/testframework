package testframework.steps;

import testframework.pages.BasePage;

/**
 * created by FAMILY 16.08.2018
 */

public class CommonSteps extends BasePage {

    public void closeApp(){
        driver.quit();
    }
}
