package AlleNikhil.programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardActions {
    WebDriver driver;
    Actions actions;
    //WebDriverWait wait;

    @Test
    public void orangeHMRS() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        element.clear();
        element.sendKeys("Admin");
        element.click();

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//*[text()='My Info']")).click();

        WebElement fName = driver.findElement(By.xpath("//*[@name='firstName']"));


        actions = new Actions(driver);


        actions.moveToElement(fName).keyDown(Keys.SHIFT).sendKeys("allenikhilesh").keyUp(Keys.SHIFT).build().perform();

        WebElement mName = driver.findElement(By.xpath("//input[@placeholder='Middle Name']"));
      //  wait.until(ExpectedConditions.visibilityOf(mName));


        actions.moveToElement(mName).keyDown(Keys.SHIFT).sendKeys("kota alle").keyUp(Keys.SHIFT).moveToElement(mName)
                .sendKeys("Varma").build().perform();
        WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lName.clear();
        actions.moveToElement(lName).sendKeys("Anirudha").keyDown(Keys.CLEAR).keyUp(Keys.CLEAR)
                .keyDown(Keys.SPACE).keyUp(Keys.SPACE).keyDown(Keys.SHIFT).sendKeys("kota ch")
                .keyUp(Keys.SHIFT).build().perform();


    }
}
