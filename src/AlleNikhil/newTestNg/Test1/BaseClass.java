package AlleNikhil.newTestNg.Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    WebDriver driver;
    public WebDriver getDriver(WebDriver driver){
        return driver;
    }
    public WebDriver broswer(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
       return driver;
    }
    public void tearDown(){
        driver.close();
    }
}
