package AlleNikhil.NikhilDec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import java.util.List;

import java.util.concurrent.TimeUnit;

public class MakeMyTripPriceCheck {
    WebDriver driver;

    @BeforeTest
    public void browserInti() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BOM-17/01/2024&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|D|DF|G|Generic|Generic-Generic_DT|DF_Generic_Exact|RSA|Offer3|673438880768");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void checkPrice() {
        List<WebElement> price = driver.findElements(By.xpath("//div[@class=\"priceSection \"]/div/div/div"));
        for (WebElement element : price) {
            String getEle = element.getText().replace("per adult", "").replace("₹", "").replace(",",  "");
            //System.out.println(getEle);
            List<String> stringList=new ArrayList<>(Integer.parseInt(getEle));
            System.out.println(stringList);


        }
    }
}
