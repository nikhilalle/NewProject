package com.matrix.nikhil.programs.adminNopCommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends BasePage {
    @Test
    public void homeLogin(){
        WebDriver driver=webdriverLink();

        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("admin@yourstore.com","admin");

    }
}
