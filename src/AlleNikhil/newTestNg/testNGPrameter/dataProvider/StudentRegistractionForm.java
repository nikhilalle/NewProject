package com.matrix.AlleNikhil.newTestNg.testNGPrameter.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StudentRegistractionForm {

    @Test(dataProvider = "details")
    public void studentDetailsGet(int roll,String firstName,String lastName, int std,char div ){
        System.out.println("Student Roll Number :  " +roll);
        System.out.println("Student First Name  :  " +firstName);
        System.out.println("Student Last Name   :  " +lastName);
        System.out.println("Student Standard    :  " +std);
        System.out.println("Student Division    :  " +div);
        System.out.println();
        System.out.println("===========================");
        System.out.println();

    }
    @DataProvider(name = "details")
    public Object [][] detailsOfStudent(){
        Object obj[][]={{101,"Nikhl","Alle",10,'A'},
                {102,"Rahul","Dasari",12,'D'},
                {103,"Shri","Alle",15,'A'},
                {104,"Akash","Tordmalle",14,'C'},
                {105,"Akhit","Alle",13,'R'},
        };
        return obj;
    }

}
