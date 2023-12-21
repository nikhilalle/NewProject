package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Scanner;

public class NoPrimePratice {

        public static void main(String  []args){
             System.out.println("Enter No :");
             Scanner number=new Scanner(System.in);
            int no=number.nextInt();

            int i,j,count;
            for(i=1;i<=no;i++){
                count=0;
                for(j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2)
                {
                    System.out.println(i+"  is Prime No");
                    //  System.out.println
                }
                else{
                    System.out.println("-----------------------------");
                    System.out.println(i+"  is Not Prime No");
                }
            }
        }
    }

