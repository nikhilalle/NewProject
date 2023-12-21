package com.matrix.AlleNikhil.newTestNg.testNGPrameter.prameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
    @Parameters({"Amazon site"})
    @Test
    public void driverLinkAmazon(String Amzn){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www."+Amzn+".com");
        driver.manage().window().maximize();
        System.out.println(" Amazon   Application   was   Opened    ");
        driver.quit();
    }
    @Parameters({"Facebook site"})
    @Test
    public void driverLinkFacebook(String facebk ){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www."+facebk+".com");
        driver.manage().window().maximize();
        System.out.println(" Facebook   Application   was   Opened    ");
        driver.quit();
    }
    @Parameters({"Instagram site"})
    @Test
    public void driverLinkInstagram(String insta){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www."+insta+".com");
        driver.manage().window().maximize();
        System.out.println(" Instagram   Application   was   Opened    ");
        driver.quit();
    }
}
