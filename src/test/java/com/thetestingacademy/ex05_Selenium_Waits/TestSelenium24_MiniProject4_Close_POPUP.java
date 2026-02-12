package com.thetestingacademy.ex05_Selenium_Waits;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProject4_Close_POPUP extends CommonToAll {

    @Description("Verify user can close the modal/pop-up on makeMyTrip page")
    @Test
    public void testClosePopupMakeMyTrip(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        waitForVisibility(driver,3,"//span[@class='commonModal__close']");

        WebElement closePopupButton = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        closePopupButton.click();

        driver.quit();


    }
}
