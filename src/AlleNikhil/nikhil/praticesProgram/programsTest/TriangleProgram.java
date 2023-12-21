package com.matrix.nikhil.praticesProgram.programsTest;

public class TriangleProgram {
    public static void main(String[] args) {

        int d = 1;
        int k;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= d; k++) {
                System.out.print(" *");
            }
            d++;
            System.out.println();
        }
    }
}
//         OUT-PUT
//             *
//            * *
//           * * *
//          * * * *
//        *  *  *  * *