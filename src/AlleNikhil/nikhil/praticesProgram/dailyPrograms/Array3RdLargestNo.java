package com.matrix.nikhil.praticesProgram.dailyPrograms;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Array3RdLargestNo {
    @Test
    public  static void get1(){
        int i,j,s = 0;
        int arr[]={12,32,45,54,56,98,90,87,120,65};

        System.out.println("lenth of Array " +arr.length);

        for(i=0;i<arr.length-1;i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }
        System.out.println("Elements of Accending array: ");
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }

        j=arr.length-3;
        System.out.println();
        System.out.println("3rd Largest Array "+arr[j]);
    }



    @Test
    public void get2(){
        int i,j,s;
        int array[]=new int[12];
        System.out.println("Enter Nos : ");
        Scanner num=new Scanner(System.in);
        int a  =num.nextInt();
        for(i=0;i<a;i++){

        }
    }


    @Test
    public void get3(){
        int i,j,s;
        int a[]={12,32,34,54,56,56,78,98,789,120,768};

        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                }
            }
        }
        j=a.length-3;
        System.out.println(a[j]);
    }

    @Test
    public void get(){
        int i,j,s,k;
        int a[]=new int[10];
        for(k=0;k<a.length-1;k++){
            System.out.println("Enter 10 Numbers :- ");
            Scanner num=new Scanner(System.in);
            a[k]=num.nextInt();
        }
        for(i=0;i<a.length-1;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                }
            }

            j=a.length-3;
            System.out.println(a[j]);
        }
    }
}
