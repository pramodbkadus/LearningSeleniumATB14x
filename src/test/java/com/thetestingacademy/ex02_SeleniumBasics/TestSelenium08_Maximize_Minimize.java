package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {

    @Test
    public void test_1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.manage().window().maximize();
        //driver.manage().window().minimize();

        Thread.sleep(5000);
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();

    }
}
