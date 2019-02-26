package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckEveryScenario {
    @Test
    public void FirstScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("SALE")).click();
        driver.findElement(By.xpath("//div[@class='product-info']//button[@title='Add to Cart']")).click();

        String productName ="Park Row Throw";

        String product = driver.findElement(By.xpath("//tr[@class='first last odd']//h2[@class='product-name']")).getText();
        assertThat("Succes messege is not display",product,is(productName.toUpperCase()));
    }
}

