package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringArrayReverse {
    public static void main(String[] args) {
        String str = new String("My Name is Nikhilesh");

        System.out.println("Name :"+str);

        System.out.println(str.length());

        String [] st = str.split(" ");
        System.out.println(st.length);
        for (int i = st.length - 1; i>=0; i--) {
            System.out.println(" " +st[i]);
        }

    }
    @Test
    public void get(){
        String str=new String("Nikhilesh");
        String []s1=str.split(" ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(s1[i]);
        }
    }
}

