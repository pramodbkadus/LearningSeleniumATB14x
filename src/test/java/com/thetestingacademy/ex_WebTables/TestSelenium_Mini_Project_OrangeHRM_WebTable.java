package com.thetestingacademy.ex_WebTables;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_Mini_Project_OrangeHRM_WebTable extends CommonToAll {

    @Test
    public void test_OrangeHRM_Table_Details(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");

        customWait(2000);

        //Login
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Hacker@4321");

        WebElement login_Button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        login_Button.click();

        //Get Table details

        customWait(2000);

        //Xpath -> //div[@class='oxd-table orangehrm-employee-list']/div[@class='oxd-table-body']/div[@class='oxd-table-card']/div[@role='row']/div[@class='oxd-table-cell oxd-padding-cell']
        WebElement employeeList = driver.findElement(By.xpath("//div[@class='oxd-table orangehrm-employee-list']"));

        //Rows and Columns
        List<WebElement> rows_tables = driver.findElements(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[@class='oxd-table-body']/div[@class='oxd-table-card']/div[@role='row']"));

        for(int i=0; i< rows_tables.size(); i++){
            List<WebElement> columns = rows_tables.get(i).findElements(By.xpath("//div[@role='cell']"));
            for (WebElement column : columns){
                System.out.println(column.getText());
            }
        }

        driver.quit();
    }
}
