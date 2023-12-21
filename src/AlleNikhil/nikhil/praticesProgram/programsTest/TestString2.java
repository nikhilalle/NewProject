package com.matrix.nikhil.praticesProgram.programsTest;

public class TestString2 {
    public static void main(String[] args) {


        String str1 = new String("Nikhilesh");
        String str2 = new String("Nikhilesh");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("String Check :" + str1 == str2);

        String str3 = "Nikhil";
        String str4 = "Nikhil";

        System.out.println("Equal Check "+str1.equals(str2));
        System.out.println("Equal Check "+str3.equals(str4));

       /*  == [ Double equal symbol ] compares the references of Objects i.e memory location address


*      .equals() [dot equal() ] method will do the value comparison
**/
    }

}
