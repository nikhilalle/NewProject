package com.matrix.nikhil.praticesProgram.programsTest;

public class TestStringAll {
    public static void main(String[] args) {
        String str1 = new String("Nikhilesh");
        String str2 = new String("Nikhilesh");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("String Check :" + str1 == str2);

        System.out.println("String Address Str1 :" + System.identityHashCode(str1)); //String Address Str1 :460141958

        System.out.println("String Address Str2 :" + System.identityHashCode(str2)); // String Address Str2 :1163157884

        String str3 = "Nikhil";
        String str4 = "Nikhil";
/* In This case Str 1 has Using Object Creation so its address is Different then Str2 Because Whenever we can create
* String By Using Object Way the so Every obj has Different Memory Address.    And
* By Using literal way address Should be Same Because String Constant Pool can not have duplicate objects they can allocate
 same memory address

 * By using Object way
String str = new String(“Shriniwas”);

By using String literal

String str = “Shriniwas”;

String Address Str1 :460141958

String Address Str2 :1163157884

String Address Str3 :1956725890

String Address Str4 :1956725890

            Hear Str 3 & Str 4 Address is Same
**/
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("String Address Str3 :" + System.identityHashCode(str3)); //String Address Str3 :1956725890

        System.out.println("String Address Str4 :" + System.identityHashCode(str4)); // String Address Str3 :1956725890


    }
}
