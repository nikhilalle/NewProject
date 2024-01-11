package AlleNikhil.newTestNg.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;

public class Page {
    By userName=By.id("user-name");
    By userPassword=By.id("password");
    By loginBtn=By.id("login-button");
    WebDriver driver;
    Page(WebDriver driver){
        this.driver=driver;
    }
    public void loginTheApplication(){
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(userPassword).sendKeys("secret_sauce");
        driver.findElement(loginBtn).click();
    }
}
