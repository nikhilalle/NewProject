package com.matrix.nikhil.program;

public class InstanceVeriable {
        int w=50;
        int z=100;
        public void add() {

            System.out.println(w + z);
        }
        public  void mult(){
            System.out.println(w*z);

        }

    public static void main(String[] args) {
        InstanceVeriable veriable=new InstanceVeriable();
        veriable.add();
        veriable.mult();
    }
}
