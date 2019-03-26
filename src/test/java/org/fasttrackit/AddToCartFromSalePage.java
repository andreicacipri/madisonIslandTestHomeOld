package org.fasttrackit;

import org.fasttrackit.pageobjects.ProductsGrid;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddToCartFromSalePage extends TestBase {
    @Test
    public void FirstScenario() {
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameCategories = "SALE";
        siteMenu.getSiteMenuBar(nameCategories, driver);
        siteMenu.selectSiteMenuBar(nameCategories, driver);
        String selected = siteMenu.getSiteMenuBar(nameCategories, driver).getText();
        System.out.println("Opened " +selected+" page");
        ProductsGrid addToCart = PageFactory.initElements(driver, ProductsGrid.class);
        String productName = "Park Row Throw";
        driver.manage().timeouts().implicitlyWait(AppConfig.getTimeout(), TimeUnit.SECONDS);
        addToCart.getAddToCartButton(productName,driver);
        addToCart.addProductToCart(productName,driver);

        driver.manage().timeouts().implicitlyWait(AppConfig.getTimeout(), TimeUnit.SECONDS);
        String product = driver.findElement(By.xpath("//tbody //tr//td//h2//a")).getText();
        assertThat("Add to cart not succeeded",product,is(productName.toUpperCase()));
    }
}

