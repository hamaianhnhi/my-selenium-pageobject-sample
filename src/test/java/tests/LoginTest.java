package tests;

import helpers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    @BeforeMethod
    public void setUp(){
        webDriver = WebDriverFactory.configWebDriver();
        webDriverWait = WebDriverFactory.configWebDriverWait(this.webDriver);
    }


    @AfterMethod
    public void tearDown(){
        webDriver.quit();
    }

    @Test
    public void test3(){
        System.out.println(">>>>test1");
        HomePage homePage = new HomePage(webDriver, webDriverWait);
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
    }

    @Test
    public void test4(){
        System.out.println(">>>>test2");
        HomePage homePage = new HomePage(webDriver, webDriverWait);
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
        homePage.navigationDownloadButton().click();
    }

}
