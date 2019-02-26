package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ViewAs {
    @Test
    public void SeventhScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.xpath("//ol[@class='nav-primary']/li[last()]/a")).click();
        driver.findElement(By.xpath("//p[@class='view-mode']//a[@class='list']")).click();

        String currentView = "List";

        String listView = driver.findElement(By.xpath("//div[@class='toolbar']//p/strong[@title='List']")).getText();


        assertThat("Succes messege is not display", currentView, is(listView));

    }
}
