package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium14_Close_VS_Quit {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(5000);

        //driver.close();
        // driver.close() -> will close the current tab, not the session.
        // session id!=null

        driver.quit();
        // driver.quit() -> will close all the browser windows and ends the Webdriver session.

    }
}
