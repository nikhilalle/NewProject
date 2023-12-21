package com.matrix.nikhil.java.newJava.Methods;

public class Chain {
    public void get(){
        details();
        System.out.println("I am In Get Method");
    }
    public void details(){
        System.out.println("I am in Details");
        set1();
    }
    public void set1(){
        System.out.println("I am in set1");
        set2();
    }
    public void set2(){
        System.out.println("I am in set2");
        set3();
    }
    public void set3(){
        System.out.println("I am in set3");
    }

    public static void main(String[] args) {
        Chain obj=new Chain();
        obj.get();
    }
}
