package AlleNikhil.newTestNg.grouping;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping {
    @Test (groups = "Nikhil")
    public void test1() {
        System.out.println("Test 1  Method : groups = Nikhil   ");
    }

    @Test (groups = "Akash")
    public void test2() {
        System.out.println("Test 2  Method :  groups = Akash  ");
    }

    @Test (groups = "Nikhil")
    public void test3() {
        System.out.println("Test 3  Method :  groups = Nikhil  ");
    }

    @Test ( groups = "Akash")
    public void test4() {
        System.out.println("Test 4  Method :  groups = Akash   ");
    }
    @Test(groups = "Shri")
    public void test5() {
        System.out.println("Test 5  Method : groups = Shri  ");
    }
    @Test(groups = "Nikhil")
    public void test6() {
        System.out.println("Test 6  Method :  groups = Nikhil  ");
    }

    @Test (groups = "Akash")
    public void test7() { System.out.println("Test 7  Method :  groups = Akash  ");
    }
    @Test(groups = {"Shri","Nikhil"})
    public void test8() {
        System.out.println("Test 8  Method : groups = Shri  ");
    }


}
