package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    @Test
    public void completeRegister() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("firstname")).sendKeys("Cipri");
        driver.findElement(By.id("lastname")).sendKeys("Andreica");
        driver.findElement(By.id("email_address")).sendKeys("Andreica@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("cdsfa234");
        driver.findElement(By.id("confirmation")).sendKeys("cdsfa234");
        driver.findElement(By.id("is_subscribed")).click();
        driver.quit();
}
}
