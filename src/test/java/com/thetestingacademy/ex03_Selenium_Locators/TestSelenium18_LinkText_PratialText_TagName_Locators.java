package com.thetestingacademy.ex03_Selenium_Locators;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium18_LinkText_PratialText_TagName_Locators extends CommonToAll {

    @Description("Verify vwo create account negative TC")
    @Test
    public void test_login_vwo(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com");

//        WebElement linkText = driver.findElement(By.linkText("Start a free trial"));
//        linkText.click();

        WebElement partialLinkText = driver.findElement(By.partialLinkText("trial"));
        partialLinkText.click();

        closeBrowser(driver);


    }
}
