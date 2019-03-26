package org.fasttrackit;

import org.fasttrackit.pageobjects.ProductDetails;
import org.fasttrackit.pageobjects.ProductsGrid;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class ReviewPageProduct extends TestBase {
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

        String reviewVariable ="CUSTOMER REVIEWS";

   //    String product = driver.findElement(By.xpath("//div[@class='review-heading']/h2")).getText();
   //    assertThat("Succes messege is not display",product,containsString(reviewVariable.toUpperCase()));

    }
}
