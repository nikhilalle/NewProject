package AlleNikhil.newTestNg.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(  driver.findElement(loginBtn)));
        driver.findElement(loginBtn).click();


    }

}
