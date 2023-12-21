package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {

        System.out.println("Enter a No :");

        Scanner sc=new Scanner(System.in);

        int no=sc.nextInt();

        boolean prime=true;

        for (int i=2;i<no;i++){
            if(no%i==0){
                prime=false;
                break;
            }

        }
        System.out.println(prime);


        if (prime==true){
            System.out.println(+no+" is  A Prime No");
        }
        else {
            System.out.println(+no+" is  not  A Prime No");
        }
    }
    }


