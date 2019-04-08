package org.fasttrackit.MyAccountTests;

import org.fasttrackit.TestBase;
import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyAccountFromBottomPage extends TestBase {
   @Test
    public void FifthScenario() {
       Footer footerLinks = PageFactory.initElements(driver,Footer.class);
       String listName="Account";
       String subListName= "My Account";
       footerLinks.clickOnFooterList(listName,subListName,driver);
       System.out.println("Opened the "+subListName+" page");

       String pageTitle ="LOGIN OR CREATE AN ACCOUNT";

       String titlePage =  footerLinks.checkPageTitle();
       System.out.println(titlePage);
       assertThat("My account from bottom page not opened",titlePage.toUpperCase(),is(pageTitle.toUpperCase()));

   }
}
