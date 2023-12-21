package com.matrix.nikhil.praticesProgram.programsTest;

public class ReveseStringArray {
    public static void main(String[] args) {
        String [] str={"Nikhilesh","is","my","name"};
        System.out.println(str.length);

        for (int i= str.length-1;i>=0;i--) {
            System.out.print("  "+str[i]);

        }

    }
}
