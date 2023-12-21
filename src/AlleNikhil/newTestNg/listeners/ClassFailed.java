package com.matrix.AlleNikhil.newTestNg.listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Listeners(Test_Listeners.class)
public class ClassFailed {
    WebDriver driver;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
    String date = simpleDateFormat.format(new Date());
    @Test
    public void sauceDemoDetails(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Shri");
        driver.findElement(By.id("last-name")).sendKeys("Alle");
        driver.findElement(By.id("postal-code")).sendKeys("413005");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        WebElement checkoutComplete = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
        System.out.println(checkoutComplete.getText());
        String actualResult = checkoutComplete.getText();
        String exceptedResult = "Thank you for your orderxd!";
        Assert.assertEquals(exceptedResult, actualResult);
        driver.close();
    }
    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File("D:\\Java-June 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil\\newTestNg\\listeners" + date + ".jpg");
            FileUtils.copyFile(source, destination);
        }
    }

}
