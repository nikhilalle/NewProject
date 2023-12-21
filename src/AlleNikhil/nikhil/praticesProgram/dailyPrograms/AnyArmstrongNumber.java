package com.matrix.nikhil.praticesProgram.dailyPrograms;

public class AnyArmstrongNumber {
    public static void main(String[] args) {
    int a=1634;
    double sum=0;
    int temp=a;
    int no=a;
    int ln=0;
    int ld;
    while (temp>0){
        temp=temp/10;

        ln=ln+1;
    }

    while (no>0){
        ld=no%10;
        sum=sum+(Math.pow(ld,ln));
        no=no/10;

    }
    if (sum==a){
        System.out.println(" It  is Armstrong Number is "+sum);
    }else
        System.out.println(" It Not Armstrong Number is "+sum);

    }
}
