package AlleNikhil.programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;


public class ActionEvent {
    WebDriver driver;
    By simpleAlert = By.xpath("//button[@class='btn btn-danger']");
    By confBtn = By.xpath("//a[normalize-space()='Alert with OK & Cancel']");
    By conformAlert = By.xpath("//button[@class='btn btn-primary']");
    By promtBtn = By.xpath("//a[normalize-space()='Alert with Textbox']");
    By promtAlert = By.xpath("//button[@class='btn btn-info']");

    @Test
    public void actionEventOccured() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(simpleAlert).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();
        driver.findElement(confBtn).click();

        driver.findElement(conformAlert).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(4000);
        alert1.dismiss();
        driver.findElement(promtBtn).click();

        driver.findElement(promtAlert).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(4000);
        System.out.println(alert2.getText());

        alert2.sendKeys("Nikhilesh");
        alert2.accept();
        System.out.println("Successful Done");


    }
}
