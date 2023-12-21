package com.matrix.nikhil.programs.adminNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;

    }

    public void login(String mail,String password){

        WebElement userName = driver.findElement(By.id("Email"));
        userName.clear();
        userName.sendKeys(mail);

        WebElement userPassword = driver.findElement(By.name("Password"));
        userPassword.clear();
        userPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
    }
}
