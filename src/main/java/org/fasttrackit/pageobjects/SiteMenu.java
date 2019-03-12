package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SiteMenu {

    public WebElement getSiteMenuBar(String nameCategories, WebDriver driver) {
        return driver.findElement(By.linkText(nameCategories));

    }
    public void selectSiteMenuBar(String nameCategories, WebDriver driver){
        getSiteMenuBar(nameCategories,driver).click();
    }
    @FindBy(css = "h1")
    private WebElement checkPage;


    public String  NameCheckPage(){
        return checkPage.getText();

    }

    public WebElement getAccountMenuBar(String nameSubCategories, WebDriver driver) {
        return driver.findElement(By.xpath("//div[@class='links']//a[@title='"+nameSubCategories+"']"));

    }
    public void selectAccountMenuBar(String nameSubCategories, WebDriver driver){
        getAccountMenuBar(nameSubCategories,driver).click();
    }
}