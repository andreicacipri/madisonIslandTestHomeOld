package org.fasttrackit.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetails {

    public WebElement getDetailsBottomMenu(String productDetail, WebDriver driver) {
        return driver.findElement(By.xpath(
                "//ul[@class='toggle-tabs' and //li]//span[text()='" + productDetail + "']"));
    }
    public void clickOnDetailsBottomMenu(String productDetail, WebDriver driver){
        getDetailsBottomMenu(productDetail,driver).click();
    }
    public WebElement getAddToWishlistOrCompare(String WishlistOrCompare, WebDriver driver) {
        return driver.findElement(By.xpath(
                "//ul[@class='add-to-links' and .//li]//a[text()='"+WishlistOrCompare+"']"));
    }
    public void clickOnAddToWishlistOrCompare(String WishlistOrCompare, WebDriver driver){
        getAddToWishlistOrCompare(WishlistOrCompare,driver).click();
    }
}
