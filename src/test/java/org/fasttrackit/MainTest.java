package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

        @Test

        public void  addInWishList() {

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://carrefour.ro/electronice-electrocasnice/tv-audio-home-cinema/televizoare-accesorii");



        }

    }

