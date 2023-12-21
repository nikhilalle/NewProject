package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FactorialNoProgram {
    @Test
  public void Get(){
        int fact=1;
        int no=12;
        for(int i=1;i<=no;i++){
            fact=fact*i;

        }
        System.out.println("Fact No is "+fact);
    }

    @Test
    public void get1(){
        int fact=1;int n=10;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }
    @Test(priority = -8)
    public void get3(){
        System.out.println("Enter No  ");
        Scanner number=new Scanner(System.in);
        int n=number.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("Factorial No is " +fact);
    }
}
