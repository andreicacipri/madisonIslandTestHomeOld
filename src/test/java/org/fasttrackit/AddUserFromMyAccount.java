package org.fasttrackit;

import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddUserFromMyAccount extends TestBase {
    @Test
    public void FourthScenario() {
        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']")).click();

        SiteMenu AccountMenu = PageFactory.initElements(driver, SiteMenu.class);
        String nameSubCategories = "My Account";

        AccountMenu.getAccountMenuBar(nameSubCategories,driver);
        AccountMenu.selectAccountMenuBar(nameSubCategories,driver);
        String currentPage = AccountMenu.getAccountMenuBar(nameSubCategories,driver).getAttribute("title");
        System.out.println("Opened "+currentPage+" page!");
        driver.findElement(By.xpath("//div[@class='col-1 new-users']//a[@title='Create an Account']")).click();
        String CreateAccountVariable ="CREATE AN ACCOUNT";
        String product = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        assertThat("Create an account page not opened",product,is(CreateAccountVariable.toUpperCase()));
        
    }

}
