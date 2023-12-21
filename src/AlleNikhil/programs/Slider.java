package AlleNikhil.programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Slider {
    WebDriver driver;

    @Test
    public void actionEventOccured() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Slider.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']//a"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
        ((Actions) action).perform();
    }

    @Test
    public void actionEventOccured2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/slider/");
        Thread.sleep(3000);
        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']//*"));

        for (int i = 1; i <= 4; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }

}
