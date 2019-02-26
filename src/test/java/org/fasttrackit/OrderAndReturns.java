package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderAndReturns {
    @Test
    public void SixthScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//div[@class='footer']//a[@title='Orders and Returns']")).click();

        String CreateAccountVariable ="HOME / ORDER INFORMATION";
        String firstText = driver.findElement(By.xpath("//div[@class='breadcrumbs']/ul/li[1]/a")).getText();
        String secondText = driver.findElement(By.xpath("//div[@class='breadcrumbs']/ul/li[last()]/strong")).getText();
        String breadcrumbs = firstText+" / "+secondText;
        assertThat("Succes messege is not display",breadcrumbs,is(CreateAccountVariable));

    }
}

