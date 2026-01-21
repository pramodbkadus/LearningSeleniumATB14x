package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16_Mini_Project_2_Add_Extension {

    @Test
    public void project02() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--incognito");

        File path = new File("Path of the extension file");
        chromeOptions.addExtensions(path);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        Thread.sleep(10000);
        driver.quit();


    }
}
