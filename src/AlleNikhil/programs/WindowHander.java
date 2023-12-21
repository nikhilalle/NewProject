package AlleNikhil.programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHander {
    WebDriver driver;

    @Test
    public void actionEventOccured() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[contains(text(),'Open Seperate Multiple Windows')]")).click();
        driver.findElement(By.xpath("(//*[@class='btn btn-info'])[2]")).click();
        String multiElemet = driver.getWindowHandle();
       System.out.println(multiElemet);
        Set<String> windowElements=driver.getWindowHandles();
       List<String> listOfWindows=new ArrayList<>(windowElements);
       for(String list:listOfWindows){
           System.out.println(listOfWindows);
       }
       driver.switchTo().window(listOfWindows.get(2));
       driver.findElement(By.xpath("//*[@id='selenium_webdriver']")).click();


//        driver.findElement(By.xpath("//*[@class='btn btn-info' and text ()='    click   ']")).click();
//        String elemet = driver.getWindowHandle();
//        System.out.println(elemet);
//        Set<String> window=driver.getWindowHandles();
//        List<String> list=new ArrayList<>(window);
//        for(String lists:list){
//            System.out.println(lists);
//        }
//        driver.switchTo().window(list.get(1));
//        driver.findElement(By.xpath("//*[text()='Watch the Videos']")).click();
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath("//*[@onclick='newwindow()']")).click();



    }
}