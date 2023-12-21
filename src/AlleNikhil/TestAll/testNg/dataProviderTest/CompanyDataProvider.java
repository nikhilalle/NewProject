package AlleNikhil.TestAll.testNg.dataProviderTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CompanyDataProvider {
    static String companyName="Microsoft";
    @Test(dataProvider ="Abc")
    public void returnData(int id , String name , String fName){
        System.out.println(id);
        System.out.println(name);
        System.out.println(fName);
        System.out.println(companyName);
        System.out.println("========");
    }

    @DataProvider(name = "Abc")
    public Object[] givenData(){
        Object[][] data={{101,"Nikhilesh","Alle"},
                {102,"Nikhil", "Kota"},
                {103,"Shri", "Alle"},
                {104,"Nikhil", "Rama"},
                {105,"Pratham", "Alle"},
                {106,"Rohit", "Mykoti"},
                {107,"Harika", "Machccha"},
                {108,"Rahul", "Dasari"}
        };
        return data;

    }
}
