package com.matrix.nikhil.program;

public class StaticVeriable {
    static int w = 50;
    static int z = 100;

    public void add() {


        System.out.println(w + z);
    }

    public static void mult() {

        System.out.println(w * z);

    }

    public static void main(String[] args) {
        StaticVeriable veriable = new StaticVeriable();
        veriable.add();
        StaticVeriable.mult();

    }
}
