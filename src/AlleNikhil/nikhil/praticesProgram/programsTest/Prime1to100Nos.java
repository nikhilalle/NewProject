package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Scanner;

public class Prime1to100Nos {
    public static void main(String []args){
        System.out.println("Enter No : ");
        Scanner num=new Scanner(System.in);
        int no= num.nextInt();
        int i,j,count;
        for(i=1;i<=no;i++) {
            count = 0;
            for (j = 1; j <= no; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("    " + i + " it is Prime Number  ");

            } else {
                System.out.println("--------------------------------------");
                System.out.println("    " + i + " it is  Not Prime Number  ");
            }
        }
    }
}
