package com.matrix.nikhil.java.exceptionHandling;

import org.testng.annotations.Test;

public class ExceptionTest {
    @Test
    public void get(){
        int a=10;
        int b=30;
        int sum=a+b;
        System.out.println(sum);

    }
    @Test
    public void get1() {
        int a = 10;
        int b = 0;
        try {
            int sub = a / b;
            System.out.println(sub);
        } catch (Exception  ex) {
            ex.printStackTrace();
            System.out.println("Exception Will Occur");


        }

    }
    @Test
    public void get2(){
        int a=10;
        int b=30;
        int div=a/b;
        System.out.println(div);

    }
    @Test
    public void get3(){
        int a=10;
        int b=30;
        int mutl=a+b;
        System.out.println(mutl);

    }

    @Test
    public void get5() {

        try {
            int c=20;
            int d=98;
            d=c-d*c;
            System.out.println(d);
        } catch (Exception  ex) {
            ex.printStackTrace();
            System.out.println("Exception Will Occur");


        }

    }
}
