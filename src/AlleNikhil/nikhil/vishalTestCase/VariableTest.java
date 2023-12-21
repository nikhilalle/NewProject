package com.matrix.nikhil.vishalTestCase;

public class VariableTest {
    int a=20;
    int b=30;
    int c=40;
    int r=89;
    int t=90;
    public void get(){
        int x=10;
        int w=40;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
        System.out.println(x);
        System.out.println(w);
        System.out.println("------------------");
    }
    public void details(){
//        System.out.println(x);
//        System.out.println(w);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
         public static void main(String[] args) {
       VariableTest obj=new VariableTest();
      obj.get();
      obj.details();

    }

        VariableTest() {
        String name="Vishal";
        String  surName="Chilveri";
        System.out.println(name);
        System.out.println(surName);
    }

}
