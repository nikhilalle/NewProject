package com.matrix.nikhil.java.corejava.variables;

public class VariableProgram2 {
    public String name="Shri";
    public String name1="Nikhil";
    public static String surname="Alle"; //Static Variable

    public void get(){
        System.out.println("Name :"+name);
        System.out.println("Sur-Name :"+VariableProgram2.surname); //Static Variable
        System.out.println("Name :"+name1);
        System.out.println("Sur-Name :"+VariableProgram2.surname); //Static Variable
    }

    public static void main(String[] args) {
        VariableProgram2 obj=new VariableProgram2();
        obj.get();
    }
}
