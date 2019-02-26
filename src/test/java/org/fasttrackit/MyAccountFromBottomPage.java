package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyAccountFromBottomPage {
   @Test
    public void FifthScenario() {
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://fasttrackit.org/selenium-test/");
       driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();


      String CreateAccountVariable ="LOGIN OR CREATE AN ACCOUNT";

      String product = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
      assertThat("Succes messege is not display",product,is(CreateAccountVariable.toUpperCase()));
   }
}
