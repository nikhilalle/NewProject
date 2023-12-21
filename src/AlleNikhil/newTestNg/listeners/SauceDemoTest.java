package com.matrix.AlleNikhil.newTestNg.listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SauceDemoTest {
    SimpleDateFormat sim=new SimpleDateFormat("yyyy-mm-yy-ss-mm-hh");
    String date=sim.format(new Date());
    WebDriver driver;
    @Test
    public void loginApplication() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String actTitle="Swag Labs1";
        String exptTitle=driver.getTitle();
        System.out.println(actTitle);
        System.out.println(exptTitle);
        Assert.assertEquals(exptTitle,actTitle);

        System.out.println(date);
    }
    @AfterMethod
    public void statusApp(ITestResult result) throws IOException{
        if(result.getStatus()==ITestResult.FAILURE){
            TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
            File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination=new File("D:\\Java-June 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil\\newTestNg\\listeners\\screenShots"+date+".jpg");
            FileUtils.copyFile(source,destination);
            System.out.println(date);
            driver.quit();
        }
    }
}
