package com.matrix.nikhil.praticesProgram.programsTest;

import org.testng.annotations.Test;

public class Star_Programs {

    @Test
    public void get1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                  System.out.println();
            for (int k = 1; k <= 5; k++) {
                for (int x = 1; x <= k; x++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

    @Test
    public void get6() {
        int i, j, s, d = 1, k = 8;
        for (i = 1; i <= 5; i++) {
            for (s = 1; s <= d; s++) {
                System.out.print("*");
            }
            for (j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            for (s = 1; s <= d; s++) {
                System.out.print("*");
            }
            k = k - 2;
            d++;
            System.out.println();
        }
    }

    @Test
    public void get3() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    @Test
    public void get2() {
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    public void get4() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print("*");
        }
    }

    @Test
    public void starSymbol() {
        int perColStar = 1;
        int col = 10;
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (perColStar >= j || col - perColStar < j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            perColStar++;
            System.out.println();
        }
    }
}