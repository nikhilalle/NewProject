package com.matrix.nikhil.java.corejava.interFace;

public class Class_C implements Class_A,Class_B {
    public void m1() {
        System.out.println("I am M1  Method");

    }

    public void m2() {
        System.out.println("I am M2  Method");
    }

    public static void main(String[] args) {
        Class_A a=new Class_C();
        a.m1();
        Class_B b=new Class_C();
        b.m2();
    }

}
