//package AlleNikhil.NikhilDec;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
//import java.util.logging.Logger;
//
//public class DataProvider {
//    WebDriver driver;
//
//    @Test(dataProvider = "Nikhil")
//    public void TakeDetails(String browser, String dataSet) {
//        System.out.println("BROWSER Name  :  " + browser);
//        System.out.println("Details       :  " + dataSet);
//        String[] value = dataSet.split(",");
//
//        String id = value[0];
//        String pawrd = value[1];
//
//        if (browser.equalsIgnoreCase("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        if (browser.equalsIgnoreCase("fireFox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        }
//        if (browser.equalsIgnoreCase("edge")) {
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//        }
//
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
//
//        WebElement userName = driver.findElement(By.id("user-name"));
//        WebElement password = driver.findElement(By.id("password"));
//        WebElement loginBtn = driver.findElement(By.id("login-button"));
//
//        System.out.println("Browser open     " + browser + " " +
//                "  Open in User name like    " + id +
//                "  Open in Password  name like    " + pawrd);
//        System.out.println("--------------");
//        userName.sendKeys(id);
//        password.sendKeys(pawrd);
//        loginBtn.click();
//        driver.close();
//
//    }
//
//    @org.testng.annotations.DataProvider(name = "Nikhil")
//    public String[][] getDate() {
//        String[][] data = {
//                {"chrome", "standard_user,secret_sauce"},
//                {"fireFox", "standard_user,secret_sauce"},
//                {"edge", "standard_user,secret_sauce"},
//                {"chrome", "standard_user,secret_sauce"},
//        };
//        return data;
//    }
//
//}
