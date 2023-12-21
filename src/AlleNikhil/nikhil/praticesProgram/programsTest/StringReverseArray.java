package com.matrix.nikhil.praticesProgram.programsTest;

public class StringReverseArray {
    public static void main(String[] args) {
        String str=new String("My name is Nikhilesh A");

        System.out.println(str.length());
        System.out.println("Correct Name :  "+str);

        String [] st=str.split(" ");
        System.out.println(st);
        System.out.println(st.length);
        for (int i=st.length-1;i>=0;i--){
            System.out.println("Reverse String : "+st[i]);
        }
    }
}
