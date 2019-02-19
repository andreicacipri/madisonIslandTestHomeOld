package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountFromBottomPage {
   @Test
    public void FifthScenario() {
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://fasttrackit.org/selenium-test/");
       driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
   }
}
