package AlleNikhil.programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class OrangeHRMS {
    WebDriver driver;
    By myActionBtn = By.xpath("//*[text()='My Actions']");
    By leveBtn = By.xpath("//*[@class='orangehrm-todo-list-item']//button[@class='oxd-icon-button oxd-icon-button--success orangehrm-report-icon']");
    By leavePage = By.xpath("//*[@class='oxd-table-filter-header-title']//*[text()='Leave List']");
    By empNameTxt = By.xpath("//*[@placeholder='Type for hints...']");
    By date = By.xpath("(//*[@class='oxd-date-input']//*[@placeholder='yyyy-mm-dd'])[1]");
    Actions actions = new Actions(driver);


    //    @BeforeMethod
//    public void actionMethods(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//
//
//    }
    @Test
    public void loginTheApp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        actions.moveToElement(driver.findElement(myActionBtn)).click().build().perform();
        actions.moveToElement(driver.findElement(leveBtn)).click().build().perform();
        String leavePageTxt = driver.findElement(leavePage).getText();
        String actualLeaveTxt = "Leave List";
        Assert.assertEquals(leavePageTxt, actualLeaveTxt);
        actions.moveToElement(driver.findElement(date)).doubleClick().sendKeys("11/09/2000").build().perform();
    }

    public static void main(String[] args) {
        OrangeHRMS orangeHRMS = new OrangeHRMS();
        orangeHRMS.loginTheApp();
    }
}
