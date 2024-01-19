package AlleNikhil.selenium.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FrameTest {
    @Test
    public void checkFrame() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("incognito");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.chase.com");
        List<WebElement> frameElement1 = driver.findElements(By.tagName("iframe"));
        System.out.println("Main page   No of Frames : " + frameElement1.size());
        WebElement btnSignIn = driver.findElement(By.xpath("//*[@data-pt-name='unknwnlogin']"));
        btnSignIn.click();
        List<WebElement> frameElement = driver.findElements(By.tagName("iframe"));
        System.out.println("Sign Up Page No of Frames : " + frameElement.size());

        // driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
        // driver.switchTo().frame(0); //using index - 1st frame
        //driver.switchTo().frame("logonbox"); // using name or id

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='logonbox']"))); // using Web Element

        driver.findElement(By.id("userId-text-input-field")).sendKeys("shriniwasalle");
        driver.findElement(By.id("password-text-input-field")).sendKeys("shriniwas123456");
        driver.findElement(By.xpath("//*[@id='signin-button']")).click();
    }

    @Test
    public void checkFrameOnSBrowserStack() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("incognito");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.browserstack.com/guide/handling-frames-in-selenium");
        List<WebElement> frameList = driver.findElements(By.xpath("//iframe"));
        System.out.println(" Frame of Size  " + frameList.size());
        for (WebElement element : frameList) {
            System.out.println(element.getSize());
            driver.switchTo().frame(frameList.get(0));
        }
    }


}
