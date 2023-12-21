//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class BaseClass extends com.matrix.AlleNikhil.selenium.assignments.assignment20_StockMarket.DetailsPage {
//    WebDriver driver;
//    String name, password;
//    @Test
//    public void data() throws IOException {
//        fileXl();
//        login(name,password);
//    }
////    public void intiBrowser() {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.get("https://www.saucedemo.com/");
////        driver.manage().window().maximize();
////
////    }
//    @Test(dataProvider = "xlData",dataProviderClass = com.matrix.AlleNikhil.selenium.assignments.assignment20_StockMarket.DetailsPage.class)
//    public void login(String userName,String password){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//
//        driver.manage().window().maximize();
//        driver.findElement(By.id("user-name")).sendKeys(userName);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.id("login-button")).click();
//        System.out.println(userName);
//        System.out.println(password);
//        System.out.println("____________");
//
//
//}
//}
//
