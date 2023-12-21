package com.matrix.AlleNikhil.newTestNg.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
    @Test
    public void driverLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.Flipkart.com");
        driver.manage().window().fullscreen();
        System.out.println(" Flipkart   Application   was   Opened    ");
        driver.quit();
    }
}
