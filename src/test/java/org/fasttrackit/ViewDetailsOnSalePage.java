package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ViewDetailsOnSalePage {
    @Test
    public void EighthScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//ol[@class='nav-primary']/li[last()-1]")).click();
        driver.findElement(By.xpath("//div[@class='col-main']//li//div[@class='actions']//a[@title='View Details']")).click();

        String descriptionVariable ="Description";

        String descriptionPage = driver.findElement(By.xpath("//div[@class='product-collateral toggle-content tabs']/ul/li/span")).getText();
        assertThat("Succes messege is not display",descriptionPage,containsString(descriptionVariable.toUpperCase()));

    }
}
