package com.thetestingacademy.ex06_Input_Select_Alerts_Radio;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium28_JS_Alerts extends CommonToAll {

    @Test
    public void test_JSAlerts() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        // JS ALERT
//        WebElement jsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
//        jsAlert.click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.alertIsPresent());
//
//        Alert alert1 = driver.switchTo().alert();
//        alert1.accept();
//
//        String jsAlertResult = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(jsAlertResult, "You successfully clicked an alert");

        // JS CONFIRM
//        WebElement jsConfirm = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
//        jsConfirm.click();
//
//        waitForAlertIsPresent(driver, 5);
//
//        Alert alert2 = driver.switchTo().alert();
//        alert2.accept();
        //alert2.dismiss();
//
//        String jsConfirmResult = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(jsConfirmResult, "You clicked: Ok");


        // JS PROMPT
        WebElement jsPrompt = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        jsPrompt.click();

        waitForAlertIsPresent(driver,5);

        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("PRAMOD");
        alert3.accept();

        String jsConfirmResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(jsConfirmResult, "You entered: PRAMOD");


        closeBrowser(driver);

    }
}
