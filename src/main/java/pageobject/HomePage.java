package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriver.get("http://www.seleniumhq.org/");
    }

    public WebElement navigationProjectButton(){
        return webDriver.findElement(By.id("menu_projects"));
    }

    public WebElement navigationDownLoadButton(){
        return webDriver.findElement(By.id("menu_download"));
    }

}
