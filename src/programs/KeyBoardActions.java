package programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class KeyBoardActions {
    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    @Test
    public void orangeHMRS() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//*[text()='My Info']")).click();
        Thread.sleep(5000);
        WebElement fName = driver.findElement(By.xpath("//*[@name='firstName']"));

        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(fName));
        fName.clear();

        actions = new Actions(driver);
        actions.moveToElement(fName).click().keyDown(Keys.SHIFT).sendKeys("nikhilesh").keyDown(Keys.SHIFT).build().perform();

        WebElement mName = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
        mName.clear();
        actions.moveToElement(mName).keyDown(Keys.SHIFT).sendKeys("alle").keyUp(Keys.SHIFT).sendKeys("Varma").keyUp(Keys.TAB).build().perform();
        WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lName.clear();
        actions.moveToElement(lName).sendKeys("Anirudha").keyDown(Keys.CLEAR).keyUp(Keys.CLEAR).keyDown(Keys.SPACE).keyUp(Keys.SPACE).keyDown(Keys.SHIFT).sendKeys("kota ch").keyUp(Keys.SHIFT).build().perform();


    }
}
