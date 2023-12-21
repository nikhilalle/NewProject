package com.matrix.nikhil.praticesProgram.dailyPrograms;

public class ArmstrongNo {
    public static void main(String[] args) {
    int n =1634;
    int r;
    int sum=0;
    int temp;
    int length=0;
    int t1=n;

        temp=n;

        while (t1>0){
        t1=t1/10;

        length=length+1;
}
        System.out.println("length of No : "+n+"  is " +length);

        while (n>0)
    {
        r=n%10;

        sum=sum+(r*r*r*r);


        n=n/10;

    }
if(temp==sum)
    System.out.println("armstrong  number "+sum);
else
        System.out.println("not armstrong number"+sum);

}
    }
