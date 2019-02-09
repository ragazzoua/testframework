package testframework;

import testframework.steps.CommonSteps;
import testframework.steps.HomeSteps;

/**
 * created by FAMILY 16.08.2018
 */

public class App {
    public CommonSteps common;
    public HomeSteps home;


    public App() {
        common = new CommonSteps();
        home = new HomeSteps();
    }
}
