package AlleNikhil.TestAll.testNg.dataProviderTest;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StudentDataProvider {
    @Test(dataProvider = "Data")
    public void get(String name, String surName) {
        System.out.println(name);

        System.out.println("------------");
    }
@DataProvider(name = "Data")
    public Object[] set() {
        Object[][] studDeta = {{"Nikhil", "Kota"},
                {"Shri", "Alle"},
                {"Nikhil", "Alle"},
                {"Pratham", "Alle"},
                {"Rohit", "Mykoti"},
                {"Harika", "Machccha"},
                {"Rahul", "Dasari"}

        };
        return studDeta;

    }
}
