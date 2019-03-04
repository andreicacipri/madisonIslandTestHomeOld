package org.fasttrackit;

import org.fasttrackit.pageobjects.SiteMenu;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddToCartFromDetailsPage extends TestBase {
    @Test
    public void NinthScenario() {
        SiteMenu siteMenu = PageFactory.initElements(driver, SiteMenu.class);
        int listNumber = 5;
        siteMenu.getSiteMenuBar(listNumber, driver);
        siteMenu.selectSiteMenuBar(listNumber, driver);
        String selected = siteMenu.getSiteMenuBar(listNumber, driver).getText();
        System.out.println(selected);
        System.out.println(siteMenu.NameCheckPage());
        assertThat("Succes messege is not display",siteMenu.NameCheckPage(),is(selected.toUpperCase()));



        //     driver.findElement(By.xpath("//div[@class='col-main']//li//div[@class='actions']//a[@title='View Details']")).click();
        //     driver.findElement(By.xpath("//div[@class='product-options']/dl[@class='last']//div[@class='input-box']//ul[@id]/li[@class]//span[@class='swatch-label']")).click();
        //     driver.findElement(By.xpath("//ul[@id='configurable_swatch_size']/li[@id='option80']//span[@class='swatch-label']")).click();
        //     driver.findElement(By.xpath("//div[@class='add-to-cart']//button[@type='button']")).click();

        //     String productName ="Racer Back Maxi Dress";

        //     String product = driver.findElement(By.xpath("//tr[@class='first last odd']//h2[@class='product-name']//a[text()='"+productName+"']")).getText();
        //     assertThat("Succes messege is not display",product,is(productName.toUpperCase()));
        // }
    }
}
