package AlleNikhil.NikhilDec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PieChartPercentageCal {
    WebDriver driver;
    public void pieChartDataCalulactor(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_google_charts.asp");
        driver.manage().window().maximize();
        
    }

}
