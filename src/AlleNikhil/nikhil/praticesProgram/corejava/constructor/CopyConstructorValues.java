package com.matrix.nikhil.praticesProgram.corejava.constructor;

public class CopyConstructorValues {
    int age;
    String name;

    CopyConstructorValues(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(age);
        System.out.println(name);
    }
    CopyConstructorValues(CopyConstructorValues obj) {


    }

    public void getDetails() {
        System.out.println("Age:" + age);
        System.out.println("Name:" + name);
    }

    public static void main(String[] args) {
        CopyConstructorValues obj1 = new CopyConstructorValues(32, "Shikha");
        CopyConstructorValues obj2 = new CopyConstructorValues(obj1);  // Copy Constructor
        obj2.getDetails();
    }
}
