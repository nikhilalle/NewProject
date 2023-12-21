package com.matrix.AlleNikhil.selenium.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoPage {
    @Test
    public void newDemo (){
        System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        WebElement userName=driver.findElement(By.id("txtUsername"));

       userName.sendKeys("Admin");

       // Password Section

        WebElement passwordEnt=driver.findElement(By.id("txtPassword"));

        passwordEnt.sendKeys("admin123");

        // Button

        WebElement btnLogin=driver.findElement(By.className("button"));
        btnLogin.click();

    }
}
//Admin | Password : admin123 )

