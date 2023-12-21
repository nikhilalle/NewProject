package com.matrix.nikhil.praticesProgram.programsTest;

public class BubbleSort {
    public static void main(String[] args) {

        int a[]={45, 34, 65, 75, 98, 4};  //or else u can use direct array
        int temp;
        for(int i=0;i<a.length;i++)//Rounds
        {
            int flag=0;
            for(int k=0;k<a.length-1;k++)    //array elements compairing and swap using 3rd variable
            {
                if(a[k]>a[k+1])
                {
                    temp=a[k];
                    System.out.println("Temp "+temp);
                    a[k]=a[k+1];
                    System.out.println("a th 1st "+a[k]);
                    a[k+1]=temp;
                    System.out.println("a th 2 nd "+a[k+1]);
                    flag=1;
                }
            } //Round of i
//flag is using for if numbers are sored before completing the round then it will break the for loop of i
            if(flag==0){
                break;
            }
        }
        System.out.println("sorted elements are :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
