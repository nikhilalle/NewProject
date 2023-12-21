

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class EmailReport {


    @Test
    public void addCartDetails() {


        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver", "D:\\Chrome New\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket' and @name='remove-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Shri");
        driver.findElement(By.id("last-name")).sendKeys("Alle");
        driver.findElement(By.id("postal-code")).sendKeys("413005");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        // Checking For CHECKOUT: COMPLETE or not

        WebElement checkoutComplete = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
        System.out.println(checkoutComplete.getText());
        String actualResult = checkoutComplete.getText();
        String exceptedResult = "Thank you for your order!";
        System.out.println();
        Assert.assertEquals(exceptedResult, actualResult);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String formattedDate = sdf. format(date);
        System. out. println(formattedDate);
        driver.close();


    }
}
