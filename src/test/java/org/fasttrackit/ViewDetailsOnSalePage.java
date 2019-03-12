package org.fasttrackit;

import org.fasttrackit.pageobjects.ProductsGrid;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ViewDetailsOnSalePage extends TestBase {
    @Test
    public void EighthScenario() {
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameCategories = "SALE";
        siteMenu.getSiteMenuBar(nameCategories, driver);
        siteMenu.selectSiteMenuBar(nameCategories, driver);
        String selected = siteMenu.getSiteMenuBar(nameCategories, driver).getText();
        System.out.println("Opened " + selected + " page");

        ProductsGrid ViewDetails = PageFactory.initElements(driver, ProductsGrid.class);
        String productName = "Racer Back Maxi Dress";
        ViewDetails.getViewDetailsButton(productName, driver);
        ViewDetails.clickOnViewDetails(productName, driver);
        String selectedDetailsProduct = ViewDetails.HeaderCheckPage();
        System.out.println("Opened details page for " + selectedDetailsProduct + " .");
        assertThat("Succes messege is not display", selectedDetailsProduct, is(productName.toUpperCase()));
        driver.quit();
    }
}
