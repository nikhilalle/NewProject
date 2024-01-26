//package AlleNikhil.NikhilDec;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.List;
//
//public class BrokenLinks {
//    @Test
//    public void driverLink() throws IOException {
//
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options=new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.meesho.com");
//        driver.manage().window().maximize();
//        System.out.println(" Amazon   Application   was   Opened    ");
//        List<WebElement> webElementsiLnkele=driver.findElements(By.xpath("//a"));
//        System.out.println(webElementsiLnkele.size());
//        for(WebElement allLinks:webElementsiLnkele){
//
//            java.lang.String Links= allLinks.getAttribute("href");
//            URL url=new URL(Links);
//            System.out.println(Links);
//            HttpURLConnection urlConnection=(HttpURLConnection) url.openConnection();
//            urlConnection.connect();
//           int getStatusCode=urlConnection.getResponseCode();
//           if(getStatusCode<400){
//               System.out.println(getStatusCode);
//               System.out.println("Valid Urls");
//           }
//           else {
//               System.out.println(getStatusCode);
//               System.out.println("In-Valid Urls");
//           }
//        }
//        driver.quit();
//    }
//}
