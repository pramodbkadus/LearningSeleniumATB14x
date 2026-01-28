package com.thetestingacademy.ex04_Selenium_XPATH;

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

public class TestSelenium20_MiniProject extends CommonToAll {

    @Owner("Pramod Kadus")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify OrangeHRM login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/hr/web/index.php/auth/login");

        customWait(2000);

        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='username']"));
        usernameTextBox.sendKeys("admin");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordTextBox.sendKeys("Hacker@4321");

        WebElement loginButton = driver.findElement(By.xpath("//button"));
        loginButton.click();

        customWait(2000);

        WebElement verfiyName = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));

        Assert.assertEquals(verfiyName.getText(),"PIM");

        closeBrowser(driver);
    }
}
