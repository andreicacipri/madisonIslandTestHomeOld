package org.fasttrackit;

import org.fasttrackit.pageobjects.Footer;
import org.fasttrackit.pageobjects.RegisterField;
import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterTest extends TestBase {
    @Test
    public void completeRegister() {
        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']")).click();

        SiteMenu AccountMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameSubCategories = "Register";

        AccountMenu.getAccountMenuBar(nameSubCategories,driver);
        AccountMenu.selectAccountMenuBar(nameSubCategories,driver);
        String currentPage = AccountMenu.getAccountMenuBar(nameSubCategories,driver).getAttribute("title");
        System.out.println("Opened "+currentPage+" page!");

        RegisterField  registerField = PageFactory.initElements(driver,RegisterField.class);
        String firstNameVar= "lu";
        String lastNameVar = "Codoblu";
        String emailAdressVar = "Carabaaelu@yahoo.com";
        String passwordVar ="car56pole";
        String confirmVar = passwordVar;

        registerField.completeRegister(firstNameVar,lastNameVar,emailAdressVar,passwordVar,confirmVar);
        Footer footerLinks = PageFactory.initElements(driver,Footer.class);
        String titlePage =  footerLinks.checkPageTitle();
        System.out.println(titlePage);
        String pageTitle ="MY DASHBOARD";
        assertThat("The register is incomplete",titlePage.toUpperCase(),is(pageTitle.toUpperCase()));
}

}