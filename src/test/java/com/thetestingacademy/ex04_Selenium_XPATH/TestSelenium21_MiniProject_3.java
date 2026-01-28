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

public class TestSelenium21_MiniProject_3 extends CommonToAll {

    @Owner("Pramod Kadus")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify Cura Healthcare login is working")
    @Test
    public void test_CHS_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointmentButton = driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]"));
        makeAppointmentButton.click();

        customWait(2000);

        WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        username.sendKeys("John Doe");

        //OR If ID or name tag is not available
        //List<WebElement> usernames = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        //usernames.get(1).sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

        customWait(2000);

        WebElement verifyText = driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']/h2"));

        Assert.assertEquals(verifyText.getText(),"Make Appointment");
        Assert.assertTrue(verifyText.isDisplayed());

        closeBrowser(driver);

    }
}
