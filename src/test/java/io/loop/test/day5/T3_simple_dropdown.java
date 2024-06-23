package io.loop.test.day5;

import io.loop.test.utilities.WebDriverUtil;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class T3_simple_dropdown {


    //1. Open Chrome browse
    //2. Go to http://the-internet.herokuapp.com/dropdown
    //3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”

    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void dropDownTest(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // creat a dropdown
       // WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actual = dropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected,"Actual does not match expected");
    }
    }
