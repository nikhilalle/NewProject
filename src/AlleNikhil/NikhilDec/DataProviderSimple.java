package AlleNikhil.NikhilDec;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSimple {
    @Test(dataProvider = "Abc")
    public void get(java.lang.String a, java.lang.String b) {
        System.out.println(a);
        System.out.println(b);
    }
    @DataProvider(name = "Abc")
    public java.lang.String[][] set() {
        java.lang.String[][] data = {
                {"Nikhil", "Alle"},
                {"Nikhilesh", "Alle"},
                {"Akhil", "Alle"},
                {"Shri", "Alle"},
                {"Ashish", "Alle"},
        };
        return data;

    }
    @Test(dataProvider = "Nikhil")
    public void ser(Object b, Object d){
        System.out.println(b);
        System.out.println(d);
    }
    @DataProvider(name = "Nikhil")
    public Object[][] getr(){
        Object [][]str= {
                {"Rakesh", "Nikhil"},
                {"Anil", "Rahul"},
                {"Rakhil", "Nikshant"},
                {"Lilly", "Alle"},
                {"Rothod", "Akil"},
        };
        return  str;
    }
}
