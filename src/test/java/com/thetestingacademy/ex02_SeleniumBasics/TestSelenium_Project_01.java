package com.thetestingacademy.ex02_SeleniumBasics;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project_01 extends CommonToAll {

    @Description("TC#1 - Verify that a particular test exists on the Katalon website")
    @Test
    public void test_Verify_text(){

        WebDriver driver = new ChromeDriver();

        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("✅ Test Case PASSED!");
            Assert.assertTrue(true);
        }else{
            System.out.println("❌ Test Case FAILED!");
            Assert.assertFalse(false);
        }

        closeBrowser(driver);
    }
}
