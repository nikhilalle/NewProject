package com.matrix.nikhil.java.newJava.Methods;

public class SimpleMethod {
    public void get(){
        System.out.println("I am in Get Method");
    }
    public void set(String name,int roll){
        System.out.println(roll);
        System.out.println(name);
    }
    public void m1(String company,int job_id,String designation){
        System.out.println(job_id);
        System.out.println(company);
        System.out.println(designation);
    }
    public void details(String name,String company,int job_id,String designation){
        System.out.println(name);
        System.out.println(company);
        System.out.println(job_id);
        System.out.println(designation);
    }

    public static void main(String[] args) {
        SimpleMethod obj=new SimpleMethod();
        obj.get();
        obj.m1("TCS",501,"Testing");
        obj.set("Nikhil",2022);
        obj.details("Nikhil","TCS",101,"MRM");
        obj.details("Shri","Wipro",102,"SRM");
        obj.details("Shruti","TCS",103,"FRM");
        obj.details("Anu","Novartis",104,"FRM");
        obj.details("Avanti","Capgimini",105,"TRM");
    }

}
