package com.matrix.nikhil.praticesProgram.corejava.constructor;

public class Class_C {
       protected Class_C(){
            //super();
            System.out.println("I am in Class Class_C");
        }
       protected Class_C(String name){
            //  super("Shri");
            System.out.println("I am in Class Class_C");
            System.out.println(name);
        }
        public static void main(String[] args) {
            new Class_C();
            new Class_C("Nikhil");
        }
}
