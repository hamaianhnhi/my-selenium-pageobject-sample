package tests;

import helpers.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class HomePageTest {

    @Test
    public void test1(){
        System.out.println(">>>>test1");
        WebDriver webDriver = WebDriverFactory.configWebDriver();
        HomePage  homePage = new HomePage(webDriver);
        homePage.navigationDownLoadButton().click();
        webDriver.quit();
    }

    @Test
    public void test2(){
        System.out.println(">>>>test2");
        WebDriver webDriver = WebDriverFactory.configWebDriver();
        HomePage  homePage = new HomePage(webDriver);
        homePage.navigationDownLoadButton().click();
        webDriver.quit();
    }

}
