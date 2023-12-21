package com.matrix.nikhil.praticesProgram.programsTest;

public class ReverseString {
    public static void main(String[] args) {
        String name="Nikhilesh";
        char ch;
        String str=" ";
        System.out.println(name );
        System.out.println("Length of Name :"+name.length());
        //System.out.println(name.length());
        for (int i=name.length()-1;i>=0;i--){

           ch=name.charAt(i);
           str=str+ch;
            ;
        }
        System.out.println(str);
}
    }