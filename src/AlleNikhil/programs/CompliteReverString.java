package com.matrix.AlleNikhil.programs;

import org.testng.annotations.Test;

public class CompliteReverString {
    public static void main(String[] args) {

        String str = new String("My name is Nikhilesh Alle I am from Solapur");

        String rvs = " ";
        char ch;
        System.out.println();
        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            rvs = ch + rvs;

        }
        System.out.println("The reverse string is:            " + rvs);

    }


@Test
    public void get(){
        String str=new String("Nikhil is my Name");

        char  ch;
        String rvs=" ";
         for(int i=0;i<str.length();i++){
             ch=str.charAt(i);
             rvs=ch+rvs;
         }
    System.out.println(rvs);
}
// Out Put :  emaN ym si lihkiN
    @Test
    public void m2(){
        String nt="My self ragav";
        char ch;
        String rt=" ";
        for(int i=0;i<nt.length();i++){
            ch=nt.charAt(i);
            rt=ch+rt;

        }
        System.out.println(rt);
    }
    @Test
    public void get1(){
        String str="My name Nikhil Friend of Sid";
        String [] st=str.split(" ");
         for(int i=st.length-1;i>=0;i--){
             System.out.println(st[i]);
         }
    }
}
