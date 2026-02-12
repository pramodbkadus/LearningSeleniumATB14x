package com.thetestingacademy.ex06_Input_Select_Alerts_Radio;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium27_Select_Static_Dropdown extends CommonToAll {

    @Test
    public void test_Select(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/practice.html");

        WebElement element_Select = driver.findElement(By.xpath("//select[@id='continents']"));
        Select select = new Select(element_Select);
        select.selectByContainsVisibleText("North America");

        closeBrowser(driver);
    }
}
