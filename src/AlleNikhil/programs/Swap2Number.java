package com.matrix.AlleNikhil.programs;

import org.testng.annotations.Test;

public class Swap2Number {
    @Test
    public void swapNumber(){
        int A=25;
        int B=10;
        System.out.println("Value of A   "+A);
        System.out.println("Value of B   "+B);
        A=A+B;  // 35
        B=A-B;  //35-10 = 25
        A=A-B;  // 35-25=10

        System.out.println("Value of A   "+A);
        System.out.println("Value of B   "+B);


    }
}
