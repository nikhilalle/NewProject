package com.matrix.AlleNikhil.newTestNg.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagram {
    @Test
    public void driverLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.Instagram.com");
        driver.manage().window().setSize(new Dimension(2300,324));

        System.out.println("    Size of Instagram   " + driver.manage().window().getSize());
        System.out.println(" Instagram   Application   was   Opened    ");
        driver.quit();
    }
}
