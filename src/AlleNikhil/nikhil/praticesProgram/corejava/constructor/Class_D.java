package com.matrix.nikhil.praticesProgram.corejava.constructor;

public class Class_D extends Class_C {
    Class_D(){
        super();
        System.out.println("I am in Class Class_D");
    }
    Class_D(String name){
          super("Shri");
        System.out.println("I am in Class Class_D");
        System.out.println(name);

    }
    /**
    static Class_D(int roll){

        System.out.println("I am in  Static Constructor Class_D");
    }
     we can't Create Static Constructor
     **/
    public static void main(String[] args) {
        new Class_D();
        new Class_D("Nikhilesh");
    }
}
