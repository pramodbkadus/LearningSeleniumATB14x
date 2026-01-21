package com.thetestingacademy.ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {

    @Description("Open the URL")
    @Test
    public void test_Selenium01(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");

        //AssertJ Assertions
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }
}
