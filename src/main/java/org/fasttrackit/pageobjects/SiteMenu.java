package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteMenu {

    public WebElement getSiteMenuBar(int listNumber, WebDriver driver) {
        return driver.findElement(By.xpath(
                "//ol[@class='nav-primary']/li[" + listNumber + "]/a"));
    }
    public void selectSiteMenuBar(int listNumber, WebDriver driver){
        getSiteMenuBar(listNumber,driver).click();
    }
    @FindBy(css = "h1")
    private WebElement checkPage;


    public String  NameCheckPage(){
        return checkPage.getText();

    }
}