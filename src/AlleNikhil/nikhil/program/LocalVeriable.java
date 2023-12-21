package com.matrix.nikhil.program;

public class LocalVeriable {
    int w = 50;
    int z = 100;
    static int s = 50;
    static int t = 65;

    public void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        System.out.println(w + z);
        System.out.println(s + t);
    }

    public static void mult() {
        int c = 10;
        int d = 20;
        int multiply = c * d;
        //int sum=a+b;

        System.out.println(s + t);
    }

    public static void main(String[] args) {
        LocalVeriable veriable = new LocalVeriable();
        veriable.add();
        LocalVeriable.mult();


    }

}
