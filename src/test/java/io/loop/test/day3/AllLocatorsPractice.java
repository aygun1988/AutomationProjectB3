package io.loop.test.day3;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {

    public static void main(String[] args) {

        //creat driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to loopcamp practice page
        http://loopcamp.vercel.app
        driver.get("https://loopcamp.vercel.app/registration_form.html");


        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Loop");

      // WebElement withClassName = driver.findElement(By.className("form-control"));
      // withClassName.sendKeys("Loop");


     //  WebElement lastnamewithClassName = driver.findElement(By.className("form-control"));
        // lastnamewithClassName.sendKeys(  "Academy");


        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Academy");

        WebElement female = driver.findElement(By.name("gender"));
        female.click();
    }
}
