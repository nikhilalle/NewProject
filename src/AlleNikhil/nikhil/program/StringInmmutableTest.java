package com.matrix.nikhil.program;

import java.util.Locale;

public class StringInmmutableTest {
    public static void main(String[] args) {
        String str1="Snehal ";
       String str= str1.concat("Sharma");
        System.out.println("--------------------");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
        System.out.println("--------------------");
        System.out.println(str1);
        System.out.println(str);
        String str2="Aishwarya ";
        String str3="Nikhilesh";
        String str4="Snehal ";
        String str5="SNEHAL";
        String str6="AishWarya ";
        System.out.println(str1==str4); // True
        System.out.println(str1.substring(1,4));


        System.out.println("--------------------");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("Address "+System.identityHashCode(str1));  // Address 492228202   str1="Snehal ;
        System.out.println("Address "+System.identityHashCode(str4));   //Address 492228202   str4="Snehal ;

        System.out.println("Address "+System.identityHashCode(str5));   //Address 1368884364  str5="SNEHAL" ;
        System.out.println("Address "+System.identityHashCode(str2));   // Address 401625763  str2="Aishwarya ";
        System.out.println("Address "+System.identityHashCode(str6));   // Address 772777427  str6="AishWarya ";

        System.out.println("--------------------");
        System.out.println(str5.toLowerCase(Locale.ROOT));
        System.out.println(str2.toUpperCase(Locale.ROOT));
        System.out.println(str3.concat("   Alle"));
        System.out.println(str1.concat("   Chatur"));
        System.out.println(str2.concat("   Sayagoan"));
        System.out.println(str2.concat(str1));
        System.out.println("--------------------");
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str6));










    }
}

