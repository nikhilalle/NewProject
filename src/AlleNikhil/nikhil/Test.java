package AlleNikhil.nikhil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Test {

//    @org.testng.annotations.Test
//
//    WebDriver driver;
//
//   / By name=driver.findElement(By.xpath("//hgh"));
//
//    public void get(){
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(name));
//
//    }
    /*

    Find all substrings of a String in java
ABBC
a
ab
abb
abbc     */
    @org.testng.annotations.Test
    public void stringSub(){
        String name="ABBC";

        char ch;
        char ch1 ;
        String st=" ";
        for(int i=0;i<=name.length()-1;i++){
            for( int j=0;j<=i;j++){
                ch=name.charAt(j);
                System.out.print(ch);
            }


    }

}
@org.testng.annotations.Test
    public static void SubString()
    {
        String str="ABBC";
        int n=str.length();
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)

                // Please refer below article for details
                // of substr in Java
                // https://www.geeksforgeeks.org/java-lang-string-substring-java/
                System.out.println(str.substring(i, j));
    }

    @org.testng.annotations.Test
    public void hashCode1() {
        WebDriver driver;
        driver = new ChromeDriver();
        FluentWait wait = new FluentWait(driver);
//Specify the timout of the wait
        wait.withTimeout(Duration.ofSeconds(12));
//Sepcify polling time
        wait.pollingEvery(Duration.ofSeconds(12));
//Specify what exceptions to ignore


//This is how we specify the condition to wait on.
//This is what we will explore more in this chapter
        wait.until(ExpectedConditions.alertIsPresent());

    }

}


