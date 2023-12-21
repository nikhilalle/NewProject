package com.matrix.nikhil.program;

public class ReverStringTest {
    public static void main(String[] args) {

        String str = new String("April");

        String rvs = " ";
        char ch;

        String[] st = str.split(" ");


        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            rvs = ch + rvs;

        }
        System.out.println("The reverse string is:" + rvs);

    }


}
