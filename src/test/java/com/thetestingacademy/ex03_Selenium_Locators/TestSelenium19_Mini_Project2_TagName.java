package com.thetestingacademy.ex03_Selenium_Locators;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_Mini_Project2_TagName extends CommonToAll {

    @Description("Verify that error message comes with invalid email on signup page")
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Pramod Kadus")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com");

        WebElement linkText = driver.findElement(By.linkText("Start a free trial"));
        linkText.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkboxPolicy = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkboxPolicy.click();

        WebElement buttonCreateAcc = driver.findElement(By.tagName("button"));
        buttonCreateAcc.click();

        WebElement errorMessage = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errorMessage.getText(), "The email address you entered is incorrect.");


        closeBrowser(driver);
    }
}
