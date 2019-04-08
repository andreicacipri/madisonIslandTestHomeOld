package org.fasttrackit.ViewsTests;

import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderAndReturns extends TestBase {
    @Test
    public void SixthScenario() {
        Footer footerLinks = PageFactory.initElements(driver,Footer.class);
        String listName="Account";
        String subListName= "Orders and Returns";
        footerLinks.clickOnFooterList(listName,subListName,driver);
        System.out.println("Opened the "+subListName+" page");

        String pageTitle ="ORDERS AND RETURNS";

        String titlePage =  footerLinks.checkPageTitle();
        System.out.println(titlePage);
        assertThat("Order and returns page not opened.",titlePage.toUpperCase(),is(pageTitle.toUpperCase()));

    }
}

