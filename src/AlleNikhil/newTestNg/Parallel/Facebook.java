package com.matrix.AlleNikhil.newTestNg.Parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
    @Test
    public void driverLink(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().setSize(new Dimension(1080,1567));
        String size= String.valueOf(driver.manage().window().getSize());
        System.out.println("    Position of FACEBOOK   " +  driver.manage().window().getPosition());
        System.out.println("    Size of FACEBOOK   " + size);
        System.out.println(" facebook   Application   was   Opened    ");
        driver.quit();
    }
}
