package AlleNikhil.selenium.waitsConcept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class WaitConcept {
    By userName = By.id("user-name");
    By userPassword = By.id("password");
    By loginBtn = By.id("login-button");
    By sauceLabbackpack = By.id("add-to-cart-sauce-labs-backpack");
    By sauceLab1 = By.id("add-to-cart-sauce-labs-bike-light");
    By sauceLabtShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By sauceLab2 = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By sauceLab3 = By.id("add-to-cart-sauce-labs-onesie");
    By sauceLab4 = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    Wait<WebDriver> fluetWait;
    WebDriverWait wait;

    @Test
    public void addCartDetails() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().fullscreen();
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(userPassword).sendKeys("secret_sauce");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loginBtn)));
        driver.findElement(loginBtn).click();
        fluetWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Visible Element");
        String title = driver.getTitle();
        wait.until(ExpectedConditions.presenceOfElementLocated(sauceLabbackpack));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(sauceLab1));
        wait.until(ExpectedConditions.titleIs(title));
        fluetWait = new FluentWait<>(driver)
                .withMessage("I am here")
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2));
        driver.close();
    }
}
