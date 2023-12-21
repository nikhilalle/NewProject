package com.matrix.nikhil.praticesProgram.dailyPrograms;

import java.util.Scanner;

public class ArraysT {

    public static void main(String[] args) {

        int i,j,s,k;

        int a[]=new int[10];
        for(k=0;k<a.length;k++){
            System.out.println("Enter 10 Numbers :- ");
            Scanner num=new Scanner(System.in);
            a[k]=num.nextInt();
        }
//        for(int w:a){
//
//            System.out.println(w);
//        }
        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                }
            }
            for (int index:a){
                System.out.println(index);

            }
        }

        j=a.length-3;
        System.out.println("-------------------");
        System.out.println(a[j]);

    }

}
