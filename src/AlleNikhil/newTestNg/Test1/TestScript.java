package AlleNikhil.newTestNg.Test1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScript extends BaseClass  {

    @BeforeTest
    public void browerInti(){
       broswer();

    }
    @Test
    public void loginApplication(){
        Page page=new Page(getDriver(driver));
        page.loginTheApplication();
    }
    public void close(){
        tearDown();
    }

}
