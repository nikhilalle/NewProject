package com.matrix.nikhil.praticesProgram.programsTest;

public class SwapTheNo {
    SwapTheNo(int a,int b){
        System.out.println(" Value of A is  "+a+"    Value of B is  "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(" After Swaping Value of A is  "+a+"    Value of B is  "+b);
    }
    public static void main(String[] args) {
     new SwapTheNo(10,20);
     new SwapTheNo(20,50);

    }
}
