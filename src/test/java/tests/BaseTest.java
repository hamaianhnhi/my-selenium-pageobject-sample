package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeTest
    public void beforeTest(){
        System.out.printf(">>>>beforeTest");
        this.webDriver = new FirefoxDriver();
    }

    @AfterTest
    public void afterTest(){
        System.out.printf(">>>>afterTest");
        this.webDriver.quit();
    }

}
