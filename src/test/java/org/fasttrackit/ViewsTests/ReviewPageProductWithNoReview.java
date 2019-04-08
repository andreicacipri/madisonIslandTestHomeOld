package org.fasttrackit.ViewsTests;

import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.ProductDetails;
import org.fasttrackit.pageobjects.ProductsGrid;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReviewPageProductWithNoReview extends TestBase {
    @Test
    public void TenScenario() {
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameCategories = "SALE";
        siteMenu.getSiteMenuBar(nameCategories, driver);
        siteMenu.selectSiteMenuBar(nameCategories, driver);
        String selected = siteMenu.getSiteMenuBar(nameCategories, driver).getText();
        System.out.println("Opened " +selected+" page");

        ProductsGrid ViewDetails = PageFactory.initElements(driver, ProductsGrid.class);
        String productName = "Slim fit Dobby Oxford Shirt";
        ViewDetails.getViewDetailsButton(productName,driver);
        ViewDetails.clickOnViewDetails(productName,driver);
        String selectedDetailsProduct= ViewDetails.HeaderCheckPage();
        System.out.println("Opened details page for " +selectedDetailsProduct+ " .");

        ProductDetails productDetails = PageFactory.initElements(driver,ProductDetails.class);
        String productDetail= "Reviews";
        productDetails.getDetailsBottomMenu(productDetail,driver);
        productDetails.clickOnDetailsBottomMenu(productDetail,driver);

        String reviewVariable ="Be the first to review this product";

       String product = driver.findElement(By.cssSelector("p.no-rating a")).getText();
        System.out.println(product);
       assertThat("Review field is not display",product.toUpperCase(),is(reviewVariable.toUpperCase()));

    }
}
