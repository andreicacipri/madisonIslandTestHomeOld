package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckRegisterPage {
    @Test
    public void SecondScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//div[@class='account-cart-wrapper']//span[@class='label']")).click();
        driver.findElement(By.xpath("//div[@class='links']//a[@title='Register']")).click();
        String CreateAccountVariable ="Please enter the following information to create your account.";

        String product = driver.findElement(By.xpath("//div[@class='account-create']//div[@class='fieldset']//p")).getText();
        assertThat("Succes messege is not display",product,is(CreateAccountVariable));

    }
}

