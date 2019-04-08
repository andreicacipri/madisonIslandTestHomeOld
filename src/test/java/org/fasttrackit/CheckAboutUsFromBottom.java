package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckAboutUsFromBottom extends TestBase {
@Test
    public void AboutUsFromCompanySubcategory(){

        Footer footerLinks = PageFactory.initElements(driver,Footer.class);
        String listName="Company";
        String subListName= "About Us";
        footerLinks.clickOnFooterList(listName,subListName,driver);
        System.out.println("Opened the "+subListName+" page");

        String pageTitle ="Our Story";

        String titlePage = driver.findElement(By.xpath("//div[@class='page-head']/h3")).getText();
        System.out.println(titlePage);
        assertThat("About Us from bottom page not opened",titlePage.toUpperCase(),is(pageTitle.toUpperCase()));

    }
    }

