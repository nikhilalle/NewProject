package com.matrix.nikhil.praticesProgram.programsTest;

public class String5 {
    public static void main(String[] args) {
        String str = new String("My name is Nikhilesh A");

        System.out.println("Name " + str);

        System.out.println(str.length());

        String[] st = str.split(" ");
        System.out.println(st.length);
        for (int i = st.length - 1; i >= 0; i--) {
            System.out.println(" " + st[i]);
        }
        System.out.println();
    }
}
