package AlleNikhil.testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class IFrameHandle {
    WebDriver driver;

    @Test
    public void broswer() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.tagName("iframe"));
        System.out.println(element);
        driver.switchTo().frame(element);
        System.out.println("I am in In Side  Frame");
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        System.out.println("I am Out Side in Frame");

//       for (WebElement frameElement:element){
//           frameElement.getText();
//
//       }
    }

    @Test
    public void broswerWindows() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://indianrailways.gov.in/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        //Select Zonal Railway
        WebElement zonalRail = driver.findElement(By.xpath("//a[@title='Zonal Railways']"));
        actions.moveToElement(zonalRail).build().perform();
        Set<String> listOFWindow1 = driver.getWindowHandles();
        for (String l2 : listOFWindow1) {
            System.out.println("List Of   Windows    " + l2);
        }
        driver.findElement(By.xpath("//a[@title='Central Railway']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String singleWindow = driver.getWindowHandle();
        System.out.println("single  Window    " + singleWindow);
        Set<String> listOFWindow = driver.getWindowHandles();
        for (String l22 : listOFWindow) {
            System.out.println("List Of   Windows    " + l22);
        }

    }

}
