package programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    WebDriver driver;
    By dropPoint = By.xpath("//*[@id='droparea']");
    By elementDragarea = By.xpath("//*[@id='dragarea']");
    By elementMongo = By.xpath("//*[@id='mongo']");
    By elementNode = By.xpath("//*[@id='node']");

    @Test
    public void actionEventOccured() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement element1 = driver.findElement(elementDragarea);
        Actions action = new Actions(driver);
        WebElement element11 = driver.findElement(dropPoint);
        action.dragAndDrop(element1, element11).build().perform();
        WebElement element2 = driver.findElement(elementMongo);
        action.clickAndHold(element2).moveToElement(element11).release().build().perform();

        WebElement element3 = driver.findElement(elementNode);
        action.clickAndHold(element3).moveToElement(element11).release().build().perform();

        action.dragAndDrop(element2,element11).build().perform();

        action.clickAndHold(element3).moveToElement(element11).release().build().perform();

        ///    driver.quit();
    }

}
