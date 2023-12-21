package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

public class RevString {
    @Test
    public void str() {
        String str = "Shriniwas";
        String stp = "  ";
        char chr;

        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            stp = chr + stp;
        }
        System.out.println("Reverse :" + stp);
    }
@Test
    public void st() {
        String str = new String("My Name is Nikhilesh");

        String [] st = str.split(" ");

        System.out.println(st.length);
        for (int i = st.length - 1; i>=0; i--) {
            System.out.println(" " +st[i]);
        }
    }
    @Test
    public void stringReverse1(){
        String name="Nikhilesh";
        String str=" ";
        char ch;
        for(int i=0;i<name.length()-1;i++){
            ch=name.charAt(i);
            str=ch+str;
        }
        System.out.println(str);
    }
}
