import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobject.HomePage;


public class HomePage1Test {

    @Test
    public void testThatUserShouldBeAbleToClickOnProjectsButton(){
        WebDriver driver = new FirefoxDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        driver.quit();
    }

    @Test
    public void testThatUserShouldBeAbleToClickDownloadButton(){
        WebDriver driver = new FirefoxDriver();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        homePage.clickOnDownloadButton();
        homePage.clickOnProjectsButton();
        driver.quit();
    }
}
