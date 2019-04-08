package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(Parameterized.class)
public class CompanySubCategoriesFromBottomPage extends TestBase {
    private String subListName;

    public CompanySubCategoriesFromBottomPage(String companySubcategoriesSelected) {
        subListName = companySubcategoriesSelected;
    }

    @Parameterized.Parameters

    public static List<String> data() {
        return Arrays.asList("Contact Us", "Customer Service", "Privacy Policy");
    }


    @Test
    public void CompanySubCategories() {
        Footer footerLinks = PageFactory.initElements(driver, Footer.class);
        String listName = "Company";
        footerLinks.clickOnFooterList(listName, subListName, driver);
        System.out.println("Opened the " + subListName + " page");


        String pageTitle = subListName;

        String titlePage = footerLinks.checkPageTitle();
        System.out.println(titlePage);
            assertThat(""+subListName+" page, from bottom page not opened", titlePage.toUpperCase(), is(pageTitle.toUpperCase()));
        }
    }
