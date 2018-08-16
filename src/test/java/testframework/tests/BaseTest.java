package testframework.tests;

import org.testng.annotations.AfterSuite;
import testframework.App;

/**
 * created by FAMILY 16.08.2018
 */

public class BaseTest {
    static App app = new App();

    @AfterSuite
    public void tearDown() {
        app.common.closeApp();
    }
}
