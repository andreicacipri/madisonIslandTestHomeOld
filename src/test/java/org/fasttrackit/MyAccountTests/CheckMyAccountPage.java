package org.fasttrackit.MyAccountTests;

import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.Footer;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckMyAccountPage extends TestBase {
    @Test
    public void ThirdScenario() {

        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']")).click();

        SiteMenu AccountMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameSubCategories = "My Account";
        AccountMenu.selectAccountMenuBar(nameSubCategories,driver);
        String currentPage = AccountMenu.getAccountMenuBar(nameSubCategories,driver).getAttribute("title");
        System.out.println("Opened "+currentPage+" page!");
        Footer footerLinks = PageFactory.initElements(driver,Footer.class);
        String titlePage =  footerLinks.checkPageTitle();
        System.out.println(titlePage);
        String pageTitle ="LOGIN OR CREATE AN ACCOUNT";
        assertThat("My Account page not display",titlePage.toUpperCase(),is(pageTitle.toUpperCase()));

    }
}

