package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

public class StringArrayReturn {
    public static void main(String[] args) {

        String[] str = {"Nikhil", "Alle"};

        System.out.println(str.length);
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println("  " + str[i]);
        }
    }
    public void StringRv1(){
        String str=("My name is Nikhilesh");
        String [] st = str.split(" ");
        for(int i=st.length-1;i>=0;i--){
            System.out.println(st[i]);
        }
    }
    public void get()
    {
        String str = new String("My Name is Nikhilesh");
        String [] st = str.split(" ");
        System.out.println(st.length);
        for (int i = st.length - 1; i>=0; i--) {
            System.out.println(" " +st[i]);
        }

    }
    @Test
    public void set(){
            String str="Nikhilesh";
            char ch;
            String st=" ";
            for (int i=str.length()-1;i>=0;i--){

                ch=str.charAt(i);
                str=str+ch;

            }
        System.out.println();
            System.out.println(st);
        }
    }
