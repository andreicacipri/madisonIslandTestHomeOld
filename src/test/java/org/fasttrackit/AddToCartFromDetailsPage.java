package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddToCartFromDetailsPage {
    @Test
    public void NinthScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//ol[@class='nav-primary']/li[last()-1]")).click();
        driver.findElement(By.xpath("//div[@class='col-main']//li//div[@class='actions']//a[@title='View Details']")).click();
        driver.findElement(By.xpath("//div[@class='product-options']/dl[@class='last']//div[@class='input-box']//ul[@id]/li[@class]//span[@class='swatch-label']")).click();
        driver.findElement(By.xpath("//ul[@id='configurable_swatch_size']/li[@id='option80']//span[@class='swatch-label']")).click();
        driver.findElement(By.xpath("//div[@class='add-to-cart']//button[@type='button']")).click();

        String productName ="Racer Back Maxi Dress";

        String product = driver.findElement(By.xpath("//tr[@class='first last odd']//h2[@class='product-name']//a[text()='"+productName+"']")).getText();
        assertThat("Succes messege is not display",product,is(productName.toUpperCase()));
    }
}
