package com.thetestingacademy.ex08_SVGElements;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium30_SVG_Elements_Maps {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--maximize");
        driver = new ChromeDriver(chromeOptions);
    }

    @Description("Verify Tripura is present in the map and click to zoom it")
    @Test
    public void test_India_map_SVG(){

        String URL = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(URL);
        driver.manage().window().maximize();

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitJVM(3000);

        List<WebElement> statesList = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state : statesList){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }

        waitHelpers.waitJVM(3000);
        driver.quit();
    }




}
