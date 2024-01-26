package AlleNikhil.NikhilDec;

import org.testng.annotations.Test;



public class RemoveDuplicateChar {
    public static void main(java.lang.String[] args) {

        java.lang.String str = new java.lang.String("AprilAAi");
        java.lang.String t=str.toLowerCase();
        java.lang.String rvs = " ";
        char ch = 0;
        char re = 0;
        java.lang.String[] st = t.split(" ");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            System.out.print(ch);
        }

        }

    }


       // System.out.println("The reverse string is:" + ch);


