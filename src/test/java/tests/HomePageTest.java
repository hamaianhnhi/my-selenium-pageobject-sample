package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class HomePageTest {

    @Test
    public void testThatUserShouldBeAbleToClickOnProjectsButton(){
        WebDriver webDriver = new FirefoxDriver();
        HomePage  homePage = new HomePage(webDriver);
        homePage.navigationDownLoadButton().click();
        webDriver.quit();
    }

    @Test
    public void abc(){
        WebDriver webDriver = new FirefoxDriver();
        HomePage  homePage = new HomePage(webDriver);
        homePage.navigationDownLoadButton().click();
        webDriver.quit();
    }

}
