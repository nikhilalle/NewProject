package com.matrix.nikhil.praticesProgram.corejava.encapsulation;

public class StudentClass {
    public static void main(String[] args) {
        TestStudent stud=new TestStudent();
        stud.get1(501); // Roll NO 121

        stud.get2("Shruti");  // Name Nikhil

        /** This is Private Variable the value we can't change its Value we can use only.
         * We don't  Internal Implantation/ Internal Logics
         * Implantation is Hide for User. We can use her data types only Value Should not Change
         * i.e Roll No 121 is Private varfable Value we can't change as its value to new Value 501 & Name also it'
         **/

       // stud.details();


        /** OutPut is
         * Roll NO 121
         * Name Nikhil
         */


    }
}
