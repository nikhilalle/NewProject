package com.matrix.nikhil.praticesProgram.corejava.encapsulation;

public class MathsCall {
    public static void main(String[] args) {
        Maths m=new Maths();
        int a=m.add(50,60);
        int b=m.mul(50,60);
        int c=m.sub(50,60);
        int d=m.div(50,60);

        System.out.println("Addiction x=   "+a+"   Mult "+b);
        System.out.println("Substraction  x=   "+c+"  Divsion "+d);
    }
}
