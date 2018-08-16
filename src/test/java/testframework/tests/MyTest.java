package testframework.tests;

import org.testng.annotations.Test;

/**
 * created by FAMILY 16.08.2018
 */

public class MyTest extends BaseTest {


    @Test
    public void testSignUpBtn() throws InterruptedException {
        app.home.clickSignUpBtn();
    }

}

