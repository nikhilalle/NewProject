package com.matrix.nikhil.java.corejava.Constructor;

public class Constructor1 {
    int rollNo;
    String name;
    public Constructor1(){
        System.out.println("I Am in Non-Para-Constructor");
    }
    public Constructor1(int rollNo,String name){
        System.out.println("I am Para-Constructor");

        System.out.println("Roll No:"+rollNo);
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        new Constructor1();
        new Constructor1(102,"Shri");
        new Constructor1(103,"Nikhil");

    }
}
