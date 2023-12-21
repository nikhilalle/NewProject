package com.matrix.nikhil.praticesProgram.programsTest;

import java.util.Arrays;

public class ArrayLargestTest {


        public static void main(String[] args) {
            int[] arr = {12, 89, 76, 23, 43, 34, 67, 90, 76, 100};
            System.out.println(arr.length);
            Arrays.sort(arr);                       // [12, 23, 34, 43, 67, 76, 76, 89, 90, 100]
            System.out.println(Arrays.toString(arr));
            int max = arr[arr.length - 3];         // 89

            // int index =arr[max];
            // System.out.println(index);

            System.out.println(max);

        }
    }


