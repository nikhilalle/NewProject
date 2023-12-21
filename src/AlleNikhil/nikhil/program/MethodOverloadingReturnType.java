package com.matrix.nikhil.program;

public class MethodOverloadingReturnType {}
/**
    static int add(int a, int b) {
        return a + b;
    }

    static double add(int a, int b) {
        return a + b;
    }
 IQ: Can we overload the methods by changing the return types with the same parameters
 (same data type and number of params)?
 No, we can not overload
 In java, method overloading is not possible by changing the return type of the method only because of ambiguity.

 System.out.println(Adder.add(11,11)); //Here, how can java determine which sum() method should be called?


    public static void main(String[] args) {
         MethodOverliadingReturnType.add(50,100); //ambiguity
            OUT-PUT
        //  java: method add(int,int) is already defined in class

        //   com.matrix.AlleNikhil.nikhil.newSelenium.MethodOverloadingReturnType
    }
}
**/



