package com.matrix.nikhil.praticesProgram.corejava.constructor;

public class Class_B  {
  Class_B(){
      //super();
      System.out.println("I am in Class B");
    }
  Class_B(String name){
    //  super("Shri");
      System.out.println("I am in Class B");
        System.out.println(name);
    }
    public static void main(String[] args) {
        Class_B obj=new Class_B();
        new Class_B("Nikhil");
    }
//  private Class_A()
//   private Class_A(String name)
// This two Constructor won't be Use Another Class Because it was Private Access Specifier
    // If We use Extend KeyWord Then it was Invoked Super Key But Class_A Constructors are Private We Can't Invoked in this Class_B

    //  Soo.. we can not create an Object of that class outside of it. if we  create a private constructor..

}
