//package AlleNikhil.TestAll;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//public class DataProvider {
//    By firstName = By.name("First_Name");
//    By lastName = By.name("Last_Name");
//
//    By emailId = By.name("Email_Id");
//    By mobileNumber = By.name("Mobile_Number");
//    By ADDRESS = By.name("Address");
//    By city = By.name("City");
//    By pinCode = By.name("Pin_Code");
//    By state = By.name("State");
//    By country = By.name("Country");
//
//    By HOBBIES = By.name("Other_Hobby");
//
//
//    @DataProvider(name = "userDetails")
//    public Object[][] details() throws IOException, FileNotFoundException {
//        File file = new File("D:\\JAVA NEW 2022\\corejava-selenium-june22\\src\\main\\java\\com\\matrix\\AlleNikhil.nikhil\\testNg\\dataProvider\\User_Details.xlsx");
//        FileInputStream fin = new FileInputStream(file);
//        XSSFWorkbook workbook = new XSSFWorkbook(fin);
//        XSSFSheet sheet = workbook.getSheet("Sheet1");
//        int row = sheet.getLastRowNum();
//        int columns = sheet.getRow(1).getLastCellNum();
//        Object[][] object = new Object[row][columns];
//
//        for (int i = 0; i <= row - 1; i++) {
//            for (int j = 0; j <= columns - 1; j++) {
//
//                DataFormatter formatter = new DataFormatter();
//                object[i][j] = formatter.formatCellValue(sheet.getRow(i + 1).getCell(j));
//
//            }
//        }
//        return object;
//
//
//        public void getDetails () {
//            WebDriver driver;
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            driver.findElement(firstName).sendKeys("");
//            driver.findElement(lastName).sendKeys("");
//            driver.findElement(emailId).sendKeys("");
//            driver.findElement(mobileNumber).sendKeys("");
//            driver.findElement(ADDRESS).sendKeys("");
//            driver.findElement(city).sendKeys("");
//            driver.findElement(pinCode).sendKeys("");
//            driver.findElement(state).sendKeys("");
//            driver.findElement(country).sendKeys("");
//            driver.findElement(HOBBIES).sendKeys("");
//
//
//        }
//
//    }
//}
//
//
