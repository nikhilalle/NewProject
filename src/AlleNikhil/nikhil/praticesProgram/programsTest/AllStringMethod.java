package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Locale;

public class AllStringMethod {
    public static void main(String[] args) {
        String str="Nikhilesh";
        String str1="Alle";

        String str2="    Shriniwas Alle     ";

        System.out.println(str);
        System.out.println(str1);

        System.out.println("Two String Add : "+str.concat(" "+str1));
        System.out.println(str==str1);
        System.out.println(str.equals(str));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str1.toLowerCase(Locale.ROOT));
        System.out.println(str.toCharArray());
        System.out.println(str.length());
        System.out.println(str.replace('e','i'));

        System.out.println(str.replaceAll("Nik","Aik"));
      //  System.out.println(str.split("  "));
        System.out.println(str.indexOf('k'));
        System.out.println(str.indexOf("les"));
        System.out.println(str.endsWith("esh"));
        System.out.println(str.startsWith("Nik"));
        /* N i k h i l e s h
           0 1 2 3 4 5 6 7 8
         */
        System.out.println(str.substring(3,6)); // hil
        System.out.println(str.substring(3));  // hilesh
        System.out.println(str.subSequence(2,7)); // khile
        System.out.println(str.substring(0,9));
        System.out.println(str.lastIndexOf('e')); // 6
        System.out.println(str.lastIndexOf("le")); //5
        System.out.println(str.lastIndexOf('k',5)); //2
        System.out.println(str.lastIndexOf("ik",6)); //1
        System.out.println("Alle to  "+str1.replaceFirst("Al","Ni"));
        System.out.println(str.isEmpty());  // False
        System.out.println(str2);
        System.out.println(str2.trim());  // White Space Removed
    }
}
