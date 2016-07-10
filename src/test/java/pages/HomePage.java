package pages;

import helpers.UIMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public HomePage(WebDriver webDriver, WebDriverWait webDriverWait){
        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        this.webDriver.get("http://www.seleniumhq.org/");
    }

    public WebElement navigationProjectButton(){
        return webDriver.findElement(By.id(UIMap.getValueByKey("homepage_navigation_projectsbutton")));
    }

    public WebElement navigationDownloadButton(){
        return webDriver.findElement(By.id(UIMap.getValueByKey("homepage_navigation_downloadbutton1")));
    }

}
