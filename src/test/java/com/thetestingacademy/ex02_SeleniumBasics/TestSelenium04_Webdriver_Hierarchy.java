package com.thetestingacademy.ex02_SeleniumBasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium04_Webdriver_Hierarchy {
    public static void main(String[] args) {
        // Webdriver hierarcy
        // SearchContext(I) -> WebDriver(I)(~10) -> RemoteWebDriver(C)(~15)
        //                  -> ChromiunDriver(C)(~25) -> EdgeDriver(C)(~45)
        // SearchContext -> Interface -> findElements & findElement -> GGF
        // WebDriver -> Interface -> some incomplete functions -> GF
        // RemoteWebDriver -> Class -> It also has some functions -> F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver class -> S

//        SearchContext driver = new FirefoxDriver();
//        SearchContext driver1 = new ChromeDriver();
//        SearchContext driver2 = new EdgeDriver();

//        WebDriver driver = new FirefoxDriver();
//        RemoteWebDriver driver1 = new FirefoxDriver();
//        FirefoxDriver driver2 = new FirefoxDriver();

        // Scenarios
        // 1. Do want to run on only chrome or Edge?

//        ChromeDriver driver = new ChromeDriver();
//        EdgeDriver driver1 = new EdgeDriver();

        // 2. Do you want to run on Chrome then change to Edge? -> widely used

        WebDriver driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver = new EdgeDriver();
        driver = new SafariDriver();

        // 3. Do you want to rune on mulitple browsers, AWS machines(Remote)?
        // RemoteWebDriver driver (with GRID) -> Advance (Last 2 sessions)
    }
}
