package com.matrix.AlleNikhil.newTestNg.testNGPrameter.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CollegeForm {
    static String stdCollegeName="Mumbai University";
    @Test(dataProvider = "sata")
    /*

    @Test(dataProvider = "sata") in this statement we write in dataProvider = "sata"
    but actually dataProvider = "Details"  if we write wrong data Provider name then
    it will give TestNg Exceptions  so that
    getCollegeDetail  in this method is not executed because of Data Provider Name is Wrong Implementing
    i.e
     @Test(dataProvider = "sata")

     */

    public void getCollegeDetails( int roll,String firstName,String lastName, int std,char div){
        System.out.println("       Details Not Correct   in Data Provider           ");
        System.out.println("Student Roll Number :  " +roll);
        System.out.println("College Name        :   "+collegeName);
        System.out.println("Student First Name  :  " +firstName);
        System.out.println("Student Last Name   :  " +lastName);
        System.out.println("Student Standard    :  " +std);
        System.out.println("Student Division    :  " +div);
        System.out.println();
        System.out.println("===========================");
        System.out.println();
    }
    @DataProvider(name = "Details")
    public Object[][] setCollegeDetails() {
        Object[][] studentList = {{101, "Nikhl", "Alle", 10, 'A'},
                {102, "Rahul", "Dasari", 12, 'D'},
                {103, "Shri", "Alle", 15, 'A'},
                {104, "Akash", "Tordmalle", 14, 'C'},
                {105, "Akhit", "Alle", 13, 'R'}
        };
        return studentList;
    }
    static String collegeName="Pune University";
    @Test(dataProvider = "Details")
    public void collegeDetails( int roll,String firstName,String lastName, int std,char div){
        System.out.println("       Details Correct              ");
        System.out.println("Student Roll Number :  " +roll);
        System.out.println("College Name        :   "+collegeName);
        System.out.println("Student First Name  :  " +firstName);
        System.out.println("Student Last Name   :  " +lastName);
        System.out.println("Student Standard    :  " +std);
        System.out.println("Student Division    :  " +div);
        System.out.println();
        System.out.println("===========================");
        System.out.println();
    }
}
