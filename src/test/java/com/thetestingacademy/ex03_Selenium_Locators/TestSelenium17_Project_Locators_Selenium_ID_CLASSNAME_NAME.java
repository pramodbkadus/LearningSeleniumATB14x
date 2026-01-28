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
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME extends CommonToAll {

        @Description("TC#1 - Verify that with invalid login, error message is displayed!")
        @Owner("Pramod Kadus")
        @Severity(SeverityLevel.BLOCKER)
        @Test
        public void test_vwo_login_invalid_login(){
            // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
            // Step 2 - Find the Password and enter the 1234.
            // Step 3 - Find the Submit and click on the button.
            // Step 4 - Wait some time.
            // Step 5 - Verify the message error message.

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--incognito");

            WebDriver driver = new ChromeDriver(chromeOptions);
            openBrowser(driver, "https://app.vwo.com");

            WebElement email_input_box = driver.findElement(By.id("login-username"));
            email_input_box.sendKeys("admin@admin.com");

            WebElement password_input_box = driver.findElement(By.name("password"));
            password_input_box.sendKeys("admin@123");

            WebElement submit_button = driver.findElement(By.id("js-login-btn"));
            submit_button.click();

            customWait(3000);

            WebElement error_message = driver.findElement(By.className("notification-box-description"));
            System.out.println(error_message.getText());

            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

            closeBrowser(driver);
        }
}
