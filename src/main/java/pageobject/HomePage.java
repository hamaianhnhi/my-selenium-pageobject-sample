package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    WebDriver webDriver;

    @FindBy(how = How.ID, using = "header")
    WebElement header;

    @FindBy(how = How.ID, using = "menu_projects")
    WebElement projectsButton;

    @FindBy(how = How.ID, using = "menu_download")
    WebElement downloadButton;

    @FindBy(how = How.ID, using = "menu_documentation")
    WebElement documentationButton;

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        this.webDriver.get("http://www.seleniumhq.org/");
    }

    public void clickOnProjectsButton(){
        projectsButton.click();
    }

    public void clickOnDownloadButton(){
        downloadButton.click();
    }

}
