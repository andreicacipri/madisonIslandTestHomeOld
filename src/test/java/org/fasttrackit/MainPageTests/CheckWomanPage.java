package org.fasttrackit.MainPageTests;

import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckWomanPage extends TestBase {

    @Test
    public void WomenPage() {
    SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
    String nameCategories = "WOMEN";
        siteMenu.selectSiteMenuBar(nameCategories, driver);

        System.out.println("Opened " +nameCategories+" page");
    assertThat("Woman Page not opened.",siteMenu.NameCheckPage(),is(nameCategories.toUpperCase()));
    driver.quit();
}
}
