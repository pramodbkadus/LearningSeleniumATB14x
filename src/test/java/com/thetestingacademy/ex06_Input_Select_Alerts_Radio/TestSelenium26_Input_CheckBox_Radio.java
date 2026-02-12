package com.thetestingacademy.ex06_Input_Select_Alerts_Radio;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium26_Input_CheckBox_Radio extends CommonToAll {

    @Description("Script to handle HTML Tags")
    @Test
    public void test_HTMLTags(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/practice.html");

        //INPUT BOX
        WebElement firstNameInputBox = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInputBox.sendKeys("the testing Academy");

        //RADIO BUTTON
        WebElement radioBox = driver.findElement(By.xpath("//input[@id='sex-0']"));
        radioBox.click();

        //CHECK BOX
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='profession-0']"));
        checkBox.click();

        closeBrowser(driver);
    }


}
