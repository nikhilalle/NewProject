package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Scanner;

public class PrimeNoUsingCount {
    public static void main(String [] args){
        System.out.println("Enter No :  ");
        Scanner number=new Scanner(System.in);
        int n= number.nextInt();
       int count=0;
       int i;

        for (i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is Prime-No :  " +n);
        }
else {
            System.out.println("It is Not Prime-No :  " +n);
        }
    }
}
