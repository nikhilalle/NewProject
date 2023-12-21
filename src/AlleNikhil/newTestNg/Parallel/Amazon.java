package com.matrix.AlleNikhil.newTestNg.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
    @Test
    public void driverLink(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.Amazon.com");
        driver.manage().window().maximize();
        System.out.println(" Amazon   Application   was   Opened    ");
        driver.quit();
    }
}
