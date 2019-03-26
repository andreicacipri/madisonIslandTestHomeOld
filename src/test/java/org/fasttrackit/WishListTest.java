package org.fasttrackit;

import org.fasttrackit.pageobjects.ProductDetails;
import org.fasttrackit.pageobjects.ProductsGrid;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(Parameterized.class)
public class WishListTest extends TestBase {

    private String WishlistOrCompare;

    public WishListTest(String wishlistOrCompare) {
        WishlistOrCompare = wishlistOrCompare;
    }

    @Parameterized.Parameters

    public static List<String> data() {
        return Arrays.asList("Add to Compare", "Add to Wishlist");
    }

    @Test
    public void  addInWishList() {
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameCategories = "SALE";
        siteMenu.getSiteMenuBar(nameCategories, driver);
        siteMenu.selectSiteMenuBar(nameCategories, driver);
        String selected = siteMenu.getSiteMenuBar(nameCategories, driver).getText();
        System.out.println("Opened " +selected+" page");

        ProductsGrid ViewDetails = PageFactory.initElements(driver, ProductsGrid.class);
        String productName = "Racer Back Maxi Dress";
        ViewDetails.getViewDetailsButton(productName, driver);
        ViewDetails.clickOnViewDetails(productName, driver);
        String selectedDetailsProduct = ViewDetails.HeaderCheckPage();
        System.out.println("Opened details page for " + selectedDetailsProduct + " .");

        ProductDetails addToWishlistOrCompare = PageFactory.initElements(driver,ProductDetails.class);
        addToWishlistOrCompare.getAddToWishlistOrCompare(WishlistOrCompare,driver);
        addToWishlistOrCompare.clickOnAddToWishlistOrCompare(WishlistOrCompare, driver);

        if (WishlistOrCompare.equals("Add to Compare")){
            String selectedProduct = driver.findElement(By.xpath("//div[@id='messages_product_view']//li[@class='success-msg']//span")).getText();
            assertThat("The product has not been added to comparison list. ", selectedProduct, is("The product "+productName+" has been added to comparison list."));
            driver.quit();
        }
        else {
            String selectedProduct = driver.findElement(By.xpath("//div[@id='messages_product_view']//li[@class='success-msg']//span")).getText();
            assertThat("The product has not been added to Wishlist. ", selectedProduct, is(""+productName+" has been added to your wishlist. Click here to continue shopping."));
            driver.quit();
        }

    }
}
