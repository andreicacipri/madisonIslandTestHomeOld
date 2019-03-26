package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer {
    public WebElement getLinksFromFooter(String listName,String subListName, WebDriver driver) {
        return driver.findElement(By.xpath(
                "//div[@class='links' and .//strong/span[text()='"+listName+"']]//a[text()='"+subListName+"']"));
    }
    public void clickOnFooterList(String listName,String subListName, WebDriver driver){
        getLinksFromFooter(listName,subListName,driver).click();
    }

    @FindBy(xpath = "//h1")
    private WebElement titlePage;

    public String checkPageTitle(){
        return titlePage.getText();
    }
}
