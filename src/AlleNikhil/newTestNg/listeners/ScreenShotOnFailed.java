package AlleNikhil.newTestNg.listeners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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

public class ScreenShotOnFailed {
    WebDriver driver;
    SimpleDateFormat sim=new SimpleDateFormat("yyyy-mm-yy-ss-mm-hh");
    String date=sim.format(new Date());
    @Test
    public void driverLink(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.Instagram.com");
        driver.manage().window().setSize(new Dimension(2300,324));

        System.out.println("    Size of Instagram   " + driver.manage().window().getSize());
        System.out.println(" Instagram   Application   was   Opened    ");
        Assert.assertEquals(12,32);
        driver.quit();
    }
    @AfterMethod

    public void takeScreenShot(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE){
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File("N:\\NewProject\\src\\AlleNikhil\\newTestNg\\listeners\\screenShots" + date + ".jpg");
            FileUtils.copyFile(source, destination);
        }
    }
}
