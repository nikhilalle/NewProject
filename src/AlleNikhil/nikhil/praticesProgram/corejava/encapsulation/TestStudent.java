package com.matrix.nikhil.praticesProgram.corejava.encapsulation;

public class TestStudent {
    private int rollNo = 121;
    private String name = "Nikhil";

    public int get1(int rollNo) {
        return rollNo;
    }
    public String get2(String name) {
        return name;
    }
    public void set1(int rollNo) {
        this.rollNo = rollNo;
    }
    public void set2(String name) {
        this.name = name;
    }
    public void details() {
        System.out.println("Roll NO " + rollNo);
        System.out.println("Name " + name);
    }

}
