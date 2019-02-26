package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ReviewPageProduct {
    @Test
    public void TenScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//ol[@class='nav-primary']/li[last()-1]")).click();
        driver.findElement(By.xpath("//div[@class='col-main']//li//div[@class='actions']//a[@title='View Details']")).click();
        driver.findElement(By.xpath("//ul[@class='toggle-tabs']//li[@class='last']/span")).click();

        String reviewVariable ="CUSTOMER REVIEWS";

        String product = driver.findElement(By.xpath("//div[@class='review-heading']/h2")).getText();
        assertThat("Succes messege is not display",product,containsString(reviewVariable.toUpperCase()));

    }
}
