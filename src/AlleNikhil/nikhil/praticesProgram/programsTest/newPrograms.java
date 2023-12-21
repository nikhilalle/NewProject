package com.matrix.nikhil.praticesProgram.programsTest;

public class newPrograms {
    public static void main(String[] args) {
        int number=131;
        int r;
        int sum=0;
        System.out.println(number);
        int temp=number;
        while (number>0){
            r=number%10;
            number=number/10;
            sum=(sum*10)+r;
        }
        if(temp==sum){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is Not Palindrome ");
        }
            }
}
