package programs;

import org.testng.annotations.Test;

public class StaticVariable {
    int rollNo;
    String name;
    static String schoolName="ABZ School";
    @Test
    public void get(){
        rollNo=12;
        name="Kota";
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(schoolName);
    }
    @Test
    public void get1(){
        rollNo=123;
        name="Nikhil";
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(schoolName);
    }
    @Test
    public void get33(){
        rollNo=123;
        name="Kota ch";
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(schoolName);
    }
    @Test
    public void get133(){
        rollNo=12333;
        name="Nikhil Alle";
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(schoolName);
    }
}
