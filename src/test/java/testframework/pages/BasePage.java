package testframework.pages;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static testframework.common.Constants.BASE_URL;

/**
 * created by FAMILY 16.08.2018
 */

public class BasePage {
    protected static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
