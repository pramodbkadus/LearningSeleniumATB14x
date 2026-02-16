package com.thetestingacademy.ex08_SVGElements;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium29_SVG_Element_Flipkart {

    @Test
    public void test_Filpkart_Search_SVG_Icon(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate
        String URL = "https://www.flipkart.com/search";
        driver.get(URL);

        //Enter product in search textbox
        WebElement search_input = driver.findElement(By.name("q"));
        search_input.sendKeys("macmini");

        //Click on search SVG icon
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.checkVisibility(driver, By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"),5000);

        //Get details of all the searched items
        List<WebElement> titlesResult = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for(WebElement title : titlesResult){
            System.out.println(title.getText());
        }

        waitHelpers.waitJVM(5000);
        driver.quit();

    }
}
