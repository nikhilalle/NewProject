package com.matrix.AlleNikhil.programs;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swap2Number {
    @Test
    public void swapNumber() {
        int A = 25;
        int B = 10;
        System.out.println("Value of A   " + A);
        System.out.println("Value of B   " + B);
        A = A + B;  // 35
        B = A - B;  //35-10 = 25
        A = A - B;  // 35-25=10

        System.out.println("Value of A   " + A);
        System.out.println("Value of B   " + B);


    }

    @DataProvider(name = "a")
    public Object[] get() {
        Object o[][] = {
                {12, 23}, {32, 32}
        };
        return o;
    }

    @Test(dataProvider = "a")
    public void set(int a, int b) {
        System.out.println(a);
        System.out.println(b);

    }

    @Test
    public void swap() {
        int a = 20, b = 79;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void stringRev() {
        String name = "Nikhilesh_Alle";
        char ch;
        String str = " ";
        for (int i = 0; i < name.length(); i++) {
            ch = name.charAt(i);
            str = ch + str;
        }
        System.out.println(str);

    }
}
