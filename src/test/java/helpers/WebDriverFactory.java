package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static helpers.TestConfiguration.*;


public class WebDriverFactory {

    public static WebDriver configWebDriver() {
        WebDriver webDriverToReturn = null;
        if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
            webDriverToReturn = new FirefoxDriver();
        }

        if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", TestConfiguration.CHROME_DRIVER_PATH);
            webDriverToReturn = new ChromeDriver();
        }

        webDriverToReturn.manage().deleteAllCookies();
        webDriverToReturn.manage().timeouts().implicitlyWait(Integer.parseInt(
                TestConfiguration.TIME_OUT),
                TimeUnit.SECONDS);

        return webDriverToReturn;
    }

}
