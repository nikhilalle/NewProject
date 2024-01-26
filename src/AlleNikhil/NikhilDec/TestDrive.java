package AlleNikhil.NikhilDec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDrive {
    public void getTab(){
        java.lang.String path;
        path="Conputer";

        WebDriverManager.chromedriver().setup();
        WebDriver  driver=new ChromeDriver();
        driver.findElement(By.xpath("(//*[@class='header-menu']//*[@class='top-menu notmobile']//li//a[text()='"+path+"])"));
        driver.findElement(By.xpath("//div[@id='CardInstance21Yhx7NfNICoiw0pDi-NHQ']//a[@class='a-link-normal see-more truncate-1line'][normalize-space()='See more']"));
    }
}
