package tests;

import helpers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest {

    private WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        webDriver = WebDriverFactory.configWebDriver();
    }


    @AfterMethod
    public void tearDown(){
        webDriver.quit();
    }

    @Test
    public void test3(){
        System.out.println(">>>>test1");
        HomePage homePage = new HomePage(webDriver);
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
        HomePage  homePage = new HomePage(webDriver);
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
