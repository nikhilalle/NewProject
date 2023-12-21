package com.matrix.nikhil.vishalTestCase;

public class StaticVariableTest {
    int a=20;
    int b=30;
static  int w=23;
static int t=10;
    public void get(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(w);
        System.out.println(t);
        System.out.println("--------------------");
    }
    public static void get2(){
        StaticVariableTest obj=new StaticVariableTest();
        System.out.println(w);
        System.out.println(t);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    public static void main(String[] args) {
        StaticVariableTest obj=new StaticVariableTest();
        obj.get();
        get2();

    }
}
