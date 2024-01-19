package AlleNikhil.NikhilDec;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class XcelSheetDataProvider {
    //  String paath = System.getProperty("user.dir") + "\\NikhilDec\\";
    WebDriver driver;
    @Test(dataProvider = "Nikhil")
    public void TakeDetails(String browser, String dataSet) {
        System.out.println("BROWSER Name  :  " + browser);
        System.out.println("Details       :  " + dataSet);
        String[] value = dataSet.splite(",");
        String id = value[0];
        String pawrd = value[1];
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("fireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        System.out.println("Browser open     " + browser + " " +
                "  Open in User name like    " + id +
                "  Open in Password  name like    " + pawrd);
        System.out.println("--------------");
        userName.sendKeys(id);
        password.sendKeys(pawrd);
        loginBtn.click();
        driver.close();
    }

    @DataProvider(name = "Nikhil")
    public String[][] getDate() throws IOException {
        String[][] data = null;
        try {
            File file = new File("N:\\NewProject\\src\\AlleNikhil\\NikhilDec\\DataSheet.xlsx");
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int row = sheet.getPhysicalNumberOfRows(); // Number of Row in Sheet
            System.out.println(row);
            int column = sheet.getRow(0).getPhysicalNumberOfCells();  // Number of Column in Sheet
            System.out.println(row);
            data = new String[row - 1][column - 1];  // Number of Row-1 ie Title and  column -1  ie in Sheet
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < column; j++) {
                    String sheelData = sheet.getRow(i).getCell(j).getStringCellValue();
                    data[i - 1][j - 1] = sheelData;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }
}


