package com.matrix.nikhil.program;

public class ReturnType {
    public void set(int roll,String name){
    System.out.println("Roll No :"+roll);
    System.out.println("Name :"+name);
}
    public void set(String name,int roll,int id){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
    }

    public static void main(String[] args) {
        ReturnType tr=new ReturnType();
        tr.set(101,"Snheal");
        tr.set("Amol",54,9);
    }
}
