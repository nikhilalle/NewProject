package com.matrix.nikhil.praticesProgram.dailyPrograms;

import org.testng.annotations.Test;

public class ReverseString {
    @Test
    public void stringReverse(){
        String name="My Name is Nikhilesh";
        String [] str=name.split(" ");
        System.out.println(name);
        for(int i=str.length-1;i>=0;i--){
            System.out.print("  "+str[i]);
        }
    }
    @Test
    public void stringReverse1(){
        String name=("My Name is Nikhilesh");
        String [] str=name.split(" ");
        System.out.println(name);
        for(int i=str.length-1;i>=0;i--){
            System.out.print("  "+str[i]);
        }
    }

    @Test
    public void stringReverse12(){
        String name=("Nikhilesh");
        String [] str=name.split(" ");
      //  System.out.println(name);
        for(int i=str.length-1;i>=0;i--){
            System.out.print("  "+str[i]);
        }
    }

}
