package com.matrix.nikhil.java.encapsulation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        DetailsPage page=new DetailsPage();
        page.getUserName("standard_user"); // Using Getter
        page.getPassword("secret_sauce");  // Using Getter

        driver.findElement(By.id("user-name")).sendKeys(page.setUserName()); // Using Setter Value Passed
        driver.findElement(By.id("password")).sendKeys(page.setPassword());   //Using Setter Value Passed
        driver.findElement(By.id("login-button")).click();


    }
}
