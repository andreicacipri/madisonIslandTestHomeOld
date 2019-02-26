package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    @Test

    public void  addInWishList() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("SALE")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.className("link-wishlist")).click();

    }
}
