package com.matrix.nikhil.praticesProgram.corejava.constructor;

public class Class_A {

    private Class_A(){
        System.out.println("I am in Class A");
    }
    private Class_A(String name){
        System.out.println("I am in Class A");
        System.out.println(name);
    }
    public static void main(String[] args) {
      new Class_A();
      new Class_A("Nikhilesh");
    }
}
//  private Class_A()
//   private Class_A(String name)
// This two Constructor won't be Use Another Class Because it was Private Access Specifier