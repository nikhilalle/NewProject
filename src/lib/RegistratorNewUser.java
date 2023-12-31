package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistratorNewUser extends ActionClass {
    WebDriver driver;

    By createNewUser=By.xpath("//*[@id='createAccountSubmit']");
    By firstAndLastName=By.id("ap_customer_name");
    By mobileNumber=By.className("a-form-label auth-mobile-label");
    By eMailId=By.xpath("//*[@for='ap_email']");
    By password=By.id("ap_password");
    By verifyMobileNumber=By.xpath("//*[@id='continue']");
    public RegistratorNewUser(WebDriver driver){
        driver=this.driver;
            }
            public void newUserRegistration() throws InterruptedException {
        Thread.sleep(5000);

                clickOnElement(driver, createNewUser);
            }
            public void setCreateNewUser() {
                type(driver, firstAndLastName, "Nikhilesh Alle");
                type(driver, mobileNumber, "7997008565");
                type(driver, eMailId, "nikhileshAlle18@gmail.com");
                type(driver, password, "Nikhil@1255");
            }
            public void setVerifyMobileNumber(){
        clickOnElement(driver,verifyMobileNumber);



            }
}
