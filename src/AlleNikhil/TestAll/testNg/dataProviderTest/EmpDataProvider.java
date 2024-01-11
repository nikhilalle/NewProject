package AlleNikhil.TestAll.testNg.dataProviderTest;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EmpDataProvider {

    @Test(dataProvider="A")
    public void details(int id ,String Name,int dob,String desigination){
        System.out.println(id);
        System.out.println(Name);
        System.out.println(desigination);
        System.out.println(dob);
    }
    @DataProvider(name ="A")
    public Object[][] deta(){
        Object [] [] obj={
                {101,"Nikhil", 18,"BA"},
                {102,"Chaitanya", 19,"QA"}
        };
        return obj;
    }

    @Test(dataProvider = "userDetails")
    public void get(String name,String surName){
        System.out.println(name);
        System.out.println(surName);
    }
    @DataProvider(name = "userDetails")
    public Object[][] details() throws IOException {
        File file = new File("N:\\NewProject\\src\\AlleNikhil\\abc.xlsx");
        FileInputStream fin = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fin);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int row = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();
        Object[][] object = new Object[row][columns];

        for (int i = 0; i <= row - 1 ; i++) {
            for (int j = 0; j <= columns -1 ; j++) {

                DataFormatter formatter=new DataFormatter();
                object [i][j] =formatter.formatCellValue(sheet.getRow(i+1).getCell(j));

            }
        } return object;



    }
}
