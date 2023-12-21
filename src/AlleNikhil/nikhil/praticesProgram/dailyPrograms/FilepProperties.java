package com.matrix.nikhil.praticesProgram.dailyPrograms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FilepProperties {
    public void loginPage() throws IOException {


        File file=new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil.nikhil\\dailyPrograms\\config.properties");
        FileInputStream inputStream=new FileInputStream(file);
        Properties prob=new Properties();
        prob.load(inputStream);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys(prob.getProperty("userName"));
        driver.findElement(By.id("password")).sendKeys(prob.getProperty("password"));
        driver.findElement(By.id("login-button")).click();
        String element=driver.findElement(By.xpath("//*[@id='header_container']/div[2]/span")).getText();
        String exceptedValue="PRODUCTS";
        System.out.println(element);
        System.out.println(exceptedValue);
        Assert.assertEquals(exceptedValue,element);
    }

    public static void main(String[] args) throws IOException {
        FilepProperties fin=new FilepProperties();
        fin.loginPage();
    }
}
