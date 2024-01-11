package AlleNikhil.nikhil.programs.adminNopCommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPage extends com.matrix.AlleNikhil.selenium.adminNopCommerce.BasePage {
    @Test
    public void homeLogin(){
        WebDriver driver=webdriverLink();

        com.matrix.nikhil.programs.adminNopCommerce.LoginPage loginPage=new com.matrix.nikhil.programs.adminNopCommerce.LoginPage(driver);
        loginPage.login("admin@yourstore.com","admin");

    }
}
