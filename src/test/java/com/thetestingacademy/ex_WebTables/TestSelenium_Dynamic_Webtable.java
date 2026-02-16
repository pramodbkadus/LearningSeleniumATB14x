package com.thetestingacademy.ex_WebTables;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_Dynamic_Webtable extends CommonToAll {

    @Test
    public void test_web_table(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        customWait(2);

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));

        //Rows and Columns
        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));

        for(int i=0; i< rows_tables.size(); i++){
            List<WebElement> columns = rows_tables.get(i).findElements(By.tagName("td"));
            for (WebElement col : columns){
                System.out.println(col.getText());
            }
        }

        driver.quit();
    }
}
