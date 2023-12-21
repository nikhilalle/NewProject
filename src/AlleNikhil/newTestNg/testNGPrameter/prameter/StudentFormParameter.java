package com.matrix.AlleNikhil.newTestNg.testNGPrameter.prameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StudentFormParameter {
    @Parameters({"Student RollNO","Student Name","Student standard","Student Division"})
    @Test
    public void studentDetails(int roll,String name,@Optional("10") int std,char div){
        System.out.println("Roll Number :  "+roll);
        System.out.println("Name :  "+name);
        System.out.println("Standard :  "+std);
        System.out.println("Division "+div);

        System.out.println("---------------------");
    }
    @Parameters({"Marks on Maths","Marks on Physics","Marks on Chemistry","Marks on Biology", "Marks on English"})
    @Test
    public void studentMarks(int maths , int physics , int chem , int bio , @Optional ("100") int eng){
        System.out.println("Maths Marks  :  "+maths);
        System.out.println("Physics Marks  :  "+physics);
        System.out.println("Chemistry Marks  : "+chem);
        System.out.println("Biology Marks  : "+bio);
        System.out.println("English Marks  : "+eng);
    }
}
