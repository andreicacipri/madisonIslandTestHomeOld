package org.fasttrackit.MainPageTests;
import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
public class CheckAccessoriesPage extends TestBase {

    @Test
    public void AccessoriesPage() {
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameCategories = "ACCESSORIES";
        siteMenu.selectSiteMenuBar(nameCategories, driver);
        String selected = siteMenu.getSiteMenuBar(nameCategories, driver).getText();
        System.out.println("Opened " +selected+" page");
        assertThat("AccesoriesPage not opened.",siteMenu.NameCheckPage(),is(selected.toUpperCase()));
        driver.quit();
    }
}
