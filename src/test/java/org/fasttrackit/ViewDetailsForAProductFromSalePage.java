package org.fasttrackit;

import org.fasttrackit.pageobjects.ProductsGrid;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ViewDetailsForAProductFromSalePage extends TestBase {
    @Test
    public void NinthScenario() {
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
        assertThat("Succes messege is not display",selectedDetailsProduct,is(productName.toUpperCase()));
        driver.quit();
     //  String product = driver.findElement(By.xpath("//tr[@class='first last odd']//h2[@class='product-name']//a[text()='"+productName+"']")).getText();
     //  assertThat("Succes messege is not display",product,is(productName.toUpperCase()));
         }
    }
