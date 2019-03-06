package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsGrid {

    @FindBy(css = "h2.product-name >a")
    private List<WebElement> productNameContainers;


    public List<WebElement> getProductNameContainers() {
        return productNameContainers;
    }

    public WebElement getAddToCartButton(String productName, WebDriver driver) {
        return driver.findElement(By.xpath(
                "//div[@class='product-info'and .//a[text()='" + productName + "']]//button[@title='Add to Cart']"));
    }
    public WebElement getViewDetailsButton(String productName, WebDriver driver) {
        return driver.findElement(By.xpath(
                "//div[@class='product-info'and .//a[@title='" + productName + "']]//a[@class='button']"));
    }
        public void addProductToCart(String productName, WebDriver driver){
            getAddToCartButton(productName,driver).click();
        }
    public void clickOnViewDetails(String productName, WebDriver driver){
        getViewDetailsButton(productName,driver).click();
    }
    @FindBy(css = ".h1")
    private WebElement checkPage;


    public String  HeaderCheckPage(){
        return checkPage.getText();

    }
}

